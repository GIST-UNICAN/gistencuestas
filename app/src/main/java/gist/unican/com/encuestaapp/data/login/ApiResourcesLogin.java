package gist.unican.com.encuestaapp.data.login;

import gist.unican.com.encuestaapp.domain.model.CorrectResponse;
import gist.unican.com.encuestaapp.domain.model.UserObject;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by andres on 08/05/2017.
 */

public interface ApiResourcesLogin {

    @Headers("Content-Type: application/json")
    @POST("encuestas/usuario")
    Observable<CorrectResponse> sendUser(@Body UserObject body);
}
