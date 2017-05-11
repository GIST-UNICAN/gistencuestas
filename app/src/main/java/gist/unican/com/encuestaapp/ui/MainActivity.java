package gist.unican.com.encuestaapp.ui;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.siimkinks.sqlitemagic.SqliteMagic;

import butterknife.BindView;
import gist.unican.com.encuestaapp.R;

public class MainActivity extends AppCompatActivity {
    @BindView()
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
        Context context = getApplicationContext();
        SqliteMagic.init((Application) context);
    }

}
