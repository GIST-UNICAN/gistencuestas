package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by andres on 26/09/2017.
 */

public class RankingObject {
    @SerializedName("results")
    @Expose
    private List<RankingObjectItem> results = null;

    public List<RankingObjectItem> getResults() {
        return results;
    }

    public void setResults(List<RankingObjectItem> results) {
        this.results = results;
    }
}
