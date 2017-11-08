package gist.unican.com.encuestaapp.data.encuesta;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;

import gist.unican.com.encuestaapp.domain.model.BusLinesObject;
import gist.unican.com.encuestaapp.domain.model.BusStopObject;
import gist.unican.com.encuestaapp.domain.model.CorrectResponse;
import gist.unican.com.encuestaapp.domain.model.RankingObject;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariables;
import gist.unican.com.encuestaapp.domain.model.SurveyObjectSend;
import gist.unican.com.encuestaapp.domain.model.SurveyQualityVariables;
import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

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

    Gson gson = new GsonBuilder()
            .setLenient()
            .create();

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
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addConverterFactory(new NullOnEmptyConverterFactory())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
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
    public Observable<RankingObject> getRanking() {
        return service.getRanking();
    }

    @Override
    public Observable<CorrectResponse> setSurveyFinished(SurveyObjectSend body) {
        return service.sendSurveyAnswers(body);
    }
}

class NullOnEmptyConverterFactory extends Converter.Factory {

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        final Converter<ResponseBody, ?> delegate = retrofit.nextResponseBodyConverter(this, type, annotations);
        return new Converter<ResponseBody, Object>() {
            @Override
            public Object convert(ResponseBody body) throws IOException {
                if (body.contentLength() == 0) return null;
                return delegate.convert(body);
            }
        };
    }
}