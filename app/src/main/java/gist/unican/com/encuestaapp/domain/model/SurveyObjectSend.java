package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by andres on 19/09/2017.
 */
public class SurveyObjectSend {
    @SerializedName("data")
    @Expose
    private List<SurveyObjectSendItem> data = null;

    public List<SurveyObjectSendItem> getData() {
        return data;
    }

    public void setData(List<SurveyObjectSendItem> data) {
        this.data = data;
    }

}

