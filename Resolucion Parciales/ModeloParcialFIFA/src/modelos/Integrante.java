package modelos;

import interfaces.I_ToJSON;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public abstract class Integrante implements Comparable<Integrante>, I_ToJSON {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public Integrante(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("id", this.getId());
        json.put("nombre", this.getNombre());
        json.put("apellido", this.getApellido());
        json.put("edad", this.getEdad());
        return json;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", nombre='" + nombre + '\'' +
                        ", apellido='" + apellido + '\'' +
                        ", edad=" + edad + ", ";
    }

    @Override
    public boolean equals(Object aComparar) {
        if (aComparar != null && aComparar instanceof Integrante) {
            return this.getId() == ((Integrante) aComparar).getId() && this.getNombre().equals(((Integrante) aComparar).getNombre()) && this.getApellido().equals(((Integrante) aComparar).getApellido());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public int compareTo(Integrante aComparar) {
        int retorno = 0;
        if (this.getId() < aComparar.getId()) {
            retorno = -1;
        } else if (this.getId() > aComparar.getId()) {
            retorno = 1;
        }
        return retorno;
    }

    public String viajar() {
        return this.getNombre() + " " + this.getApellido() + "esta viajando.";
    }

    public String concentrar() {
        return this.getNombre() + " " + this.getApellido() + "esta concentrando.";
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
