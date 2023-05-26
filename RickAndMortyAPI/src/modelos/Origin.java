package modelos;

import interfaces.I_ToJSON;
import org.json.JSONException;
import org.json.JSONObject;

public class Origin implements I_ToJSON {
    private String nombre;
    private String url;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "modelos.Origin{" +
                "nombre='" + nombre + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("name",this.getNombre());
        json.put("url",this.getUrl());
        return json;
    }

    @Override
    public void fromJSON(JSONObject json) throws JSONException {
        this.setNombre(json.getString("name"));
        this.setUrl(json.getString("url"));
    }
}
