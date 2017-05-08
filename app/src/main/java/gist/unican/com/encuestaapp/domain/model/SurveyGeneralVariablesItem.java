package gist.unican.com.encuestaapp.domain.model;

import com.abubusoft.kripton.annotation.BindType;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by andres on 08/05/2017.
 */
@BindType
public class SurveyGeneralVariablesItem {
    public long id;

    public SurveyGeneralVariablesItem() {
    }

    @SerializedName("ID")
    @Expose
    public String iD;
    @SerializedName("NOMBRE")
    @Expose
    public String nOMBRE;
    @SerializedName("ITEMS")
    @Expose
    public String iTEMS;

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

    public String getITEMS() {
        return iTEMS;
    }

    public void setITEMS(String iTEMS) {
        this.iTEMS = iTEMS;
    }

}
