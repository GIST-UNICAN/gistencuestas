package gist.unican.com.encuestaapp.ui.Survey;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.ui.Survey.SurveyList.SurveyAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class SurveyFragment extends Fragment implements SurveyAdapter.OnItemsSelectedInListener {
    int numeroDeVecesQueSePresionaUnaTarjeta = 0;


    public SurveyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_survey, container, false);
    }

    @Override
    public void OnRadioChecked() {
        numeroDeVecesQueSePresionaUnaTarjeta++;
    }
}
