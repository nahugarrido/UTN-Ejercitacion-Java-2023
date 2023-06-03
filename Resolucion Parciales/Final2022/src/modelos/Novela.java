package modelos;

import enums.Genero;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class Novela extends Libro {
    private String saga;
    private int cantidadCapitulos;

    public Novela(int id, String titulo, String autor, String codigo, Genero genero, String saga, int cantidadCapitulos) {
        super(id, titulo, autor, codigo, genero);
        this.saga = saga;
        this.cantidadCapitulos = cantidadCapitulos;
    }

    @Override
    public String toString() {
        return "Novela{" + super.toString() +
                "saga='" + saga + '\'' +
                ", cantidadCapitulos=" + cantidadCapitulos +
                '}';
    }

    @Override
    public boolean equals(Object aComparar) {
        if(aComparar != null && aComparar instanceof Novela) {
            return this.getSaga().equals(((Novela) aComparar).getSaga()) && this.getCantidadCapitulos() == ((Novela) aComparar).getCantidadCapitulos();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject json = super.toJSON();
        json.put("saga", this.getSaga());
        json.put("cantidadCapitulos", this.getCantidadCapitulos());

        return json;
    }

    public String getSaga() {
        return saga;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }

    public int getCantidadCapitulos() {
        return cantidadCapitulos;
    }

    public void setCantidadCapitulos(int cantidadCapitulos) {
        this.cantidadCapitulos = cantidadCapitulos;
    }
}
