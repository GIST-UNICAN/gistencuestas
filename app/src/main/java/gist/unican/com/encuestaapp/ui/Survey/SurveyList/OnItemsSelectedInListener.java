package gist.unican.com.encuestaapp.ui.Survey.SurveyList;

/**
 * Created by andres on 18/05/2017.
 */

public interface OnItemsSelectedInListener {
    public void OnRadioChecked(int posicionTrue, int positionCardList);

    public void OnItemSelected(String variableAFijarEn1, String variableADevolverA0);

    public void OnSpinnerSelected(String variableSpinner, String nombreVariable, int positionCArdList);
}
