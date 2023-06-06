package modelos;

import java.util.ArrayList;
import java.util.HashSet;

public class Generica<T> {
    private ArrayList<T> listaGenerica;

    public Generica() {
        this.listaGenerica = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        listaGenerica.add(elemento);
    }

    public void removerElemento(T elemento) {
        listaGenerica.remove(elemento);
    }

    public T recuperarPosicion(int index) {
        if (index < listaGenerica.size()) {
            return listaGenerica.get(index);
        } else {
            throw new RuntimeException("index no valido");
        }
    }

    public String mostrarGenerica() {
        String texto = "";
        for (T elemento : listaGenerica) {
            texto += elemento.toString() + "\n";
        }
        return texto;
    }

    public HashSet<T> pasarASet() {
        HashSet<T> nuevoSet = new HashSet<>();
        for(T elemento : listaGenerica) {
            nuevoSet.add(elemento);
        }

        return nuevoSet;
    }


}
