package gist.unican.com.gistapp.domain.Login;

import gist.unican.com.gistapp.data.login.ResourcesDataLogin;
import gist.unican.com.gistapp.data.login.ResourcesLogin;
import gist.unican.com.gistapp.domain.UseCase;
import gist.unican.com.gistapp.domain.model.UserObject;
import rx.Observable;

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
