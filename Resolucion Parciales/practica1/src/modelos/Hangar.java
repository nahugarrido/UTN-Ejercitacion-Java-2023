package modelos;

import java.util.ArrayList;
import java.util.List;

public class Hangar {
    private String nombre;
    private List<Avion> aviones = new ArrayList();

    public Hangar(String nombre) {
        this.nombre = nombre;
    }

    public String agregarAvion(Avion avion) {
        aviones.add(avion);
        return "Avion agregado con exito";
    }

    public String getNombre() {
        return nombre;
    }

    public List<Avion> getAviones() {
        return aviones;
    }
}
