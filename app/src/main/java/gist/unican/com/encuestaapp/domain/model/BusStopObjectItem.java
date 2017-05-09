package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.siimkinks.sqlitemagic.annotation.Table;

/**
 * Created by andres on 09/05/2017.
 */
@Table(persistAll = true)
public class BusStopObjectItem {
    public BusStopObjectItem() {
    }

    @SerializedName("ayto:Ruta")
    @Expose
    public String aytoRuta;
    @SerializedName("ayto:PuntoKM")
    @Expose
    public String aytoPuntoKM;
    @SerializedName("ayto:NParada")
    @Expose
    public String aytoNParada;
    @SerializedName("dc:EtiquetaLinea")
    @Expose
    public String dcEtiquetaLinea;
    @SerializedName("dc:modified")
    @Expose
    public String dcModified;
    @SerializedName("ayto:Linea")
    @Expose
    public String aytoLinea;
    @SerializedName("ayto:Seccion")
    @Expose
    public String aytoSeccion;
    @SerializedName("ayto:SentidoRuta")
    @Expose
    public String aytoSentidoRuta;
    @SerializedName("dc:identifier")
    @Expose
    public String dcIdentifier;
    @SerializedName("ayto:NombreSublinea")
    @Expose
    public String aytoNombreSublinea;
    @SerializedName("ayto:NombreParada")
    @Expose
    public String aytoNombreParada;
    @SerializedName("ayto:PosX")
    @Expose
    public String aytoPosX;
    @SerializedName("ayto:PosY")
    @Expose
    public String aytoPosY;
    @SerializedName("uri")
    @Expose
    public String uri;

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
