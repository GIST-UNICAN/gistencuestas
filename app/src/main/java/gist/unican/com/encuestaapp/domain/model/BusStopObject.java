package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by andres on 09/05/2017.
 */
public class BusStopObject {
    public BusStopObject() {
    }

    @SerializedName("resources")
    @Expose
    private List<BusStopObjectItem> resources = null;


    public List<BusStopObjectItem> getResources() {
        return resources;
    }

    public void setResources(List<BusStopObjectItem> resources) {
        this.resources = resources;
    }

}
