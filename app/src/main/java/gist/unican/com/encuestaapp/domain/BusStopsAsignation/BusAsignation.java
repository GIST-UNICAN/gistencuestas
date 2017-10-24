package gist.unican.com.encuestaapp.domain.BusStopsAsignation;


import java.util.ArrayList;
import java.util.List;

import gist.unican.com.encuestaapp.domain.model.BusStopObject;
import gist.unican.com.encuestaapp.domain.model.BusStopObjectItem;

/**
 * Created by andres on 10/05/2017.
 */

public class BusAsignation {
    //se pasa el ayto Numero y una lista de todas las paradas para separar las que pertenecen a esa linea
    public List stopsLine(String aytoNumero, BusStopObject busStopObject) {
        List<BusStopObjectItem> stops = new ArrayList<BusStopObjectItem>();
        for (BusStopObjectItem busStopObjectItem : busStopObject.getResources()) {
            //si la parada es de la linea se añade
            if (busStopObjectItem.getDcEtiquetaLinea().equalsIgnoreCase(aytoNumero)) {
                stops.add(busStopObjectItem);
            }
        }
        return stops;
    }


    //lista de las Sublineas de una linea
    public List sublinesByLine(List<BusStopObjectItem> busStopObjectItemList) {
        List<String> sublineas = new ArrayList<>();
        for (BusStopObjectItem busStopObjectItem : busStopObjectItemList) {
            if (sublineas.size() == 0) {
                sublineas.add(busStopObjectItem.getAytoNombreSublinea());
            }
            // para cada elemento de la lista de paradas si la sublinea no se conoce la almacena como nueva
            if (sublineas.indexOf(busStopObjectItem.getAytoNombreSublinea()) == -1) {
                sublineas.add(busStopObjectItem.getAytoNombreSublinea());
            }
        }
        return sublineas;
    }

    //lista de los sentidos de una sublinea de una linea
    public List waysBySubline(List<BusStopObjectItem> busStopObjectItemList, String sublinea) {

        List<String> sentidos = new ArrayList<>();
        for (BusStopObjectItem busStopObjectItem : busStopObjectItemList) {
            if (busStopObjectItem.getAytoNombreSublinea().equalsIgnoreCase(sublinea)) {//si la parada de la linea es de la sublinea
                if (sentidos.size() == 0) {//la primera siempre se añade
                    sentidos.add(busStopObjectItem.getAytoSentidoRuta());
                }
                // para cada elemento de la lista de paradas si el sentido de la sublinea no se conoce se añade
                if (sentidos.indexOf(busStopObjectItem.getAytoSentidoRuta()) == -1) {
                    sentidos.add(busStopObjectItem.getAytoSentidoRuta());
                }
            }
        }
        return sentidos;
    }

    //lista de las paradas sde una linea dada la sublinea y el sentido
    public List stopsBySublineAndWay(List<BusStopObjectItem> busStopObjectItemList,
                                     String sublinea, String way) {
        List<BusStopObjectItem> stops = new ArrayList();
        for (BusStopObjectItem busStopObjectItem : busStopObjectItemList) {
            if (busStopObjectItem.getAytoNombreSublinea().equalsIgnoreCase(sublinea) &&
                    busStopObjectItem.getAytoSentidoRuta().equalsIgnoreCase(way)) {
                //si coinciden linea y sublinea se añade
                stops.add(busStopObjectItem);
            }
        }
        return stops;
    }

}
