package gist.unican.com.gistapp.domain.DataPersistance;

import gist.unican.com.gistapp.domain.model.BusLinesObjectItem;
import gist.unican.com.gistapp.domain.model.BusStopObjectItem;
import gist.unican.com.gistapp.domain.model.SurveyGeneralVariablesItem;
import gist.unican.com.gistapp.domain.model.SurveyVariablesObjectCard;
import gist.unican.com.gistapp.domain.model.SurveyObjectSendItem;
import gist.unican.com.gistapp.domain.model.SurveyQualityVariablesItem;

/**
 * Created by andres on 10/05/2017.
 */

public class DeleteInLocalDatabase {
    public DeleteInLocalDatabase() {
    }

    public void deleteBusLinesTable() throws Exception {
        Integer deleteTable = 0;
        deleteTable = BusLinesObjectItem.deleteTable().execute();
        if (deleteTable == 0) {
            throw new Exception("No delete itmes");
        }
    }

    public void deleteBusStopTable() throws Exception {
        Integer deleteTable = 0;
        deleteTable = BusStopObjectItem.deleteTable().execute();
        if (deleteTable == 0) {
            throw new Exception("No delete itmes");
        }
    }

    public void deleteGeneralVariablesTable() throws Exception {
        Integer deleteTable = 0;
        deleteTable = SurveyGeneralVariablesItem.deleteTable().execute();
        if (deleteTable == 0) {
            throw new Exception("No delete itmes");
        }
    }
    public void deleteGeneralVariablesAnswersTable() throws Exception {
        Integer deleteTable = 0;
        deleteTable = SurveyVariablesObjectCard.deleteTable().execute();
        if (deleteTable == 0) {
            throw new Exception("No delete itmes");
        }
    }

    public void deleteQualityVariablesTable() throws Exception {
        Integer deleteTable = 0;
        deleteTable = SurveyQualityVariablesItem.deleteTable().execute();
        if (deleteTable == 0) {
            throw new Exception("No delete itmes");
        }
    }

    public void deleteUserAnswerTable() throws Exception {
        Integer deleteTable = 0;
        deleteTable = SurveyObjectSendItem.deleteTable().execute();
        if (deleteTable == 0) {
            throw new Exception("No delete itmes");
        }
    }
}
