package gist.unican.com.encuestaapp.ui.Survey.SurveyList;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemSelected;
import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesObjectCard;

import static android.support.v7.recyclerview.R.styleable.RecyclerView;

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
    @BindView(R.id.tarjeta)
    LinearLayout tarjetaCompleta;
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
    RadioButton selectedRadio=null;
    @Nullable
    @BindView(R.id.dropdownCard)
    LinearLayout dropDownCard;
    @Nullable
    @BindView(R.id.spinner)
    Spinner spinner;

    //listener para sumar y comprobar que este all relleno
    SurveyAdapter.OnItemsSelectedInListener listener = null;
    Boolean firsTimeChange = true;

    //Objeto con datos tarjetas
    SurveyGeneralVariablesObjectCard surveyGeneralVariablesObjectCard;

    //String para almacenar la variable anterior
    String variableAnterior = null;

    //Radiogroup get checked
    private void radioOnChecked() {
        if (firsTimeChange) {
            // listener.OnRadioChecked(); //se llama al metodo que nos dice que hay elementos marcados para poder luego seguir con la encuesta
            firsTimeChange = false;
        }
        // se coge el texto del boton seleccionado y se busca la variable asignada al boton pulsado
        if (radioGroup.getCheckedRadioButtonId() != -1) {
            int id = radioGroup.getCheckedRadioButtonId();
            View radioButton = radioGroup.findViewById(id);
            int radioId = radioGroup.indexOfChild(radioButton);
            RadioButton btn = (RadioButton) radioGroup.getChildAt(radioId);
            selectedRadio=btn;
            String selection = (String) btn.getText();
            String variable = "";
            for (List titulo : surveyGeneralVariablesObjectCard.getListaRadioButtons()) {
                if (titulo.get(0).toString().equalsIgnoreCase(selection)) {
                    variable = titulo.get(1).toString();
                    Log.d("Variable Marcada", variable);
                    //se hace saber en la clase survey fragmente que se ha elegido esta variable y hay que ponerla a 1 y por tanto la anterior a 0
                    listener.OnItemSelected(variable, variableAnterior);
                    variableAnterior = variable;
                    break;
                }
            }
        } else {

        }


    }

    @Nullable
    @OnItemSelected(R.id.spinner)
    void spinnerItemSelected() {
        if (firsTimeChange) {
            listener.OnRadioChecked();
            firsTimeChange = false;
        }
        listener.OnSpinnerSelected(surveyGeneralVariablesObjectCard.getVariableSpinner(), spinner.getSelectedItem().toString());

    }

    public void bind(Context context, final SurveyGeneralVariablesObjectCard surveyGeneralVariablesObjectCard, SurveyAdapter.OnItemsSelectedInListener listener) {
        this.listener = listener;
        this.surveyGeneralVariablesObjectCard = surveyGeneralVariablesObjectCard;
        title.setText(surveyGeneralVariablesObjectCard.getTitulo());
        answer2_radio.setVisibility(View.VISIBLE);
        answer3_radio.setVisibility(View.VISIBLE);
        answer4_radio.setVisibility(View.VISIBLE);
        answer5_radio.setVisibility(View.VISIBLE);
        answer6_radio.setVisibility(View.VISIBLE);
        answer7_radio.setVisibility(View.VISIBLE);
        if (surveyGeneralVariablesObjectCard.getRadiosEnabled()) {
            dropDownCard.setVisibility(View.GONE);
            normalCard.setVisibility(View.VISIBLE);
            switch (surveyGeneralVariablesObjectCard.getNumeroRadios()) {
                //se encienden los radio buttons que sean menester
                case 2:
                    answer1_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(0).get(0));
                    answer2_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(1).get(0));
                    answer3_radio.setVisibility(View.GONE);
                    answer4_radio.setVisibility(View.GONE);
                    answer5_radio.setVisibility(View.GONE);
                    answer6_radio.setVisibility(View.GONE);
                    answer7_radio.setVisibility(View.GONE);
                    break;
                case 3:
                    answer1_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(0).get(0));
                    answer2_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(1).get(0));
                    answer3_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(2).get(0));
                    answer4_radio.setVisibility(View.GONE);
                    answer5_radio.setVisibility(View.GONE);
                    answer6_radio.setVisibility(View.GONE);
                    answer7_radio.setVisibility(View.GONE);
                    break;
                case 4:
                    answer1_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(0).get(0));
                    answer2_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(1).get(0));
                    answer3_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(2).get(0));
                    answer4_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(3).get(0));
                    answer5_radio.setVisibility(View.GONE);
                    answer6_radio.setVisibility(View.GONE);
                    answer7_radio.setVisibility(View.GONE);
                    break;
                case 5:
                    answer1_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(0).get(0));
                    answer2_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(1).get(0));
                    answer3_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(2).get(0));
                    answer4_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(3).get(0));
                    answer5_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(4).get(0));
                    answer6_radio.setVisibility(View.GONE);
                    answer7_radio.setVisibility(View.GONE);
                    break;
                case 6:
                    answer1_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(0).get(0));
                    answer2_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(1).get(0));
                    answer3_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(2).get(0));
                    answer4_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(3).get(0));
                    answer5_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(4).get(0));
                    answer6_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(5).get(0));
                    answer7_radio.setVisibility(View.GONE);
                    break;
                case 7:
                    answer1_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(0).get(0));
                    answer2_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(1).get(0));
                    answer3_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(2).get(0));
                    answer4_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(3).get(0));
                    answer5_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(4).get(0));
                    answer6_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(5).get(0));
                    answer7_radio.setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(6).get(0));
                    break;
            }

        } else {//se asume que es un spinner
            normalCard.setVisibility(View.GONE);
            dropDownCard.setVisibility(View.VISIBLE);
            tarjetaCompleta.setVisibility(View.VISIBLE);
            //si es linea no se mmuestra la tarjeta
            if (surveyGeneralVariablesObjectCard.getTitulo().equalsIgnoreCase("Linea")) {
                tarjetaCompleta.setVisibility(View.GONE);
                if (firsTimeChange) {
                    Log.d("linea", "l");
                    // listener.OnRadioChecked(); //se llama al metodo que nos dice que hay elementos marcados para poder luego seguir con la encuesta
                    firsTimeChange = false;
                }
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, surveyGeneralVariablesObjectCard.getListaSpinner());
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            spinner.setAdapter(adapter);
        }

    }

    public SurveyViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        if(selectedRadio!=null){
            selectedRadio.setChecked(true);
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                radioOnChecked();
            }
        });
    }
}
