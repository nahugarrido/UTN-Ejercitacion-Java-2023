package modelos;

import interfaces.Extremos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Matematicas implements Extremos {

    private List<Double> lista = new ArrayList<Double>();

    public Matematicas() {
    }

    public String cargarLista() {

        for(int i = 0; i < 20; i++) {
            lista.add(Math.random() * 10);
        }

        return "lista cargada con exito";
    }


    @Override
    public double inicio() {
        return lista.get(0);
    }

    @Override
    public double fin() {
        double ultimo = lista.get(0);

        for (Double numero : lista) {
            ultimo = numero;
        }
        return ultimo;
    }


    @Override
    public boolean equals(Persona o) {
        if (this.nombre==o.nombre && )
    }

    @Override
    public int hashCode() {
        return Objects.hash(lista);
    }
}
