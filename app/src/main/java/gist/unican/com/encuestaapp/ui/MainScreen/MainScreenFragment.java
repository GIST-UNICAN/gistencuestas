package gist.unican.com.encuestaapp.ui.MainScreen;


import android.content.Context;
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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.BusStopsAsignation.DownloadBusLinesUseCase;
import gist.unican.com.encuestaapp.domain.model.BusLinesObject;
import gist.unican.com.encuestaapp.domain.model.BusLinesObjectItem;
import rx.Subscriber;

import static gist.unican.com.encuestaapp.domain.Utils.Constants.AYTO_URL_LINES;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainScreenFragment extends Fragment {
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
    @BindView(R.id.content)
    RelativeLayout content;
    @Nullable
    @BindView(R.id.loading_layout)
    LinearLayout loadingLayout;
    @Nullable
    @BindView(R.id.error_layout)
    LinearLayout errorLayout;
    MainScreenFragment.OnNewSurveyClicked newSurveyListener;

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
        View view = inflater.inflate(R.layout.main_screen,null);
        ButterKnife.bind(this, view);
        // empieza todo oculto salvo sincronizar datos
        selectorLineas.setVisibility(View.GONE);
        selectorSublineas.setVisibility(View.GONE);
        selectorSentidos.setVisibility(View.GONE);
        enviarDatosBoton.setVisibility(View.GONE);
        nuevaEncuestaBoton.setVisibility(View.GONE);
        return view;

    }

    // 3 posibles casos que es hacer clicken cada uno de los botones
    @OnClick(R.id.button)
    public void sincronizarPulsado() {
        showLoading();
        new DownloadBusLinesUseCase(AYTO_URL_LINES).execute(new MainScreenFragment.GetBusLines());
    }

    @OnClick(R.id.button2)
    public void enviarPulsado() {

    }

    @OnClick(R.id.floatingActionButton)
    public void nuevaEncuestaPulsado() {
        newSurveyListener.onNewSurveySelected();
    }

    //SUSCRIBERS
    private final class GetBusLines extends Subscriber<BusLinesObject> {
        //3 callbacks
        //Show the listView
        @Override
        public void onCompleted() {
        }

        //Show the error
        @Override
        public void onError(Throwable e) {
            Log.e("ERROR buslines ", e.toString());
            showError();
        }

        @Override
        public void onNext(BusLinesObject busLinesObject) {
            //generar el spinner con las lineas
            generateLinesSpinner(busLinesObject);
        }

    }

    private void generateLinesSpinner(BusLinesObject busLinesObject) {
        List<BusLinesObjectItem> lineas_de_autobuses;
        lineas_de_autobuses = busLinesObject.getResults();
        List<String> listAytoNumbers = new ArrayList<>();
        for (BusLinesObjectItem busLineObjectItem : lineas_de_autobuses) {
            listAytoNumbers.add(busLineObjectItem.getAytoNumero());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getContext(), android.R.layout.simple_spinner_item, listAytoNumbers);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        selectorLineas.setAdapter(adapter);
        selectorLineas.setVisibility(View.VISIBLE);
        showContent();

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
