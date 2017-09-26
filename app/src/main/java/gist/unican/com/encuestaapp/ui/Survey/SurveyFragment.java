package gist.unican.com.encuestaapp.ui.Survey;


import android.content.Context;
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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.BusStopsAsignation.BusAsignation;
import gist.unican.com.encuestaapp.domain.DataPersistance.RestoreFromLocalDatabase;
import gist.unican.com.encuestaapp.domain.DataPersistance.SaveInLocalDatabase;
import gist.unican.com.encuestaapp.domain.Utils.Constants;
import gist.unican.com.encuestaapp.domain.Utils.Utils;
import gist.unican.com.encuestaapp.domain.model.BusLinesObjectItem;
import gist.unican.com.encuestaapp.domain.model.BusStopObject;
import gist.unican.com.encuestaapp.domain.model.BusStopObjectItem;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesItem;
import gist.unican.com.encuestaapp.domain.model.SurveyObjectSendItem;
import gist.unican.com.encuestaapp.domain.model.SurveyQualityVariablesItem;
import gist.unican.com.encuestaapp.domain.model.SurveyVariablesObjectCard;
import gist.unican.com.encuestaapp.ui.Survey.SurveyList.OnAllRadioChecked;
import gist.unican.com.encuestaapp.ui.Survey.SurveyList.OnItemsSelectedInListener;
import gist.unican.com.encuestaapp.ui.Survey.SurveyList.SurveyAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class SurveyFragment extends Fragment implements OnItemsSelectedInListener, OnAllRadioChecked {
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

    //listener
    SurveyFragment.onFinishSurvey onFinishSurveyListener;


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
    //ventana
    private String ventana;

    //grupo de tarjetas desordenadas

    int grupo = 0;


    //objeto que se enviará al final a la db
    private SurveyObjectSendItem surveyObjectSendItem = new SurveyObjectSendItem();

    //Utils
    private Utils utilidades = new Utils();

    //lista de paradas para la linea elegida y de lineas
    private List<BusStopObjectItem> listaParadas = new ArrayList<>();
    private List<BusStopObjectItem> listaTodasParada = new ArrayList<>();
    private List<String> listaParadasString = new ArrayList<>();
    private List<BusLinesObjectItem> listaLineas = new ArrayList<>();
    private List<String> listaLineasString = new ArrayList<>();
    private List<String> listaMotivos = new ArrayList<>();
    //Asignbador de paradas a lineas
    private BusAsignation busAsignation = new BusAsignation();

    //listados
    private LinearLayoutManager layoutManager;
    private SurveyAdapter adapterList;

    //variable para mostrar en primer lugar las variables generales
    private Boolean variablesGenerales = true;

    //lista variables ordenadas
    private List<SurveyQualityVariablesItem> surveyQualityVariablesItemsUnordered;
    private int numeroElementosMostrados = 0;

    //elementos de

    public SurveyFragment() {
        // Required empty public constructor
    }

    public interface onFinishSurvey {
        public void loadMainScreen();
    }

    @Override
    public void onAttach(Context context) {
        //give a context to the calls from other activities
        super.onAttach(context);
        if (context instanceof SurveyFragment.onFinishSurvey) {
            onFinishSurveyListener = (SurveyFragment.onFinishSurvey) context;
        } else {
            throw new ClassCastException(context.toString() + " must implements SurveyFragment.onFinishSurvey");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_survey, null);
        ButterKnife.bind(this, view);
        //se oculta el boton de siguiente
        nextButton.setVisibility(View.GONE);
        //motivos de viaje
        listaMotivos.add("casa");
        listaMotivos.add("trabajo");



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
        usuario = "usuario acordarse de cambiarlo por preferencias";
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
        surveyQualityVariablesItemsUnordered = barajarLasVariables(qualityVariablesItemList);


        //identificamos las ventanas
        ventana = "generalVariables";

        //mostramos las variables aqui hay que distinguir 2 casos, primero de golpe todas las variables generales, y luego de forma aleatoria las variables de calidad
        // showQualityVariablesList();

        showList(generalVariablesItemList);

        return view;

    }

    private void showList(List<SurveyGeneralVariablesItem> generalVariablesItemList) {
        //en primer lugar las variables generales

        if (variablesGenerales) {
            listaLineasString.add(0, "Seleccione");
            listaLineasString.add(1,"No uso lineas adicionales");
            listaMotivos.add(0, "Seleccione");
            listaParadasString.add(0, "Seleccione");
            listaParadasString.add(1,"No sabe / No contexta");
            BusLinesObjectItem add= new BusLinesObjectItem();
            List<SurveyVariablesObjectCard> tarjetasParaMostrar = new ArrayList<>();
            for (SurveyGeneralVariablesItem generalVariableItem : generalVariablesItemList) {
                SurveyVariablesObjectCard tarjeta = null;
                switch (generalVariableItem.getITEMS()) {
                    case "999":
                        break;
                    case "998":
                        break;
                    case "997":
                        tarjeta = new SurveyVariablesObjectCard(generalVariableItem.getNOMBRE(), false, 0, null, generalVariableItem.getAbreviatura(), true, listaLineasString, null, 999);
                        tarjetasParaMostrar.add(tarjeta);
                        break;
                    case "996":
                        tarjeta = new SurveyVariablesObjectCard(generalVariableItem.getNOMBRE(), false, 0, null, generalVariableItem.getAbreviatura(), true, listaMotivos, null, 999);
                        tarjetasParaMostrar.add(tarjeta);
                        break;
                    case "995":
                        tarjeta = new SurveyVariablesObjectCard(generalVariableItem.getNOMBRE(), false, 0, null, generalVariableItem.getAbreviatura(), true, listaParadasString, null, 999);
                        tarjetasParaMostrar.add(tarjeta);
                        break;
                    default:
                        List<List<String>> listaRadios = getListaRadios(generalVariableItem, generalVariablesItemList);
                        Log.d("ITEMS", generalVariableItem.getNOMBRE() + " items:" + String.valueOf(Integer.valueOf(generalVariableItem.getITEMS())));
                        List chechedButtons = Arrays.asList(false, false, false, false, false, false, false);
                        tarjeta = new SurveyVariablesObjectCard(generalVariableItem.getNOMBRE(), true, Integer.valueOf(generalVariableItem.getITEMS()), listaRadios, null, false, null, chechedButtons, 999);
                        tarjetasParaMostrar.add(tarjeta);
                        break;
                }

            }
            adapterList = new SurveyAdapter(getContext(), tarjetasParaMostrar, this, this);
            surveyRecyclerView.setAdapter(adapterList);
            adapterList.notifyDataSetChanged();
            variablesGenerales = false;
            showContent();
        }
    }

    public void showQualityVariablesList() {
        showLoading();
        nextButton.setVisibility(View.GONE);
        ventana = "qualityVariables";
        List<SurveyVariablesObjectCard> tarjetasParaMostrar = new ArrayList<>();
        SurveyVariablesObjectCard tarjeta = null;
        List<String> nombres = new ArrayList<>();
        for (int i = numeroElementosMostrados; i < numeroElementosMostrados + Constants.NUMBER_ITEMS_SCREEN; i++) {
            List<List<String>> listaRadios = getListaRadios();
            // Log.d("ITEMS", generalVariableItem.getNOMBRE() + " items:" + String.valueOf(Integer.valueOf(generalVariableItem.getITEMS())));
            List chechedButtons = Arrays.asList(false, false, false, false, false, false, false);
            tarjeta = new SurveyVariablesObjectCard(surveyQualityVariablesItemsUnordered.get(i).getNOMBRE(), true, listaRadios.size(), listaRadios, surveyQualityVariablesItemsUnordered.get(i).getAbreviatura(), false, null, chechedButtons, surveyQualityVariablesItemsUnordered.get(i).getColor());
            tarjetasParaMostrar.add(tarjeta);
            nombres.add(surveyQualityVariablesItemsUnordered.get(i).getNOMBRE());
        }
        //añadimos los spinner de opinion
        nombres.add(0, "Seleccione");
        tarjeta = new SurveyVariablesObjectCard("Mejor", false, 0, null, "none", true, nombres, null, 999);
        tarjetasParaMostrar.add(tarjeta);
        tarjeta = new SurveyVariablesObjectCard("Peor", false, 0, null, "none", true, nombres, null, 999);
        tarjetasParaMostrar.add(tarjeta);
        tarjeta = new SurveyVariablesObjectCard("Mas Importante", false, 0, null, "none", true, nombres, null, 999);
        tarjetasParaMostrar.add(tarjeta);
        tarjeta = new SurveyVariablesObjectCard("Menos Importante", false, 0, null, "none", true, nombres, null, 999);
        tarjetasParaMostrar.add(tarjeta);
        adapterList = new SurveyAdapter(getContext(), tarjetasParaMostrar, this, this);
        surveyRecyclerView.setAdapter(adapterList);
        adapterList.notifyDataSetChanged();
        numeroElementosMostrados = numeroElementosMostrados + Constants.NUMBER_ITEMS_SCREEN;
        showContent();
        //coje de x en x
    }

    private List<List<String>> getListaRadios(SurveyGeneralVariablesItem generalVariableItem, List<SurveyGeneralVariablesItem> generalVariablesItemList) {
        int posicionEnLista = generalVariablesItemList.indexOf(generalVariableItem);
        int numeroRadiosButtons = Integer.valueOf(generalVariableItem.getITEMS());
        List<List<String>> elementoADevolver = new ArrayList<>();
        for (int i = posicionEnLista + 1; i < posicionEnLista + numeroRadiosButtons + 1; i++) {
            List<String> elementoAñadir = new ArrayList<>();
            elementoAñadir.add(generalVariablesItemList.get(i).getNOMBRE());
            elementoAñadir.add(generalVariablesItemList.get(i).getAbreviatura());
            elementoADevolver.add(elementoAñadir);
            //Log.d("ListaRadios", elementoAñadir.get(0));
        }

        return elementoADevolver;
    }

    private List<List<String>> getListaRadios() {
        int numeroRadiosButtons = 6;
        List<List<String>> elementoADevolver = new ArrayList<>();
        String[] nombres = {"Muy Mal", "Mal", "Normal", "Bien", "Muy Bien", "Ns/Nc"};
        for (int i = 0; i < numeroRadiosButtons; i++) {
            List<String> elementoAñadir = new ArrayList<>();
            elementoAñadir.add(nombres[i]);
            elementoADevolver.add(elementoAñadir);
            //Log.d("ListaRadios", elementoAñadir.get(0));
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
    public void OnRadioChecked(int posicionTrue, int positionInCard) {

    }

    @Override
    public void OnItemSelected(String variableAFijarEn1, String variableADevolverA0) {

    }

    @Override
    public void OnSpinnerSelected(String variableSpinner, String nombreVariable, int posicionElemento) {

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

    @Override
    public void OnAllRadioCheckedTrue() {
        nextButton.setVisibility(View.VISIBLE);
    }

    @Override
    public void OnNotAllRadioCheckedTrue() {
        nextButton.setVisibility(View.GONE);
    }

    @OnClick(R.id.floatingNext)
    void onNextClicked() {
        //hay que identificar en que ventana estamos
        if (ventana.equalsIgnoreCase("generalVariables")) {
            try {
                List<SurveyVariablesObjectCard> surveyVariablesObjectCardList = restoreFromLocalDatabase.variablesAnswers();
                int elementoInicial = 0;
                int elementoFinal;

                for (SurveyVariablesObjectCard objeto : surveyVariablesObjectCardList) {
                    int contador = 0;
                    elementoInicial++;
                    elementoFinal = elementoInicial + objeto.getNumeroRadios();
                    Log.d("inicio", String.valueOf(elementoInicial));
                    Log.d("fin", String.valueOf(elementoFinal));
                    //para elementos tipo radiobutton
                    for (int i = elementoInicial; i < elementoFinal; i++) {//se obtiene la abreviatura y se llama al método que lo mete en la clase del objeto a subir posteriormente
                        String abreviatura = generalVariablesItemList.get(i).getAbreviatura();
                        abreviatura = abreviatura.split("_")[0].substring(0, 1).toUpperCase() + abreviatura.split("_")[0].substring(1, abreviatura.split("_")[0].length()) + abreviatura.split("_")[1].substring(0, 1).toUpperCase() + abreviatura.split("_")[1].substring(1, abreviatura.split("_")[1].length());
                        //Log.d("abreviado", abreviatura);
                        if (contador == objeto.getElementoRadioButtonPresionado()) {
                            metodoVariablesDinamicas(abreviatura, 1);
                        } else {
                            metodoVariablesDinamicas(abreviatura, 0);
                        }
                        contador++;
                    }
                    //PARA TIPO SPINNER
                    if (!objeto.getRadiosEnabled()) {
                        String abreviatura = objeto.getVariableSpinner();
                        try {
                            abreviatura = abreviatura.split("_")[0].substring(0, 1).toUpperCase() + abreviatura.split("_")[0].substring(1, abreviatura.split("_")[0].length()) + abreviatura.split("_")[1].substring(0, 1).toUpperCase() + abreviatura.split("_")[1].substring(1, abreviatura.split("_")[1].length());
                        } catch (IndexOutOfBoundsException e) {
                            abreviatura = abreviatura.substring(0, 1).toUpperCase() + abreviatura.substring(1, abreviatura.length());

                        }
                        metodoVariablesDinamicas(abreviatura, objeto.getElementoSpinnerSeleccionado());
                    }
                    elementoInicial = elementoFinal;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            showQualityVariablesList();
        } else {
            //PARA VARIABLES DE CALIDAD
            List<SurveyVariablesObjectCard> surveyVariablesObjectCardList = null;
            List<String[]> abreviaturaYNombre = new ArrayList<>();
            int posicionTarjetaBestWorst = 0;
            try {
                surveyVariablesObjectCardList = restoreFromLocalDatabase.variablesAnswers();
            } catch (Exception e) {
                e.printStackTrace();
            }
            for (SurveyVariablesObjectCard objeto : surveyVariablesObjectCardList) {
                if (objeto.getRadiosEnabled()) {
                    String abreviatura = objeto.getVariableSpinner();
                    abreviatura = abreviatura.substring(0, 1).toUpperCase() + abreviatura.substring(1, abreviatura.length());
                    String guardar[] = {abreviatura, objeto.getTitulo()};
                    abreviaturaYNombre.add(guardar);
                    metodoVariablesDinamicas(abreviatura + Constants.GRUPO, grupo);
                    for (int i = 0; i < Constants.LISTABREVIATURAS.length; i++) {//se obtiene la abreviatura y se llama al método que lo mete en la clase del objeto a subir posteriormente
                        String abreviaturaDinamica = abreviatura + Constants.LISTABREVIATURAS[i];
                        //Log.d("abreviado", abreviatura);
                        if (i == objeto.getElementoRadioButtonPresionado()) {
                            metodoVariablesDinamicas(abreviaturaDinamica, 1);
                        } else {
                            metodoVariablesDinamicas(abreviaturaDinamica, 0);
                        }
                    }
                } else { //tipo spinner

                    for (String[] lista : abreviaturaYNombre) {
                        String abreviaturaDinamica = lista[0] + Constants.LISTABREVIATURASBESTWORST[posicionTarjetaBestWorst];
                        //si el nombre corresponde con el seleccionado la abreviatura la hacemos 1 sino 0
                        if (lista[1].equals(objeto.getElementoSpinnerSeleccionado())) {
                            metodoVariablesDinamicas(abreviaturaDinamica, 1);
                        } else {
                            metodoVariablesDinamicas(abreviaturaDinamica, 0);
                        }
                    }
                    posicionTarjetaBestWorst++;
                }

            }
            if (grupo == Constants.NUMBER_SCREENS) { //a la constante hay que restarle 1
                //savve in local database
                try {
                    surveyObjectSendItem.setEncuestador(utilidades.getUserFromPreference(getContext()));
                    saveInLocalDatabase.saveUserAaswers(surveyObjectSendItem);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                onFinishSurveyListener.loadMainScreen();
            } else {
                showQualityVariablesList();
            }
            grupo++;
        }
    }

    private void metodoVariablesDinamicas(String abreviatura, int valor) {
        String nombreMetodo = "set" + abreviatura;
        try {
            Method metodo = surveyObjectSendItem.getClass().getMethod(nombreMetodo, Integer.class);
            metodo.invoke(surveyObjectSendItem, Integer.valueOf(valor));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private void metodoVariablesDinamicas(String abreviatura, String valor) {
        String nombreMetodo = "set" + abreviatura;
        try {
            Method metodo = surveyObjectSendItem.getClass().getMethod(nombreMetodo, String.class);
            metodo.invoke(surveyObjectSendItem, String.valueOf(valor));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
