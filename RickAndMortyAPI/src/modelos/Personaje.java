package modelos;

import interfaces.I_ToJSON;
import org.json.JSONException;
import org.json.JSONObject;

public class Personaje implements I_ToJSON {
    private int id;
    private String nombre;
    private String estado;
    private String especie;
    private String genero;
    private Origin origen;
    public Personaje() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Origin getOrigen() {
        return origen;
    }

    public void setOrigen(Origin origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "modelos.Personaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", estado='" + estado + '\'' +
                ", especie='" + especie + '\'' +
                ", genero='" + genero + '\'' +
                ", origen=" + origen +
                '}';
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("name",this.getNombre());
        json.put("id", this.getId());
        json.put("origin",this.getOrigen().toJSON());

        return json;
    }

    @Override
    public void fromJSON(JSONObject jsonObject) throws JSONException {
        this.setId(jsonObject.getInt("id"));
        this.setGenero(jsonObject.getString("gender"));
        this.setEstado(jsonObject.getString("status"));
        this.setEspecie(jsonObject.getString("species"));
        JSONObject json_origin = jsonObject.getJSONObject("origin");
        Origin aux = new Origin();
        aux.fromJSON(json_origin);
        this.setOrigen(aux);
        this.setNombre(jsonObject.getString("name"));
    }
}
