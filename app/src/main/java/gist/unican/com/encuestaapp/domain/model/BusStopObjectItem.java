package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by andres on 09/05/2017.
 */

public class BusStopObjectItem {
    public BusStopObjectItem() {
    }

    public long id;
    @SerializedName("ayto:Ruta")
    @Expose
    private String aytoRuta;
    @SerializedName("ayto:PuntoKM")
    @Expose
    private String aytoPuntoKM;
    @SerializedName("ayto:NParada")
    @Expose
    private String aytoNParada;
    @SerializedName("dc:EtiquetaLinea")
    @Expose
    private String dcEtiquetaLinea;
    @SerializedName("dc:modified")
    @Expose
    private String dcModified;
    @SerializedName("ayto:Linea")
    @Expose
    private String aytoLinea;
    @SerializedName("ayto:Seccion")
    @Expose
    private String aytoSeccion;
    @SerializedName("ayto:SentidoRuta")
    @Expose
    private String aytoSentidoRuta;
    @SerializedName("dc:identifier")
    @Expose
    private String dcIdentifier;
    @SerializedName("ayto:NombreSublinea")
    @Expose
    private String aytoNombreSublinea;
    @SerializedName("ayto:NombreParada")
    @Expose
    private String aytoNombreParada;
    @SerializedName("ayto:PosX")
    @Expose
    private String aytoPosX;
    @SerializedName("ayto:PosY")
    @Expose
    private String aytoPosY;
    @SerializedName("uri")
    @Expose
    private String uri;

    public String getAytoRuta() {
        return aytoRuta;
    }

    public void setAytoRuta(String aytoRuta) {
        this.aytoRuta = aytoRuta;
    }

    public String getAytoPuntoKM() {
        return aytoPuntoKM;
    }

    public void setAytoPuntoKM(String aytoPuntoKM) {
        this.aytoPuntoKM = aytoPuntoKM;
    }

    public String getAytoNParada() {
        return aytoNParada;
    }

    public void setAytoNParada(String aytoNParada) {
        this.aytoNParada = aytoNParada;
    }

    public String getDcEtiquetaLinea() {
        return dcEtiquetaLinea;
    }

    public void setDcEtiquetaLinea(String dcEtiquetaLinea) {
        this.dcEtiquetaLinea = dcEtiquetaLinea;
    }

    public String getDcModified() {
        return dcModified;
    }

    public void setDcModified(String dcModified) {
        this.dcModified = dcModified;
    }

    public String getAytoLinea() {
        return aytoLinea;
    }

    public void setAytoLinea(String aytoLinea) {
        this.aytoLinea = aytoLinea;
    }

    public String getAytoSeccion() {
        return aytoSeccion;
    }

    public void setAytoSeccion(String aytoSeccion) {
        this.aytoSeccion = aytoSeccion;
    }

    public String getAytoSentidoRuta() {
        return aytoSentidoRuta;
    }

    public void setAytoSentidoRuta(String aytoSentidoRuta) {
        this.aytoSentidoRuta = aytoSentidoRuta;
    }

    public String getDcIdentifier() {
        return dcIdentifier;
    }

    public void setDcIdentifier(String dcIdentifier) {
        this.dcIdentifier = dcIdentifier;
    }

    public String getAytoNombreSublinea() {
        return aytoNombreSublinea;
    }

    public void setAytoNombreSublinea(String aytoNombreSublinea) {
        this.aytoNombreSublinea = aytoNombreSublinea;
    }

    public String getAytoNombreParada() {
        return aytoNombreParada;
    }

    public void setAytoNombreParada(String aytoNombreParada) {
        this.aytoNombreParada = aytoNombreParada;
    }

    public String getAytoPosX() {
        return aytoPosX;
    }

    public void setAytoPosX(String aytoPosX) {
        this.aytoPosX = aytoPosX;
    }

    public String getAytoPosY() {
        return aytoPosY;
    }

    public void setAytoPosY(String aytoPosY) {
        this.aytoPosY = aytoPosY;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
