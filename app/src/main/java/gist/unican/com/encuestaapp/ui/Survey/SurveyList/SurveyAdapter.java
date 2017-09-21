package gist.unican.com.encuestaapp.ui.Survey.SurveyList;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.DataPersistance.DeleteInLocalDatabase;
import gist.unican.com.encuestaapp.domain.DataPersistance.SaveInLocalDatabase;
import gist.unican.com.encuestaapp.domain.Utils.Utils;
import gist.unican.com.encuestaapp.domain.model.SurveyVariablesObjectCard;

/**
 * Created by andres on 16/05/2017.
 */

public class SurveyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements OnItemsSelectedInListener {
    public List<SurveyVariablesObjectCard> surveyVariablesObjectCardList;
    public OnItemsSelectedInListener listener;
    public OnAllRadioChecked listenerNext;
    Context context;
    List<Boolean> elementos = new ArrayList<>();
    private RadioButton lastCheckedRB = null;
    //lista de tarjetas mostradas
    Map<String, Boolean> tarjetasMostradas = new HashMap<>();


    public SurveyAdapter(Context context, List<SurveyVariablesObjectCard> surveyVariablesObjectCardList, OnItemsSelectedInListener listener, OnAllRadioChecked listenerNext) {
        this.listenerNext = listenerNext;
        this.listener = listener;
        this.surveyVariablesObjectCardList = surveyVariablesObjectCardList;
        this.context = context;
        for (SurveyVariablesObjectCard tarjeta : surveyVariablesObjectCardList) {
            tarjetasMostradas.put(tarjeta.getTitulo(), false);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        final SurveyViewHolder surveyViewHolder = new SurveyViewHolder(view);
        return surveyViewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        tarjetasMostradas.put(surveyVariablesObjectCardList.get(position).getTitulo(), true);
        ((SurveyViewHolder) holder).bind(context, surveyVariablesObjectCardList.get(position), listener, position, this);
    }

    @Override
    public int getItemCount() {
        return surveyVariablesObjectCardList.size();
    }

    @Override
    public void OnRadioChecked(int positionInCard, int posicionTrue) {
        List<Boolean> elementosCheckeados = surveyVariablesObjectCardList.get(positionInCard).getActiveRadios();
        if (elementosCheckeados.indexOf(true) != -1) {
            elementosCheckeados.set(elementosCheckeados.indexOf(true), false);
        }
        elementosCheckeados.set(posicionTrue, true);
        surveyVariablesObjectCardList.get(positionInCard).setActiveRadios(elementosCheckeados);
        surveyVariablesObjectCardList.get(positionInCard).setElementoRadioButtonPresionado(posicionTrue);
        mostrarBotonSiguiente();

    }

    @Override
    public void OnItemSelected(String variableAFijarEn1, String variableADevolverA0) {

    }

    @Override
    public void OnSpinnerSelected(String variableSpinner, String nombreVariable, int positionInCard) {
        surveyVariablesObjectCardList.get(positionInCard).setElementoSpinnerSeleccionado(variableSpinner);
        SaveInLocalDatabase saveInLocalDatabase = new SaveInLocalDatabase();
        DeleteInLocalDatabase deleteInLocalDatabase = new DeleteInLocalDatabase();
        try {
            deleteInLocalDatabase.deleteGeneralVariablesAnswersTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            saveInLocalDatabase.saveLocaGeneralVariablesAnswers(surveyVariablesObjectCardList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mostrarBotonSiguiente();
    }

    private void mostrarBotonSiguiente() {
        if (!tarjetasMostradas.values().contains(false)) {
            Boolean mostrarBotonSiguiente = true;
            for (SurveyVariablesObjectCard elementoTarjeta : surveyVariablesObjectCardList) {
                if (elementoTarjeta.getTitulo().equalsIgnoreCase("Linea")) {//la linea no se pregunta y también esnecesario almacenarla
                    Utils utilidades = new Utils();
                    int elemento = surveyVariablesObjectCardList.indexOf(elementoTarjeta);
                    surveyVariablesObjectCardList.get(elemento).setElementoSpinnerSeleccionado(utilidades.getBusLineFromPreferences(context));
                }

                try {
                    if (elementoTarjeta.getRadiosEnabled()) {
                        if (elementoTarjeta.getActiveRadios().indexOf(true) == -1) {
                            mostrarBotonSiguiente = false;
                            break;
                        }
                    } else {
                        if (elementoTarjeta.getElementoSpinnerSeleccionado().equalsIgnoreCase("seleccione")) {
                            mostrarBotonSiguiente = false;
                            break;
                        }
                    }
                } catch (Exception e) {

                }
            }
            if (mostrarBotonSiguiente) {
                SaveInLocalDatabase saveInLocalDatabase = new SaveInLocalDatabase();
                DeleteInLocalDatabase deleteInLocalDatabase = new DeleteInLocalDatabase();
                try {
                    deleteInLocalDatabase.deleteGeneralVariablesAnswersTable();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    saveInLocalDatabase.saveLocaGeneralVariablesAnswers(surveyVariablesObjectCardList);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                listenerNext.OnAllRadioCheckedTrue();
            } else {
                listenerNext.OnNotAllRadioCheckedTrue();
            }
        }
    }
}
