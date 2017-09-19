package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.siimkinks.sqlitemagic.annotation.IgnoreColumn;
import com.siimkinks.sqlitemagic.annotation.Table;

import java.util.List;

/**
 * Created by andres on 19/09/2017.
 */
@Table(persistAll = true)
public class SurveyObjectSend {
    @IgnoreColumn
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

