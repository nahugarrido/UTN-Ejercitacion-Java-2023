package modelos;

import excepciones.EntrenadorPrincipalException;
import excepciones.MaximoJugadoresExcepcion;
import interfaces.I_ToJSON;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Federacion implements I_ToJSON {
    private Generica<Integrante> integrantes;
    private String nombre;
    private LocalDate fechaFundacion;
    private int cantidadCopas;

    public Federacion(String nombre, LocalDate fechaFundacion, int cantidadCopas) {
        this.integrantes = new Generica<>();
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.cantidadCopas = cantidadCopas;
    }

    public String mostrarIntegrantes() {
        return integrantes.listarElementos();
    }

    public String agregarIntegrante(Integrante persona) throws MaximoJugadoresExcepcion, EntrenadorPrincipalException {
        if(persona instanceof Futbolista) {
            /// el valor a comparar es 23 pongo 4 para testear
            if(this.getIntegrantes().contarElementos() > 4) {
                throw new MaximoJugadoresExcepcion("", this.getIntegrantes().contarElementos());
            }
        } else if (persona instanceof Entrenador) {
            if(this.getIntegrantes().hayEntrenador()) {
                throw new EntrenadorPrincipalException("Ya existe un entrenador en la Federacion");
            }
        }

        this.integrantes.agregarElemento(persona);
        return "El integrante ha sido agregado con exito";
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("nombre", this.getNombre());
        json.put("fechaFundacion", this.getFechaFundacion());
        json.put("cantidadCopas", this.getCantidadCopas());
        JSONArray json_integrantes = integrantes.obtenerJsonArray();
        json.put("integrantes", json_integrantes);
        return json;
    }

    @Override
    public String toString() {
        return "Federacion{" +
                "integrantes=" + integrantes.listarElementos() +
                ", nombre='" + nombre + '\'' +
                ", fechaFundacion=" + fechaFundacion +
                ", cantidadCopas=" + cantidadCopas +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public int getCantidadCopas() {
        return cantidadCopas;
    }

    private Generica<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public void setCantidadCopas(int cantidadCopas) {
        this.cantidadCopas = cantidadCopas;
    }

}
