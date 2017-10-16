package gist.unican.com.gistapp.domain.encuesta;

import gist.unican.com.gistapp.data.encuesta.ResourcesDataSurvey;
import gist.unican.com.gistapp.data.encuesta.ResourcesSurvey;
import gist.unican.com.gistapp.domain.UseCase;
import rx.Observable;

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