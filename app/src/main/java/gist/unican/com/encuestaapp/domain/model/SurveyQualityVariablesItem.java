package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.siimkinks.sqlitemagic.annotation.Column;
import com.siimkinks.sqlitemagic.annotation.Table;

/**
 * Created by andres on 10/05/2017.
 */
@Table(persistAll = true)
public class SurveyQualityVariablesItem {
    @Column(useAccessMethods = true)
    @SerializedName("ID")
    @Expose
    private String iD;
    @Column(useAccessMethods = true)
    @SerializedName("NOMBRE")
    @Expose
    private String nOMBRE;
    @Column(useAccessMethods = true)
    @SerializedName("abreviatura")
    @Expose
    private String abreviatura;
    @SerializedName("color")
    @Expose
    @Column(useAccessMethods = true)
    private int color;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getNOMBRE() {
        return nOMBRE;
    }

    public void setNOMBRE(String nOMBRE) {
        this.nOMBRE = nOMBRE;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

}
