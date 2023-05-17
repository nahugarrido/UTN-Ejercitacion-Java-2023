package modelos;

import java.util.Map;
import java.util.TreeMap;

public class Libreta    {
    TreeMap<String, Contacto> listaContactos= new TreeMap<>();

    public Libreta() {
    }

    public String cargarContacto(String nombre, Contacto nuevoContacto) {
        listaContactos.put(nombre, nuevoContacto);
        return "Contacto agregado con exito";
    }

    public String mostrarContactos() {
        String texto = "";

        for(Map.Entry<String,Contacto> item : listaContactos.entrySet()) {
            String nombre = item.getKey();
            Contacto contacto = item.getValue();
            texto += "\"Contacto{nombre: " + nombre + ", " + contacto.toString() + '}' + "\n";
        }

        return texto;
    }

}
