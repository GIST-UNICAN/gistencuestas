package gist.unican.com.gistapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by andres on 08/05/2017.
 */

public class SurveyQualityVariables {
    public SurveyQualityVariables() {
    }

    @SerializedName("results")
    @Expose
    private List<SurveyQualityVariablesItem> results = null;

    public List<SurveyQualityVariablesItem> getResults() {
        return results;
    }

    public void setResults(List<SurveyQualityVariablesItem> results) {
        this.results = results;
    }

}
