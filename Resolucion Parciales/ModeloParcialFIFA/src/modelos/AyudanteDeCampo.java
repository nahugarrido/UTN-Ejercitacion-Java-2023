package modelos;

import interfaces.I_ToJSON;
import interfaces.JugarPartidos;
import interfaces.PrepararEntrenamiento;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class AyudanteDeCampo extends Integrante implements JugarPartidos, PrepararEntrenamiento {
    private String metodologia;

    public AyudanteDeCampo(int id, String nombre, String apellido, int edad, String metodologia) {
        super(id, nombre, apellido, edad);
        this.metodologia = metodologia;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject json = super.toJSON();
        json.put("metodologia", this.getMetodologia());
        return json;
    }

    @Override
    public String toString() {
        return "AyudanteDeCampo{" + super.toString() +
                "metodologia='" + metodologia + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object aComparar) {
        if(aComparar != null && aComparar instanceof AyudanteDeCampo) {
            return super.equals(aComparar) && this.getMetodologia().equals(((AyudanteDeCampo) aComparar).getMetodologia());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 2;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    @Override
    public String jugarPartido() {
        return "El ayudante de campo " + this.getNombre() + " " + this.getApellido() + "esta jugando el partido.";
    }

    @Override
    public String prepararEntrenamiento() {
        return "El ayudante de campo " + this.getNombre() + " " + this.getApellido() + "esta preparando el entrenamiento";
    }
}
