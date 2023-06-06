package modelos;

import excepciones.CapacidadMinimaException;
import interfaces.I_ToJSON;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class ControladoraAeropuertos {
    private ArrayList<Aeropuerto> aeropuertos;

    public ControladoraAeropuertos() {
        this.aeropuertos = new ArrayList<>();
    }

    public void agregarAeropuerto(Aeropuerto aeropuerto) {
        aeropuertos.add(aeropuerto);
    }


    public JSONArray toJsonArray() throws JSONException {
        JSONArray json_array = new JSONArray();
        for (Aeropuerto elemento : aeropuertos) {
            json_array.put(elemento.toJson());
        }

        return json_array;
    }

    public ArrayList<Aeropuerto> filtrarAeropuertos(int capacidad) throws CapacidadMinimaException {
        ArrayList<Aeropuerto> nuevaLista = new ArrayList<>();

        System.out.println(aeropuertos);
        for (Aeropuerto elemento : aeropuertos) {
            if (elemento.getCapacidad() > capacidad) {
                nuevaLista.add(elemento);
            } else {
                throw new CapacidadMinimaException("La capacidad del aeropuerto es inferior al minimo de ", elemento.getCapacidad());
            }
        }

        return nuevaLista;
    }

    public String mostrarAeropuertos() {
        String texto = "";
        for (Aeropuerto elemento : aeropuertos) {
            texto += elemento.toString() + "\n";
        }
        return texto;
    }


    public Generica<String> almacenarPilotos() {
        Generica<String> pilotos = new Generica<>();

        for (Aeropuerto elemento : aeropuertos) {
            ArrayList<String> pilotosArr = elemento.getPilotos();
            for (String item : pilotosArr) {
                pilotos.agregarElemento(item);
            }
        }
        return pilotos;
    }

    public Generica<String> almacenarTags() {
        Generica<String> etiquetas = new Generica<>();
        for (Aeropuerto elemento : aeropuertos) {
            ArrayList<String> tags = elemento.getTags();
            for (String item : tags) {
                etiquetas.agregarElemento(item);
            }
        }
        return etiquetas;
    }
}
