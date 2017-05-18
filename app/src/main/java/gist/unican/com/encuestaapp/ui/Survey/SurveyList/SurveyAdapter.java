package gist.unican.com.encuestaapp.ui.Survey.SurveyList;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesObjectCard;

/**
 * Created by andres on 16/05/2017.
 */

public class SurveyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements OnItemsSelectedInListener {
    List<SurveyGeneralVariablesObjectCard> surveyGeneralVariablesObjectCardList;
    public OnItemsSelectedInListener listener;
    Context context;
    List<Boolean> elementos = new ArrayList<>();


    public SurveyAdapter(Context context, List<SurveyGeneralVariablesObjectCard> surveyGeneralVariablesObjectCardList, OnItemsSelectedInListener listener) {
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
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((SurveyViewHolder) holder).bind(context, surveyGeneralVariablesObjectCardList.get(position), listener, position, this);
    }

    @Override
    public int getItemCount() {
        return surveyGeneralVariablesObjectCardList.size();
    }

    @Override
    public void OnRadioChecked(int positionInCard,int posicionTrue) {
        List<Boolean> elementosCheckeados = surveyGeneralVariablesObjectCardList.get(positionInCard).getActiveRadios();
        if (elementosCheckeados.indexOf(true) != -1) {
            elementosCheckeados.set(elementosCheckeados.indexOf(true), false);
        }
        elementosCheckeados.set(posicionTrue, true);
        surveyGeneralVariablesObjectCardList.get(positionInCard).setActiveRadios(elementosCheckeados);
        Log.d("elemento-cambiado", surveyGeneralVariablesObjectCardList.get(positionInCard).getTitulo() + " " + elementosCheckeados.toString());
    }

    @Override
    public void OnItemSelected(String variableAFijarEn1, String variableADevolverA0) {

    }

    @Override
    public void OnSpinnerSelected(String variableSpinner, String nombreVariable) {

    }
}
