package gist.unican.com.encuestaapp.domain.localStorage;

import com.abubusoft.kripton.android.annotation.BindDao;
import com.abubusoft.kripton.android.annotation.BindSqlInsert;
import com.abubusoft.kripton.android.annotation.BindSqlSelect;

import java.util.List;

import gist.unican.com.encuestaapp.domain.model.SurveyGeneralVariablesItem;

/**
 * Created by andres on 08/05/2017.
 */
@BindDao(SurveyGeneralVariablesItem.class)
public interface GeneralVariablesDao {
    @BindSqlInsert(includePrimaryKey = true)
    void insert(SurveyGeneralVariablesItem bean);

    @BindSqlSelect(orderBy = "iD asc")
    List<SurveyGeneralVariablesItem> selectAll();
}
