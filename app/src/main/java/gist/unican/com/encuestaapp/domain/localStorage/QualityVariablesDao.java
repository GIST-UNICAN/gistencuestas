package gist.unican.com.encuestaapp.domain.localStorage;

import com.abubusoft.kripton.android.annotation.BindDao;
import com.abubusoft.kripton.android.annotation.BindSqlInsert;
import com.abubusoft.kripton.android.annotation.BindSqlSelect;

import java.util.List;

import gist.unican.com.encuestaapp.domain.model.SurveyQualityVariables;

/**
 * Created by andres on 08/05/2017.
 */
@BindDao(SurveyQualityVariables.class)
public interface QualityVariablesDao {
    @BindSqlInsert(includePrimaryKey = true)
    void insert(SurveyQualityVariables bean);

    @BindSqlSelect(orderBy = "iD asc")
    List<SurveyQualityVariables> selectAll();
}
