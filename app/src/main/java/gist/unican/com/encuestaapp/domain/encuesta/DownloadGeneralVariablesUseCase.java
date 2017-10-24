package gist.unican.com.encuestaapp.domain.encuesta;

import gist.unican.com.encuestaapp.data.encuesta.ResourcesDataSurvey;
import gist.unican.com.encuestaapp.data.encuesta.ResourcesSurvey;
import gist.unican.com.encuestaapp.domain.UseCase;
import rx.Observable;

/**
 * Created by andres on 08/05/2017.
 */

public class DownloadGeneralVariablesUseCase extends UseCase {
    public DownloadGeneralVariablesUseCase() {
    }

    @Override
    protected Observable buildUseCaseObservable() {
        ResourcesSurvey repo = ResourcesDataSurvey.getInstance();
        return repo.getSurveyGeneral();
    }
}