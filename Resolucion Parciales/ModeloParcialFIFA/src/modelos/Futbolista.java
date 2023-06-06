package modelos;

import interfaces.JugarPartidos;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class Futbolista extends Integrante implements JugarPartidos {
    private int numeroCamiseta;
    private String puesto;

    public Futbolista(int id, String nombre, String apellido, int edad, int numeroCamiseta, String puesto) {
        super(id, nombre, apellido, edad);
        this.numeroCamiseta = numeroCamiseta;
        this.puesto = puesto;
    }
    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject json = super.toJSON();
        json.put("numeroCamiseta", this.getNumeroCamiseta());
        json.put("puesto", this.getPuesto());
        return json;
    }

    @Override
    public String toString() {
        return "Futbolista{" + super.toString() +
                "numeroCamiseta=" + numeroCamiseta +
                ", puesto='" + puesto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object aComparar) {
        if(aComparar != null && aComparar instanceof Futbolista) {
            return super.equals(aComparar) && this.getNumeroCamiseta() == ((Futbolista) aComparar).getNumeroCamiseta() && this.getPuesto().equals(((Futbolista) aComparar).getPuesto());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 4;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String jugarPartido() {
        return "El futbolista " + this.getNombre() + " " + this.getApellido() + "esta jugando el partido.";

    }
}
