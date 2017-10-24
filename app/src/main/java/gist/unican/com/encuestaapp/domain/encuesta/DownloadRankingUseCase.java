package gist.unican.com.encuestaapp.domain.encuesta;

import gist.unican.com.encuestaapp.data.encuesta.ResourcesDataSurvey;
import gist.unican.com.encuestaapp.data.encuesta.ResourcesSurvey;
import gist.unican.com.encuestaapp.domain.UseCase;
import rx.Observable;

/**
 * Created by andres on 26/09/2017.
 */

public class DownloadRankingUseCase extends UseCase {
    public DownloadRankingUseCase() {
    }

    @Override
    protected Observable buildUseCaseObservable() {
        ResourcesSurvey repo = ResourcesDataSurvey.getInstance();
        return repo.getRanking();
    }
}
