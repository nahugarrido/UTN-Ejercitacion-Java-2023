package modelos;

import interfaces.I_ToJSON;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* en el json hay que cambiar id por _id y
 * fechaInicio por fecha_inicio
 *
 * luego tambien id es un string en el json
 * balacnce aparece de la forma "$3,586.69"
 *
 *
 * */
public class Aeropuerto implements Comparable<Aeropuerto>, I_ToJSON {
    private int id;
    private boolean activo;
    private double balance;
    private String imagen;
    private int capacidad;
    private String nombre;
    private String email;
    private String phone;
    private String direccion;
    private String acerca;
    private LocalDate fechaInicio;
    private double latitud;
    private double longitud;
    private HashSet<String> etiquetas;

    private ArrayList<Avion> aviones;

    public Aeropuerto(int id, boolean activo, double balance, String imagen, int capacidad, String nombre, String email, String phone, String direccion, String acerca, LocalDate fechaInicio, double latitud, double longitud) {
        this.id = id;
        this.activo = activo;
        this.balance = balance;
        this.imagen = imagen;
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.email = email;
        this.phone = phone;
        this.direccion = direccion;
        this.acerca = acerca;
        this.fechaInicio = fechaInicio;
        this.latitud = latitud;
        this.longitud = longitud;
        this.etiquetas = new HashSet<>();
        this.aviones = new ArrayList<>();
    }

    public Aeropuerto() {

    }

    public void agregarEtiqueta(String etiqueta) {
        etiquetas.add(etiqueta);
    }


    @Override
    public JSONObject toJson() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("_id", Integer.toString(this.getId()));
        json.put("activo", this.isActivo());
        json.put("balance", "$" + this.getBalance());
        json.put("capacidad", this.getCapacidad());
        json.put("nombre", this.getNombre());
        json.put("email", this.getEmail());
        json.put("phone", this.getPhone());
        json.put("direccion", this.getDireccion());
        json.put("acerca", this.getAcerca());
        json.put("fecha_inicio", this.getFechaInicio());
        json.put("latitud", this.getLatitud());
        json.put("longitud", this.getLongitud());

        JSONArray json_etiquetas = new JSONArray();

        for (String etiqueta : etiquetas) {
            json_etiquetas.put(etiqueta);
        }

        json.put("etiquetas", json_etiquetas);

        JSONArray json_aviones = new JSONArray();

        for (Avion elemento : aviones) {
            json_aviones.put(elemento.toJson());
        }

        json.put("aviones", json_aviones);

        return json;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "id=" + id +
                ", activo=" + activo +
                ", balance=" + balance +
                ", imagen='" + imagen + '\'' +
                ", capacidad=" + capacidad +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", direccion='" + direccion + '\'' +
                ", acerca='" + acerca + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", etiquetas=" + etiquetas +
                ", aviones=" + aviones +
                '}';
    }

    @Override
    public int compareTo(Aeropuerto aComparar) {
        int retorno = 0;
        if (this.getId() < aComparar.getId()) {
            retorno = -1;
        } else if (this.getId() > aComparar.getId()) {
            retorno = 1;
        }
        return retorno;
    }

    @Override
    public boolean equals(Object aComparar) {
        if (aComparar != null && aComparar instanceof Aeropuerto) {
            return this.getId() == ((Aeropuerto) aComparar).getId() && this.getEmail().equals(((Aeropuerto) aComparar).getEmail()) && this.getNombre().equals(((Aeropuerto) aComparar).getNombre());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public void agregarAvion(Avion avion) {
        this.aviones.add(avion);
    }

    private int getId() {
        return id;
    }

    public boolean isActivo() {
        return activo;
    }

    public double getBalance() {
        return balance;
    }

    public String getImagen() {
        return imagen;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getAcerca() {
        return acerca;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public ArrayList<String> getPilotos() {
        ArrayList<String> pilotos = new ArrayList<>();
        for (Avion elemento : aviones) {
            pilotos.add(elemento.getPiloto());
        }
        return pilotos;
    }

    public ArrayList<String> getTags() {
        ArrayList<String> tags = new ArrayList<>();

        Iterator<String> iterator = etiquetas.iterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            tags.add(elemento);
        }

        return tags;
    }

}
