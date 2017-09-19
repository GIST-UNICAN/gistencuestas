package gist.unican.com.encuestaapp.domain.DataPersistance;

import java.util.List;

import gist.unican.com.encuestaapp.domain.model.BusLinesObject;
import gist.unican.com.encuestaapp.domain.model.BusLinesObjectItem;
import gist.unican.com.encuestaapp.domain.model.BusStopObject;
import gist.unican.com.encuestaapp.domain.model.BusStopObjectItem;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariables;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesItem;
import gist.unican.com.encuestaapp.domain.model.SurveyVariablesObjectCard;
import gist.unican.com.encuestaapp.domain.model.SurveyObjectSendItem;
import gist.unican.com.encuestaapp.domain.model.SurveyQualityVariables;
import gist.unican.com.encuestaapp.domain.model.SurveyQualityVariablesItem;

/**
 * Created by andres on 10/05/2017.
 */

public class SaveInLocalDatabase {
    public SaveInLocalDatabase() {
    }

    public void saveLocalBusLines(BusLinesObject busLinesObject) throws Exception {
        for (BusLinesObjectItem busLinesObjectItem : busLinesObject.getResults()) {
            long id = 0;
            id = busLinesObjectItem.persist().execute();
            if (id == 0) {
                throw new Exception("No insert into local database");
            }
        }
    }

    public void saveLocalBusStops(BusStopObject busStopObject) throws Exception {
        for (BusStopObjectItem busStopObjectItem : busStopObject.getResources()) {
            long id = 0;
            id = busStopObjectItem.persist().execute();
            if (id == 0) {
                throw new Exception("No insert into local database");
            }
        }
    }

    public void saveLocaGeneralVariables(SurveyGeneralVariables surveyGeneralVariables) throws Exception {
        for (SurveyGeneralVariablesItem surveyGeneralVariablesItem : surveyGeneralVariables.getSurveyGeneralVariablesItems()) {
            long id = 0;
            id = surveyGeneralVariablesItem.persist().execute();
            if (id == 0) {
                throw new Exception("No insert into local database");
            }
        }
    }
    public void saveLocaGeneralVariablesAnswers(List<SurveyVariablesObjectCard> surveyVariablesObjectCardList) throws Exception {
        for (SurveyVariablesObjectCard surveyVariablesObjectCard : surveyVariablesObjectCardList) {
            long id = 0;
            id = surveyVariablesObjectCard.persist().execute();
            if (id == 0) {
                throw new Exception("No insert into local database");
            }
        }
    }

    public void saveLocaQualityVariables(SurveyQualityVariables surveyQualityVariables) throws Exception {
        for (SurveyQualityVariablesItem surveyQualityVariablesItem : surveyQualityVariables.getResults()) {
            long id = 0;
            id = surveyQualityVariablesItem.persist().execute();
            if (id == 0) {
                throw new Exception("No insert into local database");
            }
        }
    }

    public void saveUserAaswers(SurveyObjectSendItem surveyObjectSendItem) throws Exception {

        long id = 0;
        id = surveyObjectSendItem.persist().execute();
        if (id == 0) {
            throw new Exception("No insert into local database");

        }
    }
}
