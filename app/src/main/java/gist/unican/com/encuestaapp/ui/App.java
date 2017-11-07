package gist.unican.com.encuestaapp.ui;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.siimkinks.sqlitemagic.SqliteMagic;

import io.fabric.sdk.android.Fabric;

/**
 * Created by andres on 13/09/2017.
 */

public final  class App  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        SqliteMagic.init(this);
    }
}