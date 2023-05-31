package otros;

import java.util.Objects;

public class Elemento implements Comparable<Elemento> {
    private int id;
    private String nombre;

    public Elemento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Elemento elemento) {
        int retorno = 0;
        if(this.getId() < elemento.getId()) {
            retorno = -1;
        } else if(this.getId() > elemento.getId()) {
            retorno = 1;
        }

        return retorno;
    }

    @Override
    public boolean equals(Object aComparar) {
        if(aComparar != null & aComparar instanceof Elemento) {
            return this.getId() == ((Elemento) aComparar).getId();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 2;
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

}
