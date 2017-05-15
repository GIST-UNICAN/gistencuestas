package gist.unican.com.encuestaapp.data.encuesta;

import java.util.concurrent.TimeUnit;

import gist.unican.com.encuestaapp.domain.model.BusLinesObject;
import gist.unican.com.encuestaapp.domain.model.BusStopObject;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariables;
import gist.unican.com.encuestaapp.domain.model.SurveyObjectSend;
import gist.unican.com.encuestaapp.domain.model.SurveyQualityVariables;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

import static gist.unican.com.encuestaapp.domain.Utils.Constants.URL_SERVER;

/**
 * Created by andres on 08/05/2017.
 */

public class ResourcesDataSurvey implements ResourcesSurvey {
    ApiResourcesSurvey service;

    private static final ResourcesDataSurvey INSTANCE = new ResourcesDataSurvey();

    public static ResourcesSurvey getInstance() {
        return INSTANCE;
    }

    private ResourcesDataSurvey() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        interceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)

                .writeTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL_SERVER)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build();
        service = retrofit.create(ApiResourcesSurvey.class);
    }

    @Override
    public Observable<BusLinesObject> getBusLines(String url) {
        return service.getBusLines(url);
    }

    @Override
    public Observable<BusStopObject> getBusStops(String url) {
        return service.getBusStops(url);
    }

    @Override
    public Observable<SurveyGeneralVariables> getSurveyGeneral() {
        return service.getGeneralVariables();
    }

    @Override
    public Observable<SurveyQualityVariables> getSurveyQuality() {
        return service.getQualityVariables();
    }

    @Override
    public Observable<Void> setSurveyFinished(SurveyObjectSend body) {
        return service.sendSurveyAnswers(body);
    }
}
