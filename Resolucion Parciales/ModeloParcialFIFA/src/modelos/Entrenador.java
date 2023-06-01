package modelos;

import enums.Estilos;
import interfaces.JugarPartidos;
import interfaces.PrepararEntrenamiento;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class Entrenador extends Integrante implements JugarPartidos, PrepararEntrenamiento {
    private String sistemaDeJuego;
    private Estilos estilo;

    public Entrenador(int id, String nombre, String apellido, int edad, String sistemaDeJuego, Estilos estilo) {
        super(id, nombre, apellido, edad);
        this.sistemaDeJuego = sistemaDeJuego;
        this.estilo = estilo;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject json = super.toJSON();
        json.put("sistemaDeJuego", this.getSistemaDeJuego());
        json.put("estilo", this.getEstilo());
        return json;
    }

    @Override
    public String toString() {
        return "Entrenador{" + super.toString() +
                "sistemaDeJuego='" + sistemaDeJuego + '\'' +
                ", estilo=" + estilo +
                '}';
    }

    @Override
    public boolean equals(Object aComparar) {
        if(aComparar != null && aComparar instanceof Entrenador) {
            return super.equals(aComparar) && this.getEstilo().equals(((Entrenador) aComparar).getEstilo()) && this.getSistemaDeJuego().equals(((Entrenador) aComparar).getSistemaDeJuego());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 3;
    }

    public String getSistemaDeJuego() {
        return sistemaDeJuego;
    }

    public Estilos getEstilo() {
        return estilo;
    }

    public void setSistemaDeJuego(String sistemaDeJuego) {
        this.sistemaDeJuego = sistemaDeJuego;
    }

    public void setEstilo(Estilos estilo) {
        this.estilo = estilo;
    }

    @Override
    public String jugarPartido() {
        return "El Entrenador " + this.getNombre() + " " + this.getApellido() + "esta jugando el partido.";
    }

    @Override
    public String prepararEntrenamiento() {
        return "El Entrenador " + this.getNombre() + " " + this.getApellido() + "esta preparando el entrenamiento.";

    }
}
