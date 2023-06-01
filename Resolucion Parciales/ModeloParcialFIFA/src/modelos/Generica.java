package modelos;

import interfaces.I_ToJSON;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Generica<T extends I_ToJSON> {
    private ArrayList<T> listaGenerica;

    public Generica() {
        this.listaGenerica = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        listaGenerica.add(elemento);
    }

    public void removerElemento(T elemento) {
        listaGenerica.remove(elemento);
    }

    public String listarElementos() {
        String texto = "";
        for (T elemento : listaGenerica) {
            texto += elemento.toString() + "\n";
        }
        return texto;
    }

    public JSONArray obtenerJsonArray() throws JSONException {
        JSONArray json_integrantes = new JSONArray();
        for( T elemento : listaGenerica) {
            json_integrantes.put(elemento.toJSON());
        }

        return json_integrantes;
    }

    public int contarElementos() {
        int contador = 0;
        for (T elemento : listaGenerica) {
            contador++;
        }
        return contador;
    }

    public boolean hayEntrenador() {
        for (T elemento : this.listaGenerica) {
            if (elemento instanceof Entrenador) {
                return true;
            }
        }
        return false;
    }
}
