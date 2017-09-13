package gist.unican.com.encuestaapp.ui.Survey.SurveyList;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.DataPersistance.DeleteInLocalDatabase;
import gist.unican.com.encuestaapp.domain.DataPersistance.SaveInLocalDatabase;
import gist.unican.com.encuestaapp.domain.Utils.Utils;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesObjectCard;

/**
 * Created by andres on 16/05/2017.
 */

public class SurveyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements OnItemsSelectedInListener {
    public List<SurveyGeneralVariablesObjectCard> surveyGeneralVariablesObjectCardList;
    public OnItemsSelectedInListener listener;
    public OnAllRadioChecked listenerNext;
    Context context;
    List<Boolean> elementos = new ArrayList<>();
    private RadioButton lastCheckedRB = null;


    public SurveyAdapter(Context context, List<SurveyGeneralVariablesObjectCard> surveyGeneralVariablesObjectCardList, OnItemsSelectedInListener listener, OnAllRadioChecked listenerNext) {
        this.listenerNext = listenerNext;
        this.listener = listener;
        this.surveyGeneralVariablesObjectCardList = surveyGeneralVariablesObjectCardList;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        final SurveyViewHolder surveyViewHolder = new SurveyViewHolder(view);
        return surveyViewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        ((SurveyViewHolder) holder).bind(context, surveyGeneralVariablesObjectCardList.get(position), listener, position, this);
    }

    @Override
    public int getItemCount() {
        return surveyGeneralVariablesObjectCardList.size();
    }

    @Override
    public void OnRadioChecked(int positionInCard, int posicionTrue) {
        List<Boolean> elementosCheckeados = surveyGeneralVariablesObjectCardList.get(positionInCard).getActiveRadios();
        if (elementosCheckeados.indexOf(true) != -1) {
            elementosCheckeados.set(elementosCheckeados.indexOf(true), false);
        }
        elementosCheckeados.set(posicionTrue, true);
        surveyGeneralVariablesObjectCardList.get(positionInCard).setActiveRadios(elementosCheckeados);
        surveyGeneralVariablesObjectCardList.get(positionInCard).setElementoRadioButtonPresionado(posicionTrue);
        Log.d("elemento-cambiado", surveyGeneralVariablesObjectCardList.get(positionInCard).getTitulo() + " " + elementosCheckeados.toString());
        Boolean mostrarBotonSiguiente = true;
        for (SurveyGeneralVariablesObjectCard elementoTarjeta : surveyGeneralVariablesObjectCardList) {
            if (elementoTarjeta.getTitulo().equalsIgnoreCase("Linea")){//la linea no se pregunta y también esnecesario almacenarla
                Utils utilidades= new Utils();
                int elemento= surveyGeneralVariablesObjectCardList.indexOf(elementoTarjeta);
                surveyGeneralVariablesObjectCardList.get(elemento).setElementoSpinnerSeleccionado(utilidades.getBusLineFromPreferences(context));
            }
            if (elementoTarjeta.getRadiosEnabled()) {
                if (elementoTarjeta.getActiveRadios().indexOf(true) == -1) {
                    mostrarBotonSiguiente = false;
                    break;
                }
            }
        }
        if (mostrarBotonSiguiente) {
            SaveInLocalDatabase saveInLocalDatabase = new SaveInLocalDatabase();
            DeleteInLocalDatabase deleteInLocalDatabase = new DeleteInLocalDatabase();
            try {
                deleteInLocalDatabase.deleteGeneralVariablesAnswersTable();
                saveInLocalDatabase.saveLocaGeneralVariablesAnswers(surveyGeneralVariablesObjectCardList);
            } catch (Exception e) {
                e.printStackTrace();
            }
            listenerNext.OnAllRadioCheckedTrue();
        }

    }

    @Override
    public void OnItemSelected(String variableAFijarEn1, String variableADevolverA0) {

    }

    @Override
    public void OnSpinnerSelected(String variableSpinner, String nombreVariable, int positionInCard) {
        surveyGeneralVariablesObjectCardList.get(positionInCard).setElementoSpinnerSeleccionado(variableSpinner);
        SaveInLocalDatabase saveInLocalDatabase = new SaveInLocalDatabase();
        DeleteInLocalDatabase deleteInLocalDatabase = new DeleteInLocalDatabase();
        try {
            deleteInLocalDatabase.deleteGeneralVariablesAnswersTable();
            saveInLocalDatabase.saveLocaGeneralVariablesAnswers(surveyGeneralVariablesObjectCardList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
