package modelos;

import java.util.HashSet;

public class Conjunto<T> {

    HashSet<T> elementos = new HashSet<>();

    public Conjunto() {
    }

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(T elemento) {
        elementos.remove(elemento);
    }

    public boolean verificarExistencia(T elemento) {
        boolean flag = false;
        for(T item: elementos) {
            if(item.equals(elemento)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public String mostrarElementos() {
        String texto = "";
        for (T item : elementos) {
            texto += item.toString() + "\n";
        }

        return texto;
    }


}
