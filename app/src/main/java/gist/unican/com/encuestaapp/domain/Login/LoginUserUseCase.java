package gist.unican.com.encuestaapp.domain.Login;

import gist.unican.com.encuestaapp.data.login.ResourcesDataLogin;
import gist.unican.com.encuestaapp.data.login.ResourcesLogin;
import gist.unican.com.encuestaapp.domain.UseCase;
import gist.unican.com.encuestaapp.domain.model.UserObject;
import io.reactivex.Observable;

/**
 * Created by andres on 08/05/2017.
 */

public class LoginUserUseCase extends UseCase {
    UserObject body;

    public LoginUserUseCase(UserObject body) {
        this.body = body;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        ResourcesLogin repo = ResourcesDataLogin.getInstance();
        return repo.getUser(body);
    }

}
