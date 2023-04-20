package modelos;

import enums.Clasificacion;
import enums.Genero;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

public class Pelicula {
    private int id;
    private String titulo;
    private Date fechaLanzamiento;
    private Clasificacion clasificacion;
    private String origen;
    private String descripcion;
    private Genero genero;

    public Pelicula(int id, String titulo, Date fechaLanzamiento, Clasificacion clasificacion, String origen, String descripcion, Genero genero) {
        this.id = id;
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.clasificacion = clasificacion;
        this.origen = origen;
        this.descripcion = descripcion;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", clasificacion=" + clasificacion +
                ", origen='" + origen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", genero=" + genero +
                '}';
    }
}
