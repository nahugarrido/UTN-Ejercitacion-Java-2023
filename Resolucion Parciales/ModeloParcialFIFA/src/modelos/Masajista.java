package modelos;

import interfaces.DarAsistencia;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class Masajista extends Integrante implements DarAsistencia {
    private String titulo;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject json = super.toJSON();
        json.put("titulo", this.getTitulo());
        json.put("aniosExperiencia", this.getAniosExperiencia());
        return json;
    }
    @Override
    public String toString() {
        return "Masajista{" + super.toString() +
                "titulo='" + titulo + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                '}';
    }

    @Override
    public boolean equals(Object aComparar) {
        if(aComparar != null && aComparar instanceof Masajista) {
            return super.equals(aComparar) && this.getTitulo().equals(((Masajista) aComparar).getTitulo());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 5;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String darAsistencia() {
        return "El Masajista" + this.getNombre() + " " + this.getApellido() + "esta dando asistencia.";

    }
}
