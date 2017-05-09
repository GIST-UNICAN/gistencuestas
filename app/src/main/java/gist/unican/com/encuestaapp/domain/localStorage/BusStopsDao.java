package gist.unican.com.encuestaapp.domain.localStorage;

import com.abubusoft.kripton.android.annotation.BindDao;
import com.abubusoft.kripton.android.annotation.BindSqlInsert;
import com.abubusoft.kripton.android.annotation.BindSqlSelect;

import java.util.List;

import gist.unican.com.encuestaapp.domain.model.BusStopObjectItem;

/**
 * Created by andres on 09/05/2017.
 */
@BindDao(BusStopObjectItem.class)
public interface BusStopsDao {
    @BindSqlInsert(includePrimaryKey = true)
    void insert(BusStopObjectItem bean);

    @BindSqlSelect(orderBy = "id asc")
    List<BusStopObjectItem> selectAll();
}
