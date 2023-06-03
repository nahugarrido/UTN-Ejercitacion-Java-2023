package modelos;

import excepciones.ElementoRepetidoException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Generica<T extends Libro> {
    private ArrayList<T> lista;

    public Generica() {
        this.lista = new ArrayList<>();
    }

    public String agregarElemento(T elemento) throws ElementoRepetidoException {
        for(T item : lista) {
            if(item.getCodigo().equals(elemento.getCodigo())) {
                throw new ElementoRepetidoException(elemento.getCodigo(), "");
            }
        }
        lista.add(elemento);
        return "Elemento agregado con exito";
    }

    public String removerElemento(T elemento) {
        lista.remove(elemento);
        return "Elemento removido con exito";
    }

    public int contarElementos() {
        return lista.size();
    }

    public String mostrarElementos() {
        String texto = "MOSTRAR ELEMENTOS: \n";
        for(T item : lista) {
            texto += item.toString() + "\n";
        }
        return texto;
    }

    /// Funcion para poder trabajar con la lista de elementos
    public List<T> listarElementos() {
        ArrayList<T> listaNueva = this.getLista();

        return listaNueva;
    }

    private ArrayList<T> getLista() {
        return lista;
    }
}
