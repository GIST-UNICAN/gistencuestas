package gist.unican.com.encuestaapp.domain.localStorage;

import com.abubusoft.kripton.android.annotation.BindDao;
import com.abubusoft.kripton.android.annotation.BindSqlDelete;
import com.abubusoft.kripton.android.annotation.BindSqlInsert;
import com.abubusoft.kripton.android.annotation.BindSqlSelect;

import java.util.List;

import gist.unican.com.encuestaapp.domain.model.SurveyObjectSend;

/**
 * Created by andres on 08/05/2017.
 */
@BindDao(SurveyObjectSend.class)
public interface UserAnswerDao {
    @BindSqlInsert(includePrimaryKey = true)
    void insert(SurveyObjectSend bean);
    @BindSqlSelect(orderBy = "id asc")
    List<SurveyObjectSend> selectAll();
    @BindSqlDelete(where="id=${bean.id}")
    void deleteOne(SurveyObjectSend bean);

}
