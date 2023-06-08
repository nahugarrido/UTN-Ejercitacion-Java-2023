import excepciones.PersonaNoEncontradaException;
import excepciones.PersonaYaExisteException;
import modelos.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Carlos", 20);
        Persona persona2 = new Persona("Enrique Iglesias", 18);
        Persona persona3 = new Persona("Alberto Casillas", 22);
        Persona persona4 = new Persona("Manolo Guantes", 25);
        Persona persona5 = new Persona("Pedro Perez", 21);


        /// ArrayList
        System.out.println("ARRAYLIST:");
        ControladorLista controladoraLista = new ControladorLista();
        controladoraLista.agregarPersona(persona1);
        controladoraLista.agregarPersona(persona2);
        controladoraLista.agregarPersona(persona3);
        controladoraLista.agregarPersona(persona4);
        controladoraLista.agregarPersona(persona5);
        controladoraLista.removerPersona(persona5);
        System.out.println(controladoraLista.mostrarPersonas());

        /// HashSet
        System.out.println("HASHSET:");
        ControladoraSet controladoraSet = new ControladoraSet();
        try {
            controladoraSet.agregarPersona(persona1);
            controladoraSet.agregarPersona(persona2);
            controladoraSet.agregarPersona(persona3);
            controladoraSet.agregarPersona(persona4);
            controladoraSet.agregarPersona(persona5);
            controladoraSet.removerPersona(persona5);
        } catch (PersonaYaExisteException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(controladoraSet.mostrarPersonas());
        }


        /// HashMap
        System.out.println("HASHMAP:");
        ControladoraHashMap controladoraHashMap = new ControladoraHashMap();
        try {
            controladoraHashMap.agregarPersona(persona1.getNombre(), persona1);
            controladoraHashMap.agregarPersona(persona2.getNombre(), persona2);
            controladoraHashMap.agregarPersona(persona3.getNombre(), persona3);
            controladoraHashMap.agregarPersona(persona4.getNombre(), persona4);
            controladoraHashMap.agregarPersona(persona5.getNombre(), persona5);
            controladoraHashMap.removerPersona(persona5.getNombre());

        } catch (PersonaYaExisteException e) {
            System.out.println(e.getMessage());
        } catch (PersonaNoEncontradaException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(controladoraHashMap.mostrarPersonas());
        }

        /// TREEMAP
        System.out.println("TREEMAP:");
        ControladoraTreeMap controladoraTreeMap = new ControladoraTreeMap();

        try {
            controladoraTreeMap.agregarPersona(persona1);
            controladoraTreeMap.agregarPersona(persona2);
            controladoraTreeMap.agregarPersona(persona3);
            controladoraTreeMap.agregarPersona(persona4);
            controladoraTreeMap.agregarPersona(persona5);
            controladoraTreeMap.removerPersona(persona5.getNombre());
        } catch (PersonaYaExisteException e) {
            System.out.println(e.getMessage());
        } catch (PersonaNoEncontradaException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(controladoraTreeMap.mostrarPersonas());
        }

        System.out.println("ARCHIVO LISTA:");
        controladoraLista.crearArchivoPersonas();
        System.out.println(controladoraLista.leerArchivoPersonas());

        System.out.println("ARCHIVO HASHMAP:");
        controladoraHashMap.crearArchivoPersonas();
        System.out.println(controladoraHashMap.leerArchivoPersonas());


    }
}