package gist.unican.com.encuestaapp.ui.Survey;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.BusStopsAsignation.BusAsignation;
import gist.unican.com.encuestaapp.domain.DataPersistance.RestoreFromLocalDatabase;
import gist.unican.com.encuestaapp.domain.DataPersistance.SaveInLocalDatabase;
import gist.unican.com.encuestaapp.domain.Utils.Utils;
import gist.unican.com.encuestaapp.domain.model.BusLinesObjectItem;
import gist.unican.com.encuestaapp.domain.model.BusStopObject;
import gist.unican.com.encuestaapp.domain.model.BusStopObjectItem;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesItem;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesObjectCard;
import gist.unican.com.encuestaapp.domain.model.SurveyObjectSend;
import gist.unican.com.encuestaapp.domain.model.SurveyQualityVariablesItem;
import gist.unican.com.encuestaapp.ui.Survey.SurveyList.SurveyAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class SurveyFragment extends Fragment implements SurveyAdapter.OnItemsSelectedInListener {
    @Nullable
    @BindView(R.id.content)
    RelativeLayout content;
    @Nullable
    @BindView(R.id.survey_recycler_view)
    RecyclerView surveyRecyclerView;
    @Nullable
    @BindView(R.id.floatingNext)
    FloatingActionButton nextButton;
    @Nullable
    @BindView(R.id.floatingFinish)
    FloatingActionButton saveButton;
    @Nullable
    @BindView(R.id.error_layout)
    LinearLayout error;
    @Nullable
    @BindView(R.id.loading_layout)
    LinearLayout loading;
    int numeroDeVecesQueSePresionaUnaTarjeta = 0;

    //local db
    private RestoreFromLocalDatabase restoreFromLocalDatabase = new RestoreFromLocalDatabase();
    private SaveInLocalDatabase saveInLocalDatabase = new SaveInLocalDatabase();

    //Objetos con las variables de la encuesta
    private List<SurveyGeneralVariablesItem> generalVariablesItemList = new ArrayList<>();
    private List<SurveyQualityVariablesItem> qualityVariablesItemList = new ArrayList<>();

    //Usuario Linea y hora para insertar en la db
    private String usuario = "";
    private String dateTime = "";
    private String linea = "";


    //objeto que se enviará al final a la db
    private SurveyObjectSend surveyObjectSend = new SurveyObjectSend();

    //Utils
    private Utils utilidades = new Utils();

    //lista de paradas para la linea elegida y de lineas
    private List<BusStopObjectItem> listaParadas = new ArrayList<>();
    private List<BusStopObjectItem> listaTodasParada = new ArrayList<>();
    private List<String> listaParadasString = new ArrayList<>();
    private List<BusLinesObjectItem> listaLineas = new ArrayList<>();
    private List<String> listaLineasString = new ArrayList<>();

    //Asignbador de paradas a lineas
    private BusAsignation busAsignation = new BusAsignation();

    //listados
    private LinearLayoutManager layoutManager;
    private SurveyAdapter adapterList;

    //variable para mostrar en primer lugar las variables generales
    private Boolean variablesGenerales = true;


    public SurveyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_survey, null);
        ButterKnife.bind(this, view);
        //recuperar de la local db las preguntas
        try {
            generalVariablesItemList = restoreFromLocalDatabase.generalVariables();
            qualityVariablesItemList = restoreFromLocalDatabase.qualityVariables();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //ll manager
        surveyRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        surveyRecyclerView.setLayoutManager(layoutManager);

        //recuperamos hora, usuario y linea de las shared preferences
        usuario ="usuario acordarse de cambiarlo por preferencias";
        Calendar now = Calendar.getInstance();
        int mes = now.get(Calendar.MONTH) + 1;
        dateTime = now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ";" + now.get(Calendar.DAY_OF_MONTH) + "/" + mes + "/" + now.get(Calendar.YEAR);
        linea = utilidades.getBusLineFromPreferences(getContext());
        String lineaSublineaSentido[] = linea.split(";");

        //obtenemos las paradas de la lista para los spinners necesarios para la linea elegida en la pantalla anterior
        try {
            listaTodasParada = restoreFromLocalDatabase.busStops();
        } catch (Exception e) {
            e.printStackTrace();
        }
        BusStopObject stopObject = new BusStopObject();
        stopObject.setResources(listaTodasParada);
        listaParadas = busAsignation.stopsLine(lineaSublineaSentido[0], stopObject);
        listaParadas = busAsignation.stopsBySublineAndWay(listaParadas, lineaSublineaSentido[1], lineaSublineaSentido[2]);
        //guardamos las paradas de la linea en ela lista de string
        for (BusStopObjectItem busStop : listaParadas) {
            listaParadasString.add(busStop.getAytoNombreParada());
        }
        //guardamos la lista de lineas
        try {
            listaLineas = restoreFromLocalDatabase.busLines();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (BusLinesObjectItem busLine : listaLineas) {
            listaLineasString.add(busLine.getAytoNumero());
        }


        //barajamos las variables específicas y guardamos el grupo en cada una
        List<SurveyQualityVariablesItem> variablesOrdenadas = barajarLasVariables(qualityVariablesItemList);
        qualityVariablesItemList = variablesOrdenadas;

        //mostramos las variables aqui hay que distinguir 2 casos, primero de golpe todas las variables generales, y luego de forma aleatoria las variables de calidad
        showList(generalVariablesItemList, variablesOrdenadas);
        return view;

    }

    private void showList(List<SurveyGeneralVariablesItem> generalVariablesItemList, List<SurveyQualityVariablesItem> variablesOrdenadas) {
        //en primer lugar las variables generales

        if (variablesGenerales) {
            List<SurveyGeneralVariablesObjectCard> tarjetasParaMostrar = new ArrayList<>();
            for (SurveyGeneralVariablesItem generalVariableItem : generalVariablesItemList) {
                SurveyGeneralVariablesObjectCard tarjeta = null;
                switch (generalVariableItem.getITEMS()) {
                    case "999":
                        break;
                    case "998":
                        break;
                    case "997":
                        tarjeta = new SurveyGeneralVariablesObjectCard(generalVariableItem.getNOMBRE(), false, 0, null, generalVariableItem.getAbreviatura(), true, listaLineasString);
                        tarjetasParaMostrar.add(tarjeta);
                        break;
                    case "996":
                        break;
                    case "995":
                        tarjeta = new SurveyGeneralVariablesObjectCard(generalVariableItem.getNOMBRE(), false, 0, null, generalVariableItem.getAbreviatura(), true, listaParadasString);
                        tarjetasParaMostrar.add(tarjeta);
                        break;
                    default:
                        List<List<String>> listaRadios = getListaRadios(generalVariableItem, generalVariablesItemList);
                        Log.d("ITEMS",generalVariableItem.getNOMBRE()+" items:"+String.valueOf(Integer.valueOf(generalVariableItem.getITEMS())));
                        tarjeta = new SurveyGeneralVariablesObjectCard(generalVariableItem.getNOMBRE(), true, Integer.valueOf(generalVariableItem.getITEMS()), listaRadios, null, false, null);
                        tarjetasParaMostrar.add(tarjeta);
                        break;
                }

            }
            adapterList= new SurveyAdapter(getContext(),tarjetasParaMostrar,this);
            surveyRecyclerView.setAdapter(adapterList);
            adapterList.notifyDataSetChanged();
            variablesGenerales = false;
            showContent();
        } else {
            //coje de x en x
        }
    }

    private List<List<String>> getListaRadios(SurveyGeneralVariablesItem generalVariableItem, List<SurveyGeneralVariablesItem> generalVariablesItemList) {
        int posicionEnLista = generalVariablesItemList.indexOf(generalVariableItem);
        int numeroRadiosButtons = Integer.valueOf(generalVariableItem.getITEMS());
        List<List<String>> elementoADevolver = new ArrayList<>();
        for (int i = posicionEnLista+1; i < posicionEnLista + numeroRadiosButtons+1; i++) {
            List<String> elementoAñadir = new ArrayList<>();
            elementoAñadir.add(generalVariablesItemList.get(i).getNOMBRE());
            elementoAñadir.add(generalVariablesItemList.get(i).getAbreviatura());
            elementoADevolver.add(elementoAñadir);
            Log.d("ListaRadios",elementoAñadir.get(0));
        }

        return elementoADevolver;
    }

    private List barajarLasVariables(List<SurveyQualityVariablesItem> surveyQualityVariablesItemList) {
        int numeroElementos = surveyQualityVariablesItemList.size();
        List<SurveyQualityVariablesItem> returnList = new ArrayList<>();
        for (int i = 0; i < numeroElementos; i++) {
            int elemento = (int) Math.floor(Math.random() * surveyQualityVariablesItemList.size());
            returnList.add(surveyQualityVariablesItemList.get(elemento));
            surveyQualityVariablesItemList.remove(elemento);
        }
        return returnList;
    }


    @Override
    public void OnRadioChecked() {
        numeroDeVecesQueSePresionaUnaTarjeta++;
        Log.d("checked",String.valueOf(numeroDeVecesQueSePresionaUnaTarjeta));
    }

    @Override
    public void OnItemSelected(String variableAFijarEn1, String variableADevolverA0) {
         /* SurveyObjectSend sob = new SurveyObjectSend();
                    sob.setAcoBe(1);
                    String variable = "setAcoBe";
                    try {
                        Method metodo = sob.getClass().getMethod(variable, Integer.class);
                        metodo.invoke(1);

                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }*/
    }

    @Override
    public void OnSpinnerSelected(String variableSpinner, String nombreVariable) {
        /* SurveyObjectSend sob = new SurveyObjectSend();
                    sob.setAcoBe(1);
                    String variable = "setAcoBe";
                    try {
                        Method metodo = sob.getClass().getMethod(variable, Integer.class);
                        metodo.invoke(1);

                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }*/
    }


    /**
     * Method used to show error view
     */
    public void showError() {
        content.setVisibility(View.GONE);
        loading.setVisibility(View.GONE);
        error.setVisibility(View.VISIBLE);

    }

    /**
     * Method used to show the loading view
     */
    public void showLoading() {
        loading.setVisibility(View.VISIBLE);
        content.setVisibility(View.GONE);
        error.setVisibility(View.GONE);
    }

    /**
     * Method used to show the listView
     */
    public void showContent() {
        content.setVisibility(View.VISIBLE);
        loading.setVisibility(View.GONE);
        error.setVisibility(View.GONE);
    }
}
