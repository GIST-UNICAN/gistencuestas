package gist.unican.com.encuestaapp.data.encuesta;

import gist.unican.com.encuestaapp.domain.model.BusLinesObject;
import gist.unican.com.encuestaapp.domain.model.BusStopObject;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariables;
import gist.unican.com.encuestaapp.domain.model.SurveyObjectSend;
import gist.unican.com.encuestaapp.domain.model.SurveyQualityVariables;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by andres on 08/05/2017.
 */

public interface ApiResourcesSurvey {
    @Headers("Content-Type: application/json")
    @GET("encuestas/generalvariables/")
    Observable<SurveyGeneralVariables> getGeneralVariables();

    @Headers("Content-Type: application/json")
    @GET("encuestas/qualityvariables/")
    Observable<SurveyQualityVariables> getQualityVariables();

    @Headers("Content-Type: application/json")
    @GET
    Observable<BusLinesObject> getBusLines(@Url String url);

    @Headers("Content-Type: application/json")
    @POST("encuestas/datosenvia")
    Observable<Void> sendSurveyAnswers(@Body SurveyObjectSend body);

    @Headers("Content-Type: application/json")
    @GET
    Observable<BusStopObject> getBusStops(@Url String url);

}
