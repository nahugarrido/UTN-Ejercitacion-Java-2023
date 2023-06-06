package modelos;

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

}
