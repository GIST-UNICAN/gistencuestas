package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by andres on 08/05/2017.
 */

public class SurveyGeneralVariables {
    public SurveyGeneralVariables() {
    }

    @SerializedName("results")
    @Expose
    public List<SurveyGeneralVariablesItem> surveyGeneralVariablesItems = null;

    public List<SurveyGeneralVariablesItem> getSurveyGeneralVariablesItems() {
        return surveyGeneralVariablesItems;
    }

    public void setSurveyGeneralVariablesItems(List<SurveyGeneralVariablesItem> surveyGeneralVariablesItems) {
        this.surveyGeneralVariablesItems = surveyGeneralVariablesItems;
    }

}