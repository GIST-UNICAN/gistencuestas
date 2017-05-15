package gist.unican.com.encuestaapp.domain.BusStopsAsignation;

import gist.unican.com.encuestaapp.data.encuesta.ResourcesDataSurvey;
import gist.unican.com.encuestaapp.data.encuesta.ResourcesSurvey;
import gist.unican.com.encuestaapp.domain.UseCase;
import rx.Observable;

/**
 * Created by andres on 09/05/2017.
 */

public class DownloadBusLinesUseCase extends UseCase {
    private String url;

    public DownloadBusLinesUseCase(String url) {
        this.url = url;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        ResourcesSurvey repo = ResourcesDataSurvey.getInstance();
        return repo.getBusLines(url);
    }
}
