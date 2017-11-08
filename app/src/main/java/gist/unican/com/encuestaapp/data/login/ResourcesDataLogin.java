package gist.unican.com.encuestaapp.data.login;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import gist.unican.com.encuestaapp.domain.model.CorrectResponse;
import gist.unican.com.encuestaapp.domain.model.UserObject;
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

public class ResourcesDataLogin implements ResourcesLogin {
    ApiResourcesLogin service;

    private static final ResourcesDataLogin INSTANCE = new ResourcesDataLogin();

    public static ResourcesLogin getInstance() {
        return INSTANCE;
    }
    Gson gson = new GsonBuilder()
            .setLenient()
            .create();
    private ResourcesDataLogin() {

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
        service = retrofit.create(ApiResourcesLogin.class);
    }

    @Override
    public Observable<CorrectResponse> getUser(UserObject body) {
        return service.sendUser(body);
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
                return delegate.convert(body);                }
        };
    }
}