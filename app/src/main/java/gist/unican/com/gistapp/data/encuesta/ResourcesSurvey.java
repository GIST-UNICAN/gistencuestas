package gist.unican.com.gistapp.data.encuesta;

import gist.unican.com.gistapp.domain.model.BusLinesObject;
import gist.unican.com.gistapp.domain.model.BusStopObject;
import gist.unican.com.gistapp.domain.model.RankingObject;
import gist.unican.com.gistapp.domain.model.SurveyGeneralVariables;
import gist.unican.com.gistapp.domain.model.SurveyObjectSend;
import gist.unican.com.gistapp.domain.model.SurveyQualityVariables;
import rx.Observable;

/**
 * Created by andres on 08/05/2017.
 */

public interface ResourcesSurvey {
    Observable<BusLinesObject> getBusLines(String url);

    Observable<BusStopObject> getBusStops(String url);

    Observable<SurveyGeneralVariables> getSurveyGeneral();

    Observable<RankingObject> getRanking();

    Observable<SurveyQualityVariables> getSurveyQuality();

    Observable<Void> setSurveyFinished(SurveyObjectSend body);
}
