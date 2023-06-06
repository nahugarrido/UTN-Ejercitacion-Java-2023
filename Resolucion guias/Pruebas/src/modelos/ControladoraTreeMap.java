package modelos;

import excepciones.PersonaNoEncontradaException;
import excepciones.PersonaYaExisteException;

import java.util.Map;
import java.util.TreeMap;

public class ControladoraTreeMap {
    private TreeMap<String, Persona> personaTreeMap;

    public ControladoraTreeMap() {
        this.personaTreeMap = new TreeMap<>();
    }

    public void agregarPersona(Persona persona) throws PersonaYaExisteException {
        String key = persona.getNombre();

        if (personaTreeMap.containsKey(key)) {
            throw new PersonaYaExisteException("La persona ya existe, key: ", key);
        }
        personaTreeMap.put(key, persona);
    }

    public void removerPersona(String key) throws PersonaNoEncontradaException {
        if (!personaTreeMap.containsKey(key)) {
            throw new PersonaNoEncontradaException("La persona no existe, nombre: ", key);
        }
        personaTreeMap.remove(key);
    }

    public String mostrarPersonas() {
        StringBuilder texto = new StringBuilder();
        for(Map.Entry<String,Persona> persona : personaTreeMap.entrySet()) {
            String key = persona.getKey();
            Persona value = persona.getValue();
            texto.append(value.toString()).append("\n");
        }

        return texto.toString();
    }
}
