package modelos;

import excepciones.PersonaYaExisteException;

import java.util.HashSet;
import java.util.Iterator;

public class ControladoraSet {
    private HashSet<Persona> personaSet;

    public ControladoraSet() {
        this.personaSet = new HashSet<>();
    }

    public void agregarPersona(Persona persona) throws PersonaYaExisteException {
        if(personaSet.contains(persona)) {
            throw new PersonaYaExisteException("La persona ya existe", persona.getNombre());
        }

        personaSet.add(persona);
    }

    public void removerPersona(Persona persona) {
        personaSet.remove(persona);
    }

    public String mostrarPersonas() {
        StringBuilder texto = new StringBuilder();

        Iterator<Persona> iterator = personaSet.iterator();
        while(iterator.hasNext()) {
            Persona persona = iterator.next();
            texto.append(persona.toString()).append("\n");
        }

        return texto.toString();
    }
}
