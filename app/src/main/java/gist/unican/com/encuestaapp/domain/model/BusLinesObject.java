package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by andres on 08/05/2017.
 */

public class BusLinesObject {
    @SerializedName("results")
    @Expose
    public List<BusLinesObjectItem> results = null;

    public BusLinesObject() {
    }

    public List<BusLinesObjectItem> getResults() {
        return results;
    }

    public void setResults(List<BusLinesObjectItem> results) {
        this.results = results;
    }
}
