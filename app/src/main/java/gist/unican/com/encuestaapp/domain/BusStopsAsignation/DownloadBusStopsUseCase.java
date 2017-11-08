package gist.unican.com.encuestaapp.domain.BusStopsAsignation;

import gist.unican.com.encuestaapp.data.encuesta.ResourcesDataSurvey;
import gist.unican.com.encuestaapp.data.encuesta.ResourcesSurvey;
import gist.unican.com.encuestaapp.domain.UseCase;
import io.reactivex.Observable;

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