package gist.unican.com.encuestaapp.domain.encuesta;

import gist.unican.com.encuestaapp.data.encuesta.ResourcesDataSurvey;
import gist.unican.com.encuestaapp.data.encuesta.ResourcesSurvey;
import gist.unican.com.encuestaapp.domain.UseCase;
import io.reactivex.Observable;

/**
 * Created by andres on 09/05/2017.
 */

public class DownloadQualityVariablesUseCase extends UseCase {
    public DownloadQualityVariablesUseCase() {
    }

    @Override
    protected Observable buildUseCaseObservable() {
        ResourcesSurvey repo = ResourcesDataSurvey.getInstance();
        return repo.getSurveyQuality();
    }
}