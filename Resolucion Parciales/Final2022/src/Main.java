import enums.Genero;
import excepciones.ElementoRepetidoException;
import modelos.Antalogia;
import modelos.Generica;
import modelos.Libro;
import modelos.Novela;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Generica<Libro> biblioteca = new Generica<Libro>();

        Libro libro1 = new Novela(1,"titulo 1", "autor 1", "1001", Genero.MASCULINO,"saga",10);
        Libro libro2 = new Novela(2,"titulo 2", "autor 2", "1002", Genero.MASCULINO, "saga", 9);
        Libro libro3 = new Novela(3,"titulo 3", "autor 3", "1003", Genero.FEMENINO, "saga", 8);
        Libro libro4 = new Antalogia(4,"titulo 4", "autor 4", "1004", Genero.FEMENINO,10);
        Libro libro5 = new Antalogia(5,"titulo 5", "autor 5", "1005", Genero.FEMENINO,12);

        /// Agregar libros
        System.out.println("AGREGAR ELEMENTOS:");
        try {
            System.out.println(biblioteca.agregarElemento(libro1));
            System.out.println(biblioteca.agregarElemento(libro2));
            System.out.println(biblioteca.agregarElemento(libro3));
            System.out.println(biblioteca.agregarElemento(libro1));
            System.out.println(biblioteca.agregarElemento(libro4));
            System.out.println(biblioteca.agregarElemento(libro5));
        } catch(ElementoRepetidoException e) {
            System.out.println(e);
        }

        System.out.println(biblioteca.mostrarElementos());
        System.out.println("Contar elementos: " + biblioteca.contarElementos());

        /// Eliminar un elemento
        System.out.println("ELIMINAR ELEMENTO ID 3: ");
        System.out.println(biblioteca.removerElemento(new Novela(3,"titulo 3", "autor 3", "1003", Genero.FEMENINO, "saga", 8)));
        System.out.println(biblioteca.mostrarElementos());
        System.out.println("Contar elementos: " + biblioteca.contarElementos());

        /// Convertir elementos a JSON
        List<Libro> lista = biblioteca.listarElementos();
        JSONObject jsonNuevo = new JSONObject();
        JSONArray novelas = new JSONArray();
        JSONArray antalogias = new JSONArray();

        /// Cargo los arreglos de JSON
        try {
            for(Libro item : lista) {
                if(item instanceof Antalogia) {
                    antalogias.put(item.toJSON());
                } else if (item instanceof Novela) {
                    novelas.put(item.toJSON());
                }
            }
        } catch(JSONException e) {
            System.out.println(e);
        }



        /// Creo el objeto JSON que contiene los arreglos de JSON
        try {
            jsonNuevo.put("novelas", novelas);
            jsonNuevo.put("cuentos", antalogias);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        /// Muestro el JSON
        System.out.println("JSON NUEVO:");
        System.out.println(jsonNuevo);
    }
}