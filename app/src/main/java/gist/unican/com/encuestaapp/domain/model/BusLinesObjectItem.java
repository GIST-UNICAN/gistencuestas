package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.siimkinks.sqlitemagic.annotation.Column;
import com.siimkinks.sqlitemagic.annotation.Table;

/**
 * Created by andres on 08/05/2017.
 */
@Table(persistAll = true)
public class BusLinesObjectItem {

    @Column(useAccessMethods = true)
    @SerializedName("dc:identifier")
    @Expose
    private String dcIdentifier;
    @Column(useAccessMethods = true)
    @SerializedName("dc:modified")
    @Expose
    private String dcModified;
    @Column(useAccessMethods = true)
    @SerializedName("ayto:numero")
    @Expose
    private String aytoNumero;
    @Column(useAccessMethods = true)
    @SerializedName("dc:name")
    @Expose
    private String dcName;
    @Column(useAccessMethods = true)
    @SerializedName("uri")
    @Expose
    private String uri;



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
