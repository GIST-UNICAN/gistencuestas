package gist.unican.com.encuestaapp.ui;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.siimkinks.sqlitemagic.SqliteMagic;

import butterknife.BindView;
import butterknife.ButterKnife;
import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.ui.MainScreen.MainScreenFragment;
import gist.unican.com.encuestaapp.ui.Survey.SurveyFragment;

public class MainActivity extends AppCompatActivity implements MainScreenFragment.OnNewSurveyClicked{
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    @Nullable
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Context context = getApplicationContext();
        SqliteMagic.init((Application) context);
        /**
         * Lets inflate the very first fragment
         */
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.drawer_layout, new MainScreenFragment()).commit();
       /*
        SurveyObjectSend sob=new SurveyObjectSend();
        sob.setAcoBe(1);
        String variable= "setAcoBe";
        try {
           Method metodo= sob.getClass().getMethod(variable,Integer.class);
            metodo.invoke(1);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/

    }

    @Override
    public void onNewSurveySelected() {
        Log.d("va","si");
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.drawer_layout, new SurveyFragment()).commit();
    }
}
