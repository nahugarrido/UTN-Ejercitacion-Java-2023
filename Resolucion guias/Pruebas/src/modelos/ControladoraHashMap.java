package modelos;

import excepciones.PersonaNoEncontradaException;
import excepciones.PersonaYaExisteException;

import java.util.HashMap;
import java.util.Map;

public class ControladoraHashMap {
    HashMap<String, Persona> personaHashMap;

    public ControladoraHashMap() {
        this.personaHashMap = new HashMap<>();
    }

    public void agregarPersona(String key, Persona persona) throws PersonaYaExisteException {
        if (personaHashMap.containsKey(key)) {
            throw new PersonaYaExisteException("La persona ya existe, key: ", key);
        }
        personaHashMap.put(key, persona);
    }

    public void removerPersona(String key) throws PersonaNoEncontradaException {
        if (personaHashMap.containsKey(key)) {
            personaHashMap.remove(key);
        } else {
            throw new PersonaNoEncontradaException("La persona no existe, key: ", key);
        }
    }

    public String mostrarPersonas() {
        StringBuilder texto = new StringBuilder();

        for (Map.Entry<String, Persona> persona : personaHashMap.entrySet()) {
            String key = persona.getKey();
            Persona value = persona.getValue();
            texto.append(value.toString()).append("\n");
        }

        return texto.toString();
    }
}
