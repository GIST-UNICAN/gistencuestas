package gist.unican.com.encuestaapp.ui.MainScreen;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.race604.drawable.wave.WaveDrawable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemSelected;
import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.BusStopsAsignation.BusAsignation;
import gist.unican.com.encuestaapp.domain.BusStopsAsignation.DownloadBusLinesUseCase;
import gist.unican.com.encuestaapp.domain.BusStopsAsignation.DownloadBusStopsUseCase;
import gist.unican.com.encuestaapp.domain.DataPersistance.DeleteInLocalDatabase;
import gist.unican.com.encuestaapp.domain.DataPersistance.RestoreFromLocalDatabase;
import gist.unican.com.encuestaapp.domain.DataPersistance.SaveInLocalDatabase;
import gist.unican.com.encuestaapp.domain.Utils.OrderListGeneralVariables;
import gist.unican.com.encuestaapp.domain.Utils.Utils;
import gist.unican.com.encuestaapp.domain.encuesta.DownloadGeneralVariablesUseCase;
import gist.unican.com.encuestaapp.domain.encuesta.DownloadQualityVariablesUseCase;
import gist.unican.com.encuestaapp.domain.encuesta.SaveSurveyUseCase;
import gist.unican.com.encuestaapp.domain.model.BusLinesObject;
import gist.unican.com.encuestaapp.domain.model.BusLinesObjectItem;
import gist.unican.com.encuestaapp.domain.model.BusStopObject;
import gist.unican.com.encuestaapp.domain.model.BusStopObjectItem;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariables;
import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesItem;
import gist.unican.com.encuestaapp.domain.model.SurveyObjectSend;
import gist.unican.com.encuestaapp.domain.model.SurveyObjectSendItem;
import gist.unican.com.encuestaapp.domain.model.SurveyQualityVariables;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import static gist.unican.com.encuestaapp.domain.Utils.Constants.AYTO_URL_LINES;
import static gist.unican.com.encuestaapp.domain.Utils.Constants.AYTO_URL_STOPS;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainScreenFragment extends Fragment {
    @Nullable
    @BindView(R.id.lastSync)
    TextView lastSync;
    @Nullable
    @BindView(R.id.spinner2)
    Spinner selectorLineas;
    @Nullable
    @BindView(R.id.spinner3)
    Spinner selectorSublineas;
    @Nullable
    @BindView(R.id.spinner4)
    Spinner selectorSentidos;
    @Nullable
    @BindView(R.id.button)
    Button sincronizarBoton;
    @Nullable
    @BindView(R.id.button2)
    Button enviarDatosBoton;
    @Nullable
    @BindView(R.id.floatingActionButton)
    FloatingActionButton nuevaEncuestaBoton;
    @Nullable
    @BindView(R.id.content)
    LinearLayout content;
    @Nullable
    @BindView(R.id.loading_layout)
    LinearLayout loadingLayout;
    @Nullable
    @BindView(R.id.loading_image)
    ImageView loading_image;
    @Nullable
    @BindView(R.id.error_layout)
    LinearLayout errorLayout;
    @Nullable
    @BindView(R.id.loading_progress)
    ProgressBar progressBar;


    MainScreenFragment.OnNewSurveyClicked newSurveyListener;


    //lista para los buses
    private List<String> listAytoNumbers = new ArrayList<>();
    private List<BusStopObjectItem> listStopsByLine = new ArrayList<>();

    //base de datos local
    DeleteInLocalDatabase deleteLocalDatabase = new DeleteInLocalDatabase();
    RestoreFromLocalDatabase restoreLocalDatabase = new RestoreFromLocalDatabase();
    SaveInLocalDatabase saveLocalDatabase = new SaveInLocalDatabase();

    //Booleano para saber si se han recuperado de la base de datos las lineas y paradas
    Boolean paradasYLineasRecuperadas = false;

    //Utilidades
    Utils utilidades = new Utils();

    //Objetos
    public BusLinesObject busLinesObject1;
    public BusStopObject busStopObject1;


    public interface OnNewSurveyClicked {
        void onNewSurveySelected();
    }

    @Override
    public void onAttach(Context context) {
        //give a context to the calls from other activities
        super.onAttach(context);
        if (context instanceof MainScreenFragment.OnNewSurveyClicked) {
            newSurveyListener = (MainScreenFragment.OnNewSurveyClicked) context;
        } else {
            throw new ClassCastException(context.toString() + " must implements  MainScreenFragment.OnNewSurveyClicked");
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_screen, null);
        ButterKnife.bind(this, view);
        Log.d("Bind Fragment", "true");
        // empieza tod o oculto salvo sincronizar datos
        selectorLineas.setVisibility(View.GONE);
        selectorSublineas.setVisibility(View.GONE);
        selectorSentidos.setVisibility(View.GONE);
        nuevaEncuestaBoton.setVisibility(View.GONE);
        enviarDatosBoton.setVisibility(View.GONE);
        //se recupera el momento de la ultima sincronización de preferencias y se muestra
        Utils utilidades = new Utils();
        String lastsincro = utilidades.getLastSyncFromPreference(getContext());
        if (lastsincro != null) {
            lastSync.setText(lastsincro);
            // tratamos de recuperar de la bd local si exixtieran las paradas y las lineas, si no existen se lanza un mensaje para descargarlo
            try {
                Log.d("RECUPERADAS", "LINEAS");
                List<BusLinesObjectItem> listaLineas = restoreLocalDatabase.busLines();
                BusLinesObject objetoLineas = new BusLinesObject();
                objetoLineas.setResults(listaLineas);
                generateLinesSpinner(objetoLineas);
                paradasYLineasRecuperadas = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else lastSync.setText(getString(R.string.NEVER));

        //intentamos recuperar encuestas hechas para mostrar el boton
        if (isOnline()) {
            try {
                List<SurveyObjectSendItem> lista = restoreLocalDatabase.surveyObjectSend();
                if (lista.get(0) != null) {
                    enviarDatosBoton.setVisibility(View.VISIBLE);
                }
            } catch (Exception e) {
                enviarDatosBoton.setVisibility(View.GONE);
                e.printStackTrace();
            }
        } else {
            //No internet
            sincronizarBoton.setVisibility(View.GONE);
        }
        showContent();
        return view;

    }

    // 3 posibles casos que es hacer clicken cada uno de los botones

    @Nullable
    @OnClick(R.id.button)
    void sincronizarPulsado() {
        showLoading();
        paradasYLineasRecuperadas = false;
        new DownloadBusLinesUseCase(AYTO_URL_LINES).execute(new MainScreenFragment.GetBusLines());
        new DownloadBusStopsUseCase(AYTO_URL_STOPS).execute(new MainScreenFragment.GetBusStops());
        new DownloadGeneralVariablesUseCase().execute(new MainScreenFragment.GetGeneralVariables());
        new DownloadQualityVariablesUseCase().execute(new MainScreenFragment.GetQualityVariables());
    }

    //carga las sublineas al hacer click en la linea
    @Nullable
    @OnItemSelected(R.id.spinner2)
    void mostrarSublineas() {
        //showLoading();
        if (paradasYLineasRecuperadas) {
            Log.d("ESTADO", "2");

            List<BusStopObjectItem> listaParadas = null;
            try {
                listaParadas = restoreLocalDatabase.busStops();
                BusStopObject objetoParadas = new BusStopObject();
                objetoParadas.setResources(listaParadas);
                generateSublinesSpinner(objetoParadas);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            //new DownloadBusStopsUseCase(AYTO_URL_STOPS).execute(new MainScreenFragment.GetBusStops());
        }

    }

    //carga las sublineas al hacer click en la linea
    @Nullable
    @OnItemSelected(R.id.spinner3)
    void mostrarSentidos() {
        //showLoading();
        Log.d("ESTADO", "3");
        generateWaysSppiner(selectorSublineas.getSelectedItem().toString());

    }


    @Nullable
    @OnClick(R.id.button2)
    void enviarPulsado() {
        List<SurveyObjectSendItem> lista = new ArrayList<>();
        try {
            lista = restoreLocalDatabase.surveyObjectSend();
        } catch (Exception e) {
            e.printStackTrace();
        }
        SurveyObjectSend objetoEnvio = new SurveyObjectSend();
        objetoEnvio.setData(lista);
        showLoading();
        new SaveSurveyUseCase(objetoEnvio).execute(new MainScreenFragment.SetStoragedSurveys());


    }

    @Nullable
    @OnClick(R.id.floatingActionButton)
    public void nuevaEncuestaPulsado() {
        Log.d("PULSADO,", "PULSADO");
        String lineaSubLineaSentido = selectorLineas.getSelectedItem().toString() + ";" + selectorSublineas.getSelectedItem().toString() + ";" + selectorSentidos.getSelectedItem().toString();
        utilidades.saveLineInPreferences(getContext(), lineaSubLineaSentido);
        newSurveyListener.onNewSurveySelected();
    }

    //SUSCRIBERS
    private final class GetBusLines extends Subscriber<BusLinesObject> {
        //3 callbacks
        //Show the listView
        @Override
        public void onCompleted() {
            //se guarda en preferencias la sincronizacion
            Utils utilidades = new Utils();
            Calendar now = Calendar.getInstance();
            int mes = now.get(Calendar.MONTH) + 1;
            String datetime = now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + "  del  " + now.get(Calendar.DAY_OF_MONTH) + "/" + mes + "/" + now.get(Calendar.YEAR);
            utilidades.saveLastSyncInPreference(getContext(), datetime);
            // lo mostramos
            String lastsincro = utilidades.getLastSyncFromPreference(getContext());
            if (lastsincro != null) {
                lastSync.setText(lastsincro);
            } else lastSync.setText(getString(R.string.NEVER));


        }

        //Show the error
        @Override
        public void onError(Throwable e) {
            Log.e("ERROR buslines ", e.toString());
            e.printStackTrace();
            showError();
        }

        @Override
        public void onNext(BusLinesObject busLinesObject) {
            //guardar bus lines en bd local
            try {
                deleteLocalDatabase.deleteBusLinesTable();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                saveLocalDatabase.saveLocalBusLines(busLinesObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
            busLinesObject1 = busLinesObject;
            //generar el spinner con las lineas
        }

    }


    private final class GetBusStops extends Subscriber<BusStopObject> {
        //3 callbacks
        //Show the listView

        @Override
        public void onCompleted() {
            //guardar bus stops en bd local

        }


        //Show the error
        @Override
        public void onError(Throwable e) {
            Log.e("ERROR buslines ", e.toString());
            e.printStackTrace();
            showError();
        }

        @Override
        public void onNext(final BusStopObject busStopObject) {

            final int elementos = busStopObject.getResources().size();
            progressBar.setVisibility(View.VISIBLE);
            progressBar.setMax(elementos);
            try {
                deleteLocalDatabase.deleteBusStopTable();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //vamos a usar programacion reactiva para guardar en la base de datos
            Observable<Long> observable = Observable.create(new Observable.OnSubscribe<Long>() {

                @Override
                public void call(Subscriber<? super Long> subscriber) {
                    Long contador = Long.valueOf(0);
                    for (BusStopObjectItem busStopObjectItem : busStopObject.getResources()) {
                        long id;
                        id = busStopObjectItem.persist().execute();
                        contador++;
                        subscriber.onNext(contador);
                    }
                    subscriber.onCompleted();
                }
            });

            Observer<Long> observer = new Observer<Long>() {

                @Override
                public void onCompleted() {
                    Log.d("ESTADO", "save_finis");
                    showContent();
                    Toast.makeText(getContext(), getString(R.string.STOPS_SYNCRHONIZED), Toast.LENGTH_LONG).show();

                }

                @Override
                public void onError(Throwable e) {

                }

                @Override
                public void onNext(Long aBoolean) {
                    progressBar.setProgress(Integer.valueOf(String.valueOf(aBoolean)));

                }
            };
            observable.subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(observer);

            paradasYLineasRecuperadas = true;

        }

    }

    private final class GetGeneralVariables extends Subscriber<SurveyGeneralVariables> {
        //3 callbacks
        //Show the listView
        @Override
        public void onCompleted() {
        }

        //Show the error
        @Override
        public void onError(Throwable e) {
            Log.e("ERROR buslines ", e.toString());
            e.printStackTrace();
            showError();
        }

        @Override
        public void onNext(SurveyGeneralVariables surveyGeneralVariables) {
            //guardar bus lines en bd local
            try {
                deleteLocalDatabase.deleteGeneralVariablesTable();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                for (SurveyGeneralVariablesItem item : surveyGeneralVariables.getSurveyGeneralVariablesItems()) {
                    Log.d("ELEMENTO_unorder", item.getNOMBRE());
                }
                OrderListGeneralVariables orderListGeneralVariables = new OrderListGeneralVariables();
                surveyGeneralVariables = orderListGeneralVariables.orderGeneralVariables(surveyGeneralVariables);
                saveLocalDatabase.saveLocaGeneralVariables(surveyGeneralVariables);
                for (SurveyGeneralVariablesItem item : surveyGeneralVariables.getSurveyGeneralVariablesItems()) {
                    Log.d("ELEMENTO", item.getNOMBRE());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private final class GetQualityVariables extends Subscriber<SurveyQualityVariables> {
        //3 callbacks
        //Show the listView
        @Override
        public void onCompleted() {

        }

        //Show the error
        @Override
        public void onError(Throwable e) {
            Log.e("ERROR q variables", e.toString());
            e.printStackTrace();
            showError();
        }

        @Override
        public void onNext(SurveyQualityVariables surveyQualityVariables) {
            //guardar bus lines en bd local
            try {
                deleteLocalDatabase.deleteQualityVariablesTable();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                saveLocalDatabase.saveLocaQualityVariables(surveyQualityVariables);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private final class SetStoragedSurveys extends Subscriber<SurveyObjectSendItem> {
        //3 callbacks
        //Show the listView
        @Override
        public void onCompleted() {
            showContent();
            try {
                deleteLocalDatabase.deleteUserAnswerTable();
                enviarDatosBoton.setVisibility(View.GONE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //Show the error
        @Override
        public void onError(Throwable e) {
            Log.e("ERROR q variables", e.toString());
            e.printStackTrace();
            showError();
        }

        @Override
        public void onNext(SurveyObjectSendItem surveyObjectSendItem) {

        }


    }

    //methods
    private void generateWaysSppiner(String selectedSubline) {

        BusAsignation busAsignation = new BusAsignation();
        List<String> sentidos = busAsignation.waysBySubline(listStopsByLine, selectedSubline);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getContext(), android.R.layout.simple_spinner_item, sentidos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        selectorSentidos.setAdapter(adapter);
        selectorSentidos.setVisibility(View.VISIBLE);
        nuevaEncuestaBoton.setVisibility(View.VISIBLE);
        showContent();
    }

    private void generateSublinesSpinner(BusStopObject busStopObject) {
        BusAsignation busAsignation = new BusAsignation();
        listStopsByLine = busAsignation.stopsLine(selectorLineas.getSelectedItem().toString(), busStopObject);
        List<String> sublineas = busAsignation.sublinesByLine(listStopsByLine);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getContext(), android.R.layout.simple_spinner_item, sublineas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        selectorSublineas.setAdapter(adapter);
        selectorSublineas.setVisibility(View.VISIBLE);
    }

    private void generateLinesSpinner(BusLinesObject busLinesObject) {
        if (busLinesObject != null) {
            listAytoNumbers.clear();
            List<BusLinesObjectItem> lineas_de_autobuses;
            lineas_de_autobuses = busLinesObject.getResults();
            for (BusLinesObjectItem busLineObjectItem : lineas_de_autobuses) {
                listAytoNumbers.add(busLineObjectItem.getAytoNumero());
            }
            Collections.reverse(listAytoNumbers);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                    getContext(), android.R.layout.simple_spinner_item, listAytoNumbers);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            selectorLineas.setAdapter(adapter);
            selectorLineas.setVisibility(View.VISIBLE);

            //actualizamos la sincronizacion
            //showContent();
        } else {
            showError();
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
        progressBar.setVisibility(View.GONE);
        WaveDrawable mWaveDrawable = new WaveDrawable(getContext(), R.drawable.gistlogo);
        loading_image.setImageDrawable(mWaveDrawable);
        mWaveDrawable.setIndeterminate(true);
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

    public boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
}
