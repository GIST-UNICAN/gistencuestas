package gist.unican.com.gistapp.domain.BusStopsAsignation;

import gist.unican.com.gistapp.data.encuesta.ResourcesDataSurvey;
import gist.unican.com.gistapp.data.encuesta.ResourcesSurvey;
import gist.unican.com.gistapp.domain.UseCase;
import rx.Observable;

/**
 * Created by andres on 09/05/2017.
 */

public class DownloadBusStopsUseCase extends UseCase {
    private String url;

    public DownloadBusStopsUseCase(String url) {
        this.url = url;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        ResourcesSurvey repo = ResourcesDataSurvey.getInstance();
        return repo.getBusStops(url);
    }
}