package gist.unican.com.encuestaapp.domain.Utils;

/**
 * Created by andres on 09/05/2017.
 */

public class Constants {//SERVICES
    public static final String URL_SERVER = "http://193.144.208.142:8080/";
    public static final String AYTO_URL_LINES = "http://datos.santander.es/api/rest/datasets/lineas_bus.json?items=50";
    public static final String AYTO_URL_STOPS = "http://193.144.208.142:8080/encuestas/listaparadas";

    //survey sufix
    public static final String[] LISTABREVIATURAS ={"Mm","Ma","No","Bi","Mb","Ns"};
    public static final String[] LISTABREVIATURASBESTWORST ={"Be","Wo","Mi","Li"};
    public static final String MUYMAL = "_mm";
    public static final String MAL = "_ma";
    public static final String NORMAL = "_no";
    public static final String BIEN = "_bi";
    public static final String MUYBIEN = "_mb";
    public static final String NSNC = "_ns";
    public static final String MEJOR = "_be";
    public static final String PEOR = "_wo";
    public static final String MASIMPORTANTE = "_mi";
    public static final String MENOSIMPORTANTE = "_li";
    public static final String GRUPO = "Group";

    //survey elements
    public static final int NUMBER_ITEMS_SCREEN = 4;
    public static final int NUMBER_SCREENS = 5;
    public static final int NUMBER_SCENARIOS = 3;
}
