package gist.unican.com.encuestaapp.data.login;

import gist.unican.com.encuestaapp.domain.model.CorrectResponse;
import gist.unican.com.encuestaapp.domain.model.UserObject;
import io.reactivex.Observable;

/**
 * Created by andres on 08/05/2017.
 */

public interface ResourcesLogin {
    Observable<CorrectResponse> getUser(UserObject body);
}
