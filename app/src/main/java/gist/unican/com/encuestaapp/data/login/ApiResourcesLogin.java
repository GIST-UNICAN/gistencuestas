package gist.unican.com.encuestaapp.data.login;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by andres on 08/05/2017.
 */

public interface ApiResourcesLogin {

    @Headers("Content-Type: application/json")
    @POST("URL")
    Observable<Void> sendUser(@Body RequestBody body);
}
