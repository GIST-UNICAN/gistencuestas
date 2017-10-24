package gist.unican.com.encuestaapp.domain.DataPersistance;

import com.siimkinks.sqlitemagic.Select;

import java.util.List;

import static com.siimkinks.sqlitemagic.BusLinesObjectItemTable.BUS_LINES_OBJECT_ITEM;
import static com.siimkinks.sqlitemagic.BusStopObjectItemTable.BUS_STOP_OBJECT_ITEM;
import static com.siimkinks.sqlitemagic.SurveyGeneralVariablesItemTable.SURVEY_GENERAL_VARIABLES_ITEM;
import static com.siimkinks.sqlitemagic.SurveyObjectSendItemTable.SURVEY_OBJECT_SEND_ITEM;
import static com.siimkinks.sqlitemagic.SurveyQualityVariablesItemTable.SURVEY_QUALITY_VARIABLES_ITEM;
import static com.siimkinks.sqlitemagic.SurveyVariablesObjectCardTable.SURVEY_VARIABLES_OBJECT_CARD;


public class RestoreFromLocalDatabase {
    public RestoreFromLocalDatabase() {
    }

    public List busLines() throws Exception {
        List vuelta_item = Select.from(BUS_LINES_OBJECT_ITEM).execute();
        if (vuelta_item == null) {
            throw new Exception("No items in database");
        }
        return vuelta_item;
    }

    public List busStops() throws Exception {
        List vuelta_item = Select.from(BUS_STOP_OBJECT_ITEM).execute();
        if (vuelta_item == null) {
            throw new Exception("No items in database");
        }
        return vuelta_item;
    }

    public List generalVariables() throws Exception {
        List vuelta_item = Select.from(SURVEY_GENERAL_VARIABLES_ITEM).execute();
        if (vuelta_item == null) {
            throw new Exception("No items in database");
        }
        return vuelta_item;
    }
    public List variablesAnswers()throws Exception {
        List vuelta_item = Select.from(SURVEY_VARIABLES_OBJECT_CARD).execute();
        if (vuelta_item == null) {
            throw new Exception("No items in database");
        }
        return vuelta_item;
    }

    public List qualityVariables() throws Exception {
        List vuelta_item = Select.from(SURVEY_QUALITY_VARIABLES_ITEM).execute();
        if (vuelta_item == null) {
            throw new Exception("No items in database");
        }
        return vuelta_item;
    }

    public List surveyObjectSend() throws Exception {
        List vuelta_item = Select.from(SURVEY_OBJECT_SEND_ITEM).execute();
        if (vuelta_item == null) {
            throw new Exception("No items in database");
        }
        return vuelta_item;
    }
}
