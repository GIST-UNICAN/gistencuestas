package gist.unican.com.encuestaapp.ui;

import android.app.Application;

import com.siimkinks.sqlitemagic.SqliteMagic;

/**
 * Created by andres on 13/09/2017.
 */

public final  class App  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Fabric.with(this, new Crashlytics());

        SqliteMagic.init(this);
    }
}