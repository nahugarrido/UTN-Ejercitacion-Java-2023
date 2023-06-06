package modelos;

import enums.Genero;
import interfaces.I_ToJSON;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class Antalogia extends Libro {
    private int cantidadCuentos;

    public Antalogia(int id, String titulo, String autor, String codigo, Genero genero, int cantidadCuentos) {
        super(id, titulo, autor, codigo, genero);
        this.cantidadCuentos = cantidadCuentos;
    }

    @Override
    public String toString() {
        return "Antalogia{" + super.toString() +
                "cantidadCuentos=" + cantidadCuentos +
                '}';
    }

    @Override
    public boolean equals(Object aComparar) {
        if(aComparar != null && aComparar instanceof Antalogia) {
            return this.getCantidadCuentos() == ((Antalogia) aComparar).getCantidadCuentos();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 3;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject json = super.toJSON();
        json.put("cantidadCuentos", this.getCantidadCuentos());

        return json;
    }

    public int getCantidadCuentos() {
        return cantidadCuentos;
    }

    public void setCantidadCuentos(int cantidadCuentos) {
        this.cantidadCuentos = cantidadCuentos;
    }
}
