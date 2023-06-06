import excepciones.CapacidadMinimaException;
import modelos.Aeropuerto;
import modelos.Avion;
import modelos.ControladoraAeropuertos;
import modelos.Generica;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ControladoraAeropuertos controladora = new ControladoraAeropuertos();

        /// Se crean aeropuertos
        Aeropuerto aeropuerto1 = new Aeropuerto(1, false, 3586.69, "http://placehold.it/32x32", 20, "JIMBIES", "emmalowery@jimbies.com", "+1 (995) 481-3639", "390 Troutman Street, Wilsonia, Massachusetts, 4973", "Nulla commodo nostrud cupidatat aliquip aliqua irure velit sit aute esse laborum. Cupidatat eu ut ex eu commodo ex anim quis reprehenderit. Ea excepteur ex nisi reprehenderit magna dolore proident aute do tempor dolore culpa eu in. Minim mollit aliqua sit sint ad ad qui dolor cillum enim ut velit.\\r\\n", LocalDate.of(2018, 05, 05), -18.902215, 164.74222);
        aeropuerto1.agregarAvion(new Avion(0, "Levine Phelps", 34));
        aeropuerto1.agregarAvion(new Avion(1, "Oneil Marquez", 29));
        aeropuerto1.agregarAvion(new Avion(2, "Aimee Mccullough", 34));
        aeropuerto1.agregarEtiqueta("asd1");
        aeropuerto1.agregarEtiqueta("asd2");
        aeropuerto1.agregarEtiqueta("asd3");
        Aeropuerto aeropuerto2 = new Aeropuerto(2, false, 3586.69, "http://placehold.it/32x32", 30, "JIMBIES", "emmalowery@jimbies.com", "+1 (995) 481-3639", "390 Troutman Street, Wilsonia, Massachusetts, 4973", "Nulla commodo nostrud cupidatat aliquip aliqua irure velit sit aute esse laborum. Cupidatat eu ut ex eu commodo ex anim quis reprehenderit. Ea excepteur ex nisi reprehenderit magna dolore proident aute do tempor dolore culpa eu in. Minim mollit aliqua sit sint ad ad qui dolor cillum enim ut velit.\\r\\n", LocalDate.of(2018, 05, 05), -18.902215, 164.74222);
        aeropuerto2.agregarEtiqueta("asd1");
        aeropuerto2.agregarEtiqueta("asd2");
        aeropuerto2.agregarEtiqueta("asd3");
        Aeropuerto aeropuerto3 = new Aeropuerto(3, false, 3586.69, "http://placehold.it/32x32", 40, "JIMBIES", "emmalowery@jimbies.com", "+1 (995) 481-3639", "390 Troutman Street, Wilsonia, Massachusetts, 4973", "Nulla commodo nostrud cupidatat aliquip aliqua irure velit sit aute esse laborum. Cupidatat eu ut ex eu commodo ex anim quis reprehenderit. Ea excepteur ex nisi reprehenderit magna dolore proident aute do tempor dolore culpa eu in. Minim mollit aliqua sit sint ad ad qui dolor cillum enim ut velit.\\r\\n", LocalDate.of(2018, 05, 05), -18.902215, 164.74222);
        aeropuerto3.agregarEtiqueta("hhh");
        aeropuerto3.agregarEtiqueta("ggg");
        aeropuerto3.agregarEtiqueta("aaa");

        /// Se agregan a la clase envoltorio
        controladora.agregarAeropuerto(aeropuerto1);
        controladora.agregarAeropuerto(aeropuerto2);
        controladora.agregarAeropuerto(aeropuerto3);

        /// PUNTO 1:
        /// Escribir json en archivo
        try {

            JsonUtiles.grabar(controladora.toJsonArray(), "archivo");
            System.out.println("JSON GRABADO CON EXITO");

        } catch (JSONException e) {
            System.out.println(e.getMessage());
        }

        /// mostrar aeropuertos
        System.out.println(controladora.mostrarAeropuertos());

        /// PUNTO 2:
        /// filtrar aeropuertos
        try {
            ArrayList<Aeropuerto> aeropuertosFiltrados = controladora.filtrarAeropuertos(10);
            System.out.println("AEROPUERTOS FILTRADOS: ");
            mostrarAeropuertos(aeropuertosFiltrados);
        } catch (CapacidadMinimaException e) {
            System.out.println(e.getMessage());
        }

        /// PUNTO 3:
        /// almacenar pilotos y tags en una clase generica
        Generica<String> pilotos = controladora.almacenarPilotos();
        Generica<String> etiquetas = controladora.almacenarTags();
        System.out.println("PILOTOS GENERICA: ");
        System.out.println(pilotos.mostrarGenerica());
        System.out.println("ETIQUETAS GENERICA: ");
        System.out.println(etiquetas.mostrarGenerica());

        /// PUNTO 4:
        HashSet<String> nuevoSet = etiquetas.pasarASet();
        Iterator<String> iterator = nuevoSet.iterator();
        System.out.println("MOSTRAR HASHSET:");
        while(iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
        }

    }


    public static void mostrarAeropuertos(ArrayList<Aeropuerto> aeropuertos) {
        for (Aeropuerto elemento : aeropuertos) {
            System.out.println(elemento.toString());
        }
    }
}