package gist.unican.com.encuestaapp.data.encuesta;

import gist.unican.com.encuestaapp.domain.model.BusLinesObject;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariables;
import gist.unican.com.encuestaapp.domain.model.SurveyQualityVariables;
import okhttp3.RequestBody;
import rx.Observable;

/**
 * Created by andres on 08/05/2017.
 */

public interface ResourcesSurvey {
    Observable<BusLinesObject> getBusLines();
    Observable<SurveyGeneralVariables> getSurveyGeneral();
    Observable<SurveyQualityVariables> getSurveyQuality();
    Observable<Void> setSurveyFinished(RequestBody body);
}
