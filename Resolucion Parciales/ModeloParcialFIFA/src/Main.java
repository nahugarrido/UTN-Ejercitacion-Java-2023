import enums.Estilos;
import excepciones.EntrenadorPrincipalException;
import excepciones.MaximoJugadoresExcepcion;
import modelos.Entrenador;
import modelos.Federacion;
import modelos.Futbolista;
import modelos.Integrante;
import org.json.JSONException;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Federacion federacion = new Federacion("Argentina", LocalDate.of(1950,02,23), 3);

        Integrante integrante1 = new Futbolista(1,"Jorge", "Ramirez", 15,23,"Defensor");
        Integrante integrante2 = new Futbolista(2,"Jorge", "Ramirez", 15,22,"Defensor");
        Integrante integrante3 = new Futbolista(3,"Jorge", "Ramirez", 15,21,"Defensor");
        Integrante integrante4 = new Futbolista(4,"Jorge", "Ramirez", 15,20,"Defensor");
        /*Integrante integrante5 = new Futbolista(5,"Jorge", "Ramirez", 15,19,"Defensor");
        Integrante integrante6 = new Futbolista(6,"Jorge", "Ramirez", 15,19,"Defensor");
        Integrante integrante7 = new Futbolista(7,"Jorge", "Ramirez", 15,19,"Defensor");
        */Integrante integrante8 = new Entrenador(8,"Ramon", "Perez",35,"sistemaDeJuego", Estilos.AUTORITARIO);
        Integrante integrante9 = new Entrenador(9,"Ramon", "Perez",35,"sistemaDeJuego", Estilos.AUTORITARIO);
        try {
            System.out.println("AGREGAR JUGADORES: ");
            System.out.println(federacion.agregarIntegrante(integrante1));
            System.out.println(federacion.agregarIntegrante(integrante2));
            System.out.println(federacion.agregarIntegrante(integrante3));
            System.out.println(federacion.agregarIntegrante(integrante4));
 /*           System.out.println(federacion.agregarIntegrante(integrante5));
            System.out.println(federacion.agregarIntegrante(integrante6));
            System.out.println(federacion.agregarIntegrante(integrante7));*/
            System.out.println(federacion.agregarIntegrante(integrante8));
            System.out.println(federacion.agregarIntegrante(integrante9));

        } catch(EntrenadorPrincipalException e) {
            System.out.println(e.getMessage());
        } catch(MaximoJugadoresExcepcion e) {
            System.out.println(e.getMessage());
        }

        System.out.println(federacion.mostrarIntegrantes());

        System.out.println("FEDERACION A JSON:");
        try {
            System.out.println(federacion.toJSON());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}