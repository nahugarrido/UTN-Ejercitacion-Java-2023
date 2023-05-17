package modelos;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {
    List<T> pila;

    public Pila() {
        this.pila = new ArrayList<>();
    }

    public void apilar(T elemento) {
        pila.add(elemento);
    }

    public T desapilar() {
        return pila.remove(pila.size()-1);
    }

    public T tope() {
        return pila.get(pila.size()-1);
    }

    public void mostrarPila() {
        System.out.println("Mostrando pila...");
        this.pila.forEach(System.out::println);
    }


}
