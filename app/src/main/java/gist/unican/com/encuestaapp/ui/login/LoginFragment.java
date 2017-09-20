package gist.unican.com.encuestaapp.ui.login;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.Utils.Utils;
import gist.unican.com.encuestaapp.domain.model.UserObject;


public class LoginFragment extends Fragment {
    @Nullable
    @BindView(R.id.UsuarioLogin)
    private EditText usuario;
    @Nullable
    @BindView(R.id.Password)
    private EditText password;
    @Nullable
    @BindView(R.id.LoginButton)
    private Button loginButton;

    //utilidades para guardar usuario en preferencias
    Utils utilidades = new Utils();

    //objeto usuario
    UserObject userObject;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login, null);
        ButterKnife.bind(this, view);
        Log.d("Bind Fragment", "true");

        return view;
    }

    @OnClick(R.id.LoginButton)
    void onLoginClicked() {
        userObject = new UserObject(usuario.getText().toString(), password.getText().toString());

    }

}
