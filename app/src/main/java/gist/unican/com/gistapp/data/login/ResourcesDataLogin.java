package gist.unican.com.gistapp.data.login;

import java.util.concurrent.TimeUnit;

import gist.unican.com.gistapp.domain.model.UserObject;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

import static gist.unican.com.gistapp.domain.Utils.Constants.URL_SERVER;

/**
 * Created by andres on 08/05/2017.
 */

public class ResourcesDataLogin implements ResourcesLogin {
    ApiResourcesLogin service;

    private static final ResourcesDataLogin INSTANCE = new ResourcesDataLogin();

    public static ResourcesLogin getInstance() {
        return INSTANCE;
    }

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
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build();
        service = retrofit.create(ApiResourcesLogin.class);
    }

    @Override
    public Observable<Void> getUser(UserObject body) {
        return service.sendUser(body);
    }
}
