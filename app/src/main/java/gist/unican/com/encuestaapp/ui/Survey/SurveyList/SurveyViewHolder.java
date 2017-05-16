package gist.unican.com.encuestaapp.ui.Survey.SurveyList;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnItemSelected;
import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesObjectCard;

/**
 * Created by andres on 16/05/2017.
 */

public class SurveyViewHolder extends RecyclerView.ViewHolder {
    @Nullable
    @BindView(R.id.title)
    TextView title;
    @Nullable
    @BindView(R.id.normalCard)
    LinearLayout normalCard;
    @Nullable
    @BindView(R.id.answer_radioGroup)
    RadioGroup radioGroup;
    @Nullable
    @BindView(R.id.answer1_radio)
    RadioButton answer1_radio;
    @Nullable
    @BindView(R.id.answer2_radio)
    RadioButton answer2_radio;
    @Nullable
    @BindView(R.id.answer3_radio)
    RadioButton answer3_radio;
    @Nullable
    @BindView(R.id.answer4_radio)
    RadioButton answer4_radio;
    @Nullable
    @BindView(R.id.answer5_radio)
    RadioButton answer5_radio;
    @Nullable
    @BindView(R.id.answer6_radio)
    RadioButton answer6_radio;
    @Nullable
    @BindView(R.id.answer7_radio)
    RadioButton answer7_radio;
    @Nullable
    @BindView(R.id.dropdownCard)
    LinearLayout dropDownCard;
    @Nullable
    @BindView(R.id.spinner)
    Spinner spinner;

    //listener para sumar y comprobar que este all relleno
    SurveyAdapter.OnItemsSelectedInListener listener = null;
    Boolean firsTimeChange = true;

    //Radiogroup get checked
    @Nullable
    @OnCheckedChanged(R.id.answer_radioGroup)
    void radioOnChecked() {
        if (firsTimeChange) {
            listener.OnRadioChecked();
            firsTimeChange = false;
        }

    }

    @Nullable
    @OnItemSelected(R.id.spinner)
    void spinnerItemSelected() {
        if (firsTimeChange) {
            listener.OnRadioChecked();
            firsTimeChange = false;
        }
    }

    public void bind(final SurveyGeneralVariablesObjectCard surveyGeneralVariablesObjectCard, SurveyAdapter.OnItemsSelectedInListener listener) {
        this.listener = listener;


    }

    public SurveyViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        radioGroup.getCheckedRadioButtonId();
    }
}
