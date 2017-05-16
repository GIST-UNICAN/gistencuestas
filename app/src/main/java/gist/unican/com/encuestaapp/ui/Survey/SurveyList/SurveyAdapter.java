package gist.unican.com.encuestaapp.ui.Survey.SurveyList;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesObjectCard;

/**
 * Created by andres on 16/05/2017.
 */

public class SurveyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<SurveyGeneralVariablesObjectCard> surveyGeneralVariablesObjectCardList;
    public OnItemsSelectedInListener listener;

    public interface OnItemsSelectedInListener {
        public void OnRadioChecked();
    }

    public SurveyAdapter(List<SurveyGeneralVariablesObjectCard> surveyGeneralVariablesObjectCardList, SurveyAdapter.OnItemsSelectedInListener listener) {
        this.listener=listener;
        this.surveyGeneralVariablesObjectCardList = surveyGeneralVariablesObjectCardList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        final SurveyViewHolder surveyViewHolder = new SurveyViewHolder(view);
        return surveyViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final SurveyGeneralVariablesObjectCard remainderItemObject = surveyGeneralVariablesObjectCardList.get(position);
        ((SurveyViewHolder) holder).bind(surveyGeneralVariablesObjectCardList.get(position),listener);
    }

    @Override
    public int getItemCount() {
        return surveyGeneralVariablesObjectCardList.size() + 1;
    }
}
