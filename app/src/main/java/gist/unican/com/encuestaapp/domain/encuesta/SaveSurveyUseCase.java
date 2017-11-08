package gist.unican.com.encuestaapp.domain.encuesta;

import gist.unican.com.encuestaapp.data.encuesta.ResourcesDataSurvey;
import gist.unican.com.encuestaapp.data.encuesta.ResourcesSurvey;
import gist.unican.com.encuestaapp.domain.UseCase;
import gist.unican.com.encuestaapp.domain.model.SurveyObjectSend;
import io.reactivex.Observable;

/**
 * Created by andres on 08/05/2017.
 */

public class SaveSurveyUseCase extends UseCase {
    SurveyObjectSend body;

    public SaveSurveyUseCase(SurveyObjectSend surveyObjectSend) {
        this.body = surveyObjectSend;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        ResourcesSurvey repo = ResourcesDataSurvey.getInstance();
        return repo.setSurveyFinished(body);
    }
}