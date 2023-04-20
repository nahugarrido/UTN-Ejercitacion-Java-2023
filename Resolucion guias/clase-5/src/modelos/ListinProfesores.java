package modelos;

import java.util.ArrayList;
import java.util.List;

public class ListinProfesores {
    private List<Profesor> profesores = new ArrayList();

    public void agregarProfesorTitular(String nombre, int edad) {
        ProfesorTitular profesor = new ProfesorTitular(nombre, edad);
        profesores.add(profesor);
    }

    public void agregarProfesorInterino(String nombre, int edad) {
        ProfesorInterino profesor = new ProfesorInterino(nombre, edad);
        profesores.add(profesor);
    }

    public void mostrarProfesores() {
        for(Profesor profesor : profesores) {
            System.out.println(profesor.toString());
        }
    }

}
