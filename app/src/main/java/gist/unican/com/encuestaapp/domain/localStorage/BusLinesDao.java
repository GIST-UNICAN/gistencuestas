package gist.unican.com.encuestaapp.domain.localStorage;

import com.abubusoft.kripton.android.annotation.BindDao;
import com.abubusoft.kripton.android.annotation.BindSqlInsert;
import com.abubusoft.kripton.android.annotation.BindSqlSelect;

import java.util.List;

import gist.unican.com.encuestaapp.domain.model.BusLinesObjectItem;

/**
 * Created by andres on 08/05/2017.
 */
@BindDao(BusLinesObjectItem.class)
public interface BusLinesDao {
    @BindSqlInsert(includePrimaryKey = true)
    void insert(BusLinesObjectItem bean);
    @BindSqlSelect(orderBy = "aytoNumero asc")
    List<BusLinesObjectItem> selectAll();
}
