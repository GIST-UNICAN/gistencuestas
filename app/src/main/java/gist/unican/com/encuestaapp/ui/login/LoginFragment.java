package gist.unican.com.encuestaapp.ui.login;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import butterknife.OnClick;
import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.Login.LoginUserUseCase;
import gist.unican.com.encuestaapp.domain.Utils.Utils;
import gist.unican.com.encuestaapp.domain.model.CorrectResponse;
import gist.unican.com.encuestaapp.domain.model.UserObject;
import io.reactivex.observers.DisposableObserver;

@EFragment
public class LoginFragment extends Fragment {
    @Nullable
    @ViewById(R.id.UsuarioLogin)
    EditText usuario;
    @Nullable
    @ViewById(R.id.Password)
    EditText password;
    @Nullable
    @ViewById(R.id.LoginFalse)
    TextView loginFalse;
    @Nullable
    @ViewById(R.id.LoginButton)
    Button loginButton;
    @Nullable
    @ViewById(R.id.loginLayout)
    ScrollView content;
    @Nullable
    @ViewById(R.id.error_layout)
    LinearLayout errorLayout;
    @Nullable
    @ViewById(R.id.loading_layout)
    LinearLayout loadingLayout;

    //utilidades para guardar usuario en preferencias
    Utils utilidades = new Utils();

    //objeto usuario
    UserObject userObject;

    //listener
    LoginFragment.OnUserLogged listener;

    public interface OnUserLogged {
        void onCorrectedLoged();

        void onSavedLoged();
    }

    @Override
    public void onAttach(Context context) {
        //give a context to the calls from other activities
        super.onAttach(context);
        if (context instanceof LoginFragment.OnUserLogged) {
            listener = (LoginFragment.OnUserLogged) context;
        } else {
            throw new ClassCastException(context.toString() + " must implements  MainScreenFragment.OnNewSurveyClicked");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login, null);
        usuario=(EditText)view.findViewById(R.id.UsuarioLogin);
        password=(EditText)view.findViewById(R.id.Password);
        loginFalse= (TextView) view.findViewById(R.id.LoginFalse);
        loginButton =(Button) view.findViewById(R.id.LoginButton);
        content=(ScrollView) view.findViewById(R.id.loginLayout);
        errorLayout=(LinearLayout) view.findViewById(R.id.error_layout);
        loadingLayout=(LinearLayout) view.findViewById(R.id.loading_layout);

        Log.d("Bind Fragment", "true");
        try {
            if (utilidades.getUserFromPreference(getContext()) != null) {
                listener.onSavedLoged();
            }
        } catch (Exception e) {
        }

        return view;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        showContent();
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userObject = new UserObject(usuario.getText().toString(), password.getText().toString());
                showLoading();
                new LoginUserUseCase(userObject).execute(new LoginFragment.SetUser());
            }
        });
    }
    @OnClick(R.id.LoginButton)
    void LoginButton() {
        userObject = new UserObject(usuario.getText().toString(), password.getText().toString());
        showLoading();
        new LoginUserUseCase(userObject).execute(new LoginFragment.SetUser());

    }

    private final class SetUser extends DisposableObserver<CorrectResponse> {
        //3 callbacks
        @Override
        public void onComplete() {
            utilidades.saveUserInPreference(getContext(), userObject.getUser());
            listener.onCorrectedLoged();
        }



        @Override
        public void onNext(CorrectResponse aVoid) {

        }

        //Show the error
        @Override
        public void onError(Throwable e) {
            Log.e("ERROR buslines ", e.toString());
            e.printStackTrace();
            loginFalse.setVisibility(View.VISIBLE);
            showContent();
        }


    }

    /**
     * Method used to show error view
     */
    public void showError() {
        content.setVisibility(View.GONE);
        loadingLayout.setVisibility(View.GONE);
        errorLayout.setVisibility(View.VISIBLE);

    }

    /**
     * Method used to show the loading view
     */
    public void showLoading() {
        loadingLayout.setVisibility(View.VISIBLE);
        content.setVisibility(View.GONE);
        errorLayout.setVisibility(View.GONE);
    }

    /**
     * Method used to show the listView
     */
    public void showContent() {
        content.setVisibility(View.VISIBLE);
        loadingLayout.setVisibility(View.GONE);
        errorLayout.setVisibility(View.GONE);
    }

}