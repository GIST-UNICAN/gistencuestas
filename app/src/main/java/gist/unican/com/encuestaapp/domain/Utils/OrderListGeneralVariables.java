package gist.unican.com.encuestaapp.domain.Utils;

import java.util.Collections;
import java.util.Comparator;

import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariables;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesItem;

/**
 * Created by andres on 21/09/2017.
 */

public class OrderListGeneralVariables implements Comparator<SurveyGeneralVariablesItem> {
    public SurveyGeneralVariables orderGeneralVariables(SurveyGeneralVariables surveyGeneralVariables) {
        Collections.sort(surveyGeneralVariables.getSurveyGeneralVariablesItems(),this);
        return surveyGeneralVariables;
    }

    @Override
    public int compare(SurveyGeneralVariablesItem o1, SurveyGeneralVariablesItem o2) {
        return Double.valueOf(o1.getOrden()).compareTo(Double.valueOf(o2.getOrden()));
    }
}
