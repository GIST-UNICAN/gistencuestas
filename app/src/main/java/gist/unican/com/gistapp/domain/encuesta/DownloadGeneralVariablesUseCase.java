package gist.unican.com.gistapp.domain.encuesta;

import gist.unican.com.gistapp.data.encuesta.ResourcesDataSurvey;
import gist.unican.com.gistapp.data.encuesta.ResourcesSurvey;
import gist.unican.com.gistapp.domain.UseCase;
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