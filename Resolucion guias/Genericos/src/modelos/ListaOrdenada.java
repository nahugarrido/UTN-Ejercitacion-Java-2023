package modelos;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListaOrdenada<T extends Comparable> {
    ArrayList<T> lista = new ArrayList<>();

    public ListaOrdenada() {
    }

    public void agregarElemento(T elemento) {
        int indice = 0;

        while (indice < lista.size() && elemento.compareTo(lista.get(indice)) > 0) {
            indice++;
        }

        lista.add(indice, elemento);
    }

    public void eliminarElemento(T elemento) {
        for (T item : lista) {
            if (item.equals(elemento)) {
                lista.remove(item);
                break;
            }
        }
    }

    public T obtenerElemento(int index) {
        if(index < lista.size()) {
            return lista.get(index);
        }

        return null;
    }

    public String mostrarLista() {
        String texto = "";
        for(T item : lista) {
            texto += item.toString() + "\n";
        }
        return texto;
    }
}
