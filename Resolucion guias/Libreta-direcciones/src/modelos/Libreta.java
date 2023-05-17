package modelos;

import java.util.Map;
import java.util.TreeMap;

public class Libreta    {
    TreeMap<String, Contacto> listaContactos= new TreeMap<>();

    public Libreta() {
    }

    public String cargarContacto(String nombre, Contacto nuevoContacto) {

        if(listaContactos.containsKey(nombre)) {
            throw new RuntimeException("El contacto ya existe, debes escoger otro nombre");
        }

        listaContactos.put(nombre, nuevoContacto);
        return "Contacto agregado con exito";
    }

    public String mostrarContactos() {
        String texto = "";

        for(Map.Entry<String,Contacto> item : listaContactos.entrySet()) {
            String nombre = item.getKey();
            Contacto contacto = item.getValue();
            texto += "1" +
                    "Contacto{nombre: " + nombre + ", " + contacto.toString() + '}' + "\n";
        }

        return texto;
    }

    public String buscarContacto(String nombre) {

        if(!listaContactos.containsKey(nombre)) {
            throw new RuntimeException("El contacto no existe");
        }

      Contacto contacto = listaContactos.get(nombre);

      return "Contacto encontrado: " + contacto.toString();
    }

    public String borrarContacto(String nombre) throws Exception
     {
         if(!listaContactos.containsKey(nombre)) {
             throw new Exception("El contacto no existe");
         }

         listaContactos.remove(nombre);

         return "contacto removido con exito";
     }

     public int contarCantidadContactos() {
        int contador = 0;
        for(Map.Entry<String,Contacto> item: listaContactos.entrySet()) {
            contador++;
        }

        return contador;
     }

}
