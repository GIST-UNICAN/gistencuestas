package gist.unican.com.encuestaapp.data.login;

import okhttp3.RequestBody;
import rx.Observable;

/**
 * Created by andres on 08/05/2017.
 */

public interface ResourcesLogin {
    Observable<Void> getUser(RequestBody body);
}
