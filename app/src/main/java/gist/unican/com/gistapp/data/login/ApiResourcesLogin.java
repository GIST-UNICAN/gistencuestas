package gist.unican.com.gistapp.data.login;

import gist.unican.com.gistapp.domain.model.UserObject;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by andres on 08/05/2017.
 */

public interface ApiResourcesLogin {

    @Headers("Content-Type: application/json")
    @POST("encuestas/usuario")
    Observable<Void> sendUser(@Body UserObject body);
}
