package modelos;

import java.util.ArrayList;
import java.util.List;

public class Almacenamiento<T> {
    private List<T> almacenamiento;

    public Almacenamiento() {
        this.almacenamiento = new ArrayList<>();
    }

    public void agregar(T elemento) {
        almacenamiento.add(elemento);
    }

    public void eliminar(T elemento) {
        almacenamiento.remove(elemento);
    }

    public T buscar(T elemento) {
        return this.getAlmacenamiento().stream().filter(x -> x.equals(elemento)).findFirst().orElse(null);
    }

    public String mostrarAlmacenamiento() {
        String texto = "Almacenamiento: \n";
        for (T elemento : almacenamiento) {
            texto += elemento.toString() + "\n";
        }

        return texto;
    }

    public List<T> getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(List<T> almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
}
