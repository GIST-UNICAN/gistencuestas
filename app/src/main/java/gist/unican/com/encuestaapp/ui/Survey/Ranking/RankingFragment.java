package gist.unican.com.encuestaapp.ui.Survey.Ranking;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.race604.drawable.wave.WaveDrawable;

import butterknife.BindView;
import butterknife.ButterKnife;
import gist.unican.com.encuestaapp.R;
import gist.unican.com.encuestaapp.domain.encuesta.DownloadRankingUseCase;
import gist.unican.com.encuestaapp.domain.model.RankingObject;
import gist.unican.com.encuestaapp.domain.model.RankingObjectItem;
import gist.unican.com.encuestaapp.ui.Survey.SurveyList.SurveyAdapter;
import rx.Subscriber;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class RankingFragment extends Fragment {
    @Nullable
    @BindView(R.id.list)
    RecyclerView recyclerView;
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
    //listados
    private LinearLayoutManager layoutManager;
    private SurveyAdapter adapterList;
    // TODO: Customize parameters
    private int mColumnCount = 1;

    private OnListFragmentInteractionListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public RankingFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ranking_list, null);
        ButterKnife.bind(this, view);
        showLoading();
        new DownloadRankingUseCase().execute(new GetRanking());
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction(RankingObjectItem item);
    }

    private final class GetRanking extends Subscriber<RankingObject> {
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
        public void onNext(RankingObject rankingObject) {
            //guardar bus lines en bd local
            Context context = getContext();
            try {
                if (mColumnCount <= 1) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                } else {
                    recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
                }
                recyclerView.setAdapter(new MyRankingRecyclerViewAdapter(rankingObject.getResults(), mListener));
                showContent();
            } catch (Exception e) {
                e.printStackTrace();
            }


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
}
