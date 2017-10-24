package gist.unican.com.encuestaapp.domain.Utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import gist.unican.com.encuestaapp.domain.model.BusLinesObjectItem;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariables;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesItem;

/**
 * Created by andres on 21/09/2017.
 */

public class OrderLists implements Comparator<SurveyGeneralVariablesItem> {
    public SurveyGeneralVariables orderGeneralVariables(SurveyGeneralVariables surveyGeneralVariables) {
        Collections.sort(surveyGeneralVariables.getSurveyGeneralVariablesItems(), this);
        return surveyGeneralVariables;
    }

    public List<BusLinesObjectItem> orderBusLines(List<BusLinesObjectItem> linesObjectItems) {
        Collections.sort(linesObjectItems, new Comparator<BusLinesObjectItem>() {
            @Override
            public int compare(BusLinesObjectItem o1, BusLinesObjectItem o2) {
                if (isStringInt(o1.getAytoNumero()) && isStringInt(o2.getAytoNumero())) {
                    return Integer.valueOf(o1.getAytoNumero()).compareTo(Integer.valueOf(o2.getAytoNumero()));

                } else {
                    return o1.getAytoNumero().compareTo(o2.getAytoNumero());
                }
            }
        });
        return linesObjectItems;
    }

    @Override
    public int compare(SurveyGeneralVariablesItem o1, SurveyGeneralVariablesItem o2) {
        return Double.valueOf(o1.getOrden()).compareTo(Double.valueOf(o2.getOrden()));
    }

    public boolean isStringInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
