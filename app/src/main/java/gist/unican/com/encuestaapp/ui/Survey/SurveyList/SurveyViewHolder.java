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

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemSelected;
import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesObjectCard;

/**
 * Created by andres on 16/05/2017.
 */

public class SurveyViewHolder extends RecyclerView.ViewHolder implements RadioGroup.OnCheckedChangeListener {

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
    RadioButton selectedRadio = null;
    @Nullable
    @BindView(R.id.dropdownCard)
    LinearLayout dropDownCard;
    @Nullable
    @BindView(R.id.spinner)
    Spinner spinner;

    //listener para sumar y comprobar que este all relleno
    OnItemsSelectedInListener listener = null;
    OnItemsSelectedInListener listener2 = null;
    Boolean firsTimeChange = true;
    private boolean onBind;

    //Objeto con datos tarjetas
    SurveyGeneralVariablesObjectCard surveyGeneralVariablesObjectCard;

    //String para almacenar la variable anterior
    String variableAnterior = null;

    //lista con los radio buttons
    List<RadioButton> listRadios = new ArrayList<>();

    //int posicionen car list
    int positionCardList;

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
            selectedRadio = btn;
            String selection = (String) btn.getText();
            Log.d("SELECTION", selection);
            String variable = "";
            listener2.OnRadioChecked(getAdapterPosition(), listRadios.indexOf(btn));
           /* for (List titulo : surveyGeneralVariablesObjectCard.getListaRadioButtons()) {
                if (titulo.get(0).toString().equalsIgnoreCase(selection)) {
                    variable = titulo.get(1).toString();
                    Log.d("Variable Marcada", variable);
                    //se hace saber en la clase survey fragmente que se ha elegido esta variable y hay que ponerla a 1 y por tanto la anterior a 0
                    listener.OnItemSelected(variable, variableAnterior);
                    variableAnterior = variable;
                    break;
                }
            }*/
        }


    }

    @Nullable
    @OnItemSelected(R.id.spinner)
    void spinnerItemSelected() {
        if (!onBind) {
            listener2.OnSpinnerSelected(spinner.getSelectedItem().toString(), surveyGeneralVariablesObjectCard.getVariableSpinner(), getAdapterPosition());
        }

    }

    public void bind(Context context, final SurveyGeneralVariablesObjectCard surveyGeneralVariablesObjectCard, OnItemsSelectedInListener listener, int positionInCardList, OnItemsSelectedInListener listener2) {
        this.listener = listener;
        this.listener2 = listener2;
        this.surveyGeneralVariablesObjectCard = surveyGeneralVariablesObjectCard;
        this.positionCardList = positionInCardList;
        title.setText(surveyGeneralVariablesObjectCard.getTitulo());
        Log.d("CREANDO", surveyGeneralVariablesObjectCard.getTitulo());
        onBind = true;
        if (surveyGeneralVariablesObjectCard.getRadiosEnabled()) {
            radioGroup.clearCheck();
            dropDownCard.setVisibility(View.GONE);
            normalCard.setVisibility(View.VISIBLE);
            //guardamos los radio buttons en una lista

            listRadios.add(answer1_radio);
            listRadios.add(answer2_radio);
            listRadios.add(answer3_radio);
            listRadios.add(answer4_radio);
            listRadios.add(answer5_radio);
            listRadios.add(answer6_radio);
            listRadios.add(answer7_radio);
            int optionTrue = surveyGeneralVariablesObjectCard.getActiveRadios().indexOf(true);
            for (RadioButton rb : listRadios) {
                rb.setChecked(false);
                rb.setVisibility(View.GONE);
            }
            Log.d("option true", String.valueOf(optionTrue));
            if (optionTrue != -1) {
                //listRadios.get(optionTrue).setChecked(true);
            }


            for (int i = 0; i < surveyGeneralVariablesObjectCard.getNumeroRadios(); i++) {
                listRadios.get(i).setText(surveyGeneralVariablesObjectCard.getListaRadioButtons().get(i).get(0));
                listRadios.get(i).setVisibility(View.VISIBLE);
                if (i == optionTrue) {
                    listRadios.get(i).setChecked(true);
                } else {
                    listRadios.get(i).setChecked(false);
                }
            }
            onBind = false;

        } else {//se asume que es un spinner
            onBind = true;
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
                } else {

                }
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, surveyGeneralVariablesObjectCard.getListaSpinner());
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            spinner.setAdapter(adapter);


            if (surveyGeneralVariablesObjectCard.getElementoSpinnerSeleccionado() != null) {//si ya se ha rellenado se pone en el spinner el elemento almacenado
                spinner.setSelection(surveyGeneralVariablesObjectCard.getListaSpinner().indexOf(surveyGeneralVariablesObjectCard.getElementoSpinnerSeleccionado()));
            }

            onBind = false;
        }

    }

    public SurveyViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        radioGroup.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        if (!onBind) {
            radioOnChecked();
        }
    }

}
