package modelos;

import interfaces.Estadisticas;

import java.util.ArrayList;
import java.util.List;

public class ArrayReales implements Estadisticas {
    private List<Double> lista = new ArrayList<Double>();


    public ArrayReales() {
    }

    public String cargarLista() {

        for(int i = 0; i < 20; i++) {
            lista.add(Math.random() * 10);
        }

        return "lista cargada con exito";
    }

    @Override
    public double minimo() {
        double minimo = lista.get(0);
        for (Double numero : lista) {
            if (numero < minimo) {
                minimo = numero;
            }
        }

        return minimo;
    }

    @Override
    public double maximo() {
        double maximo = lista.get(0);
        for (Double numero : lista) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }

    @Override
    public double sumatorio() {
        double acumulador = 0;
        for (Double numero : lista) {
            acumulador += numero;
        }
        return acumulador;
    }
}
