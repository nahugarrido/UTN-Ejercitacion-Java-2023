package modelos;

import interfaces.I_ToJSON;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class Avion implements Comparable<Avion>, I_ToJSON {
    private int id;
    private String piloto;
    private int capacidad_pasajeros;

    public Avion(int id, String piloto, int capacidad_pasajeros) {
        this.id = id;
        this.piloto = piloto;
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    @Override
    public JSONObject toJson() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("id", this.getId());
        json.put("piloto", this.getPiloto());
        json.put("capacidad_pasajeros", this.getCapacidad_pasajeros());
        return json;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "id=" + id +
                ", piloto='" + piloto + '\'' +
                ", capacidad_pasajeros=" + capacidad_pasajeros +
                '}';
    }

    @Override
    public boolean equals(Object aComparar) {
        if (aComparar != null && aComparar instanceof Avion) {
            return this.getId() == ((Avion) aComparar).getId() && this.getPiloto().equals(((Avion) aComparar).getPiloto());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public int compareTo(Avion aComparar) {
        int retorno = 0;
        if (this.getId() < aComparar.getId()) {
            retorno = -1;
        } else if (this.getId() > aComparar.getId()) {
            retorno = 1;
        }
        return retorno;
    }

    public int getId() {
        return id;
    }

    public String getPiloto() {
        return piloto;
    }

    public int getCapacidad_pasajeros() {
        return capacidad_pasajeros;
    }

    private void setId(int id) {
        this.id = id;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public void setCapacidad_pasajeros(int capacidad_pasajeros) {
        this.capacidad_pasajeros = capacidad_pasajeros;
    }
}
