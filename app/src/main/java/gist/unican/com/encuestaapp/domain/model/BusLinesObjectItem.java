package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by andres on 08/05/2017.
 */

public class BusLinesObjectItem {
    public long id;
    @SerializedName("dc:identifier")
    @Expose
    public String dcIdentifier;
    @SerializedName("dc:modified")
    @Expose
    public String dcModified;
    @SerializedName("ayto:numero")
    @Expose
    public String aytoNumero;
    @SerializedName("dc:name")
    @Expose
    public String dcName;
    @SerializedName("uri")
    @Expose
    public String uri;

    public BusLinesObjectItem() {
    }

    public String getDcIdentifier() {
        return dcIdentifier;
    }

    public void setDcIdentifier(String dcIdentifier) {
        this.dcIdentifier = dcIdentifier;
    }

    public String getDcModified() {
        return dcModified;
    }

    public void setDcModified(String dcModified) {
        this.dcModified = dcModified;
    }

    public String getAytoNumero() {
        return aytoNumero;
    }

    public void setAytoNumero(String aytoNumero) {
        this.aytoNumero = aytoNumero;
    }

    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
