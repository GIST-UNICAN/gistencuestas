package gist.unican.com.encuestaapp.ui;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.Utils.Utils;
import gist.unican.com.encuestaapp.domain.model.RankingObjectItem;
import gist.unican.com.encuestaapp.ui.MainScreen.MainScreenFragment;
import gist.unican.com.encuestaapp.ui.Survey.Ranking.RankingFragment;
import gist.unican.com.encuestaapp.ui.Survey.SurveyFragment;
import gist.unican.com.encuestaapp.ui.login.LoginFragment;
import gist.unican.com.encuestaapp.ui.map.LoopSensorFragment;
import gist.unican.com.encuestaapp.ui.map.TransportMapFragment;

public class MainActivity extends AppCompatActivity implements MainScreenFragment.OnNewSurveyClicked, SurveyFragment.onFinishSurvey, LoginFragment.OnUserLogged, RankingFragment.OnListFragmentInteractionListener {


    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    @Nullable
    @BindView(R.id.main_content)
    LinearLayout relativeLayout;
    @Nullable
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Nullable
    @BindView(R.id.navview)
    NavigationView navigationView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @Nullable
    @BindView(R.id.menu_user)
    TextView menuUser;

    String fragment = "login";

    //Utilidades
    Utils utilidades = new Utils();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("PATH", this.getFilesDir().getAbsolutePath());
        setContentView(R.layout.navigationdrawer);
        ButterKnife.bind(this);
        if (!fragment.equalsIgnoreCase("login")) {
            setToolbar();
            menuHamburguesa();
        } else {
            toolbar.setVisibility(View.GONE);
        }
        Context context = getApplicationContext();
        //SqliteMagic.init((Application) context);
        /**
         * Lets inflate the very first fragment
         */
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            // Request both READ_EXTERNAL_STORAGE and WRITE_EXTERNAL_STORAGE so that the
            // Pushy SDK will be able to persist the device token in the external storage
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0);
        }

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_content, new LoginFragment()).addToBackStack("tag").commit();


    }

    @Override
    public void onNewSurveySelected() {
        fragment = "survey";
        setToolbar();
        menuHamburguesa();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_content, new SurveyFragment()).addToBackStack("tag").commit();
    }


    @Override
    public void loadMainScreen() {
        fragment = "mainScreen";
        setToolbar();
        menuHamburguesa();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_content, new MainScreenFragment()).addToBackStack("tag").commit();
    }

    @Override
    public void onCorrectedLoged() {
        fragment = "mainScreen";
        setToolbar();
        menuHamburguesa();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_content, new MainScreenFragment()).addToBackStack("tag").commit();
    }

    @Override
    public void onSavedLoged() {
        fragment = "mainScreen";
        setToolbar();
        menuHamburguesa();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_content, new MainScreenFragment()).addToBackStack("tag").commit();

    }

    @Override
    public void onBackPressed() {
        Log.d("BACK", "BACK");
    }

    @Override
    public void onListFragmentInteraction(RankingObjectItem item) {

    }

    private void setToolbar() {
        if (!fragment.equalsIgnoreCase("login")) {
            toolbar.setVisibility(View.VISIBLE);
            menuUser.setText("Logueado como: " + utilidades.getUserFromPreference(getApplicationContext()));
            menuUser.setTextSize(20);
            setSupportActionBar(toolbar);

            final ActionBar ab = getSupportActionBar();
            if (ab != null) {
                // Poner ícono del drawer toggle
                //ab.setHomeAsUpIndicator(R.drawable.ic_hamburger);
                //ab.setDisplayHomeAsUpEnabled(true);
            }
            ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout,
                    toolbar, R.string.app_name, R.string.error_message);

            drawerLayout.setDrawerListener(drawerToggle);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
            drawerToggle.syncState();
        } else {
            toolbar.setVisibility(View.GONE);
        }
    }

    void menuHamburguesa() {
        if (!fragment.equalsIgnoreCase("login")) {
            navigationView.setNavigationItemSelectedListener(
                    new NavigationView.OnNavigationItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(MenuItem menuItem) {


                            switch (menuItem.getItemId()) {
                                case R.id.menu_seccion_1:
                                    utilidades.deleteUserPreferences(getApplicationContext());
                                    fragment = "login";
                                    setToolbar();
                                    menuHamburguesa();
                                    fragmentManager = getSupportFragmentManager();
                                    fragmentTransaction = fragmentManager.beginTransaction();
                                    fragmentTransaction.replace(R.id.main_content, new LoginFragment()).addToBackStack("tag").commit();
                                    Log.i("NavigationView", "LOGOUT");
                                    break;

                                case R.id.menu_opcion_1:
                                    fragment = "mainScreen";
                                    setToolbar();
                                    menuHamburguesa();
                                    fragmentManager = getSupportFragmentManager();
                                    fragmentTransaction = fragmentManager.beginTransaction();
                                    fragmentTransaction.replace(R.id.main_content, new MainScreenFragment()).addToBackStack("tag").commit();
                                    break;

                                case R.id.menu_opcion_2:
                                    fragment = "mapScreen";
                                    setToolbar();
                                    menuHamburguesa();
                                    fragmentManager = getSupportFragmentManager();
                                    fragmentTransaction = fragmentManager.beginTransaction();
                                    fragmentTransaction.replace(R.id.main_content, new TransportMapFragment()).addToBackStack("tag").commit();
                                    break;
                                case R.id.menu_opcion_3:
                                    fragment = "mapScreenTraffic";
                                    setToolbar();
                                    menuHamburguesa();
                                    fragmentManager = getSupportFragmentManager();
                                    fragmentTransaction = fragmentManager.beginTransaction();
                                    fragmentTransaction.replace(R.id.main_content, new LoopSensorFragment()).addToBackStack("tag").commit();
                                    break;
                                case R.id.menu_opcion_4:
                                    fragment = "ranking";
                                    setToolbar();
                                    menuHamburguesa();
                                    fragmentManager = getSupportFragmentManager();
                                    fragmentTransaction = fragmentManager.beginTransaction();
                                    fragmentTransaction.replace(R.id.main_content, new RankingFragment()).addToBackStack("tag").commit();
                                    break;

                            }


                            drawerLayout.closeDrawers();

                            return true;
                        }
                    });
        }
    }


}
