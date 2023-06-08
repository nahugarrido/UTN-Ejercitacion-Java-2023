package modelos;

import java.io.*;
import java.util.ArrayList;

public class ControladorLista {
    private ArrayList<Persona> listaPersonas;

    public ControladorLista() {
        this.listaPersonas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    public void removerPersona(Persona persona) {
        listaPersonas.remove(persona);
    }

    public String mostrarPersonas() {
        StringBuilder texto = new StringBuilder();
        for (Persona persona : listaPersonas) {
            texto.append(persona.toString()).append("\n");
        }
        return texto.toString();
    }

    public void crearArchivoPersonas() {
        Serializar serializar = new Serializar();
        serializar.serializar(listaPersonas, "listaPersonas.bin");
    }

    public String leerArchivoPersonas() {
        Serializar serializar = new Serializar();
        ArrayList<Persona> listaNueva = serializar.deserializar("listaPersonas.bin");
        StringBuilder texto = new StringBuilder();
        for(Persona persona : listaNueva) {
            texto.append(persona.toString()).append("\n");
        }

        return texto.toString();
    }

}
