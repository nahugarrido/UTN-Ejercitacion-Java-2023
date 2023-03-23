import modelos.Agenda;
import modelos.Contacto;
import modelos.CuentaBancaria;
import modelos.Vuelo;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        punto1();
        punto2();
        punto3();
    }

    public static void punto1() {
        CuentaBancaria Jorge = new CuentaBancaria(5000, "Jorge Jejinho");
        System.out.println(Jorge.getTitular());
        Jorge.establecerPlazoFijo();
    }

    public static void punto2() {
        Vuelo Aero1 = new Vuelo("Mar del plata", "Buenos Aires", LocalTime.of(13, 30), LocalTime.of(21, 00));
        Aero1.getInformacionVuelo();
        Aero1.getDuracionVuelo();
    }

    public static void punto3() {
        Agenda AgendaAmigos = new Agenda("Agenda de amigos");

        AgendaAmigos.cargarContacto("Nicolas", "223123123", "nicoBocaCampeon@gmail.com");
        AgendaAmigos.cargarContacto("Juani", "223456456", "juanicsgo2.0@gmail.com");

        System.out.println("\n");
        AgendaAmigos.eliminarContacto("Juani");
        System.out.println("\n");
        AgendaAmigos.buscarContacto("Juani");
        System.out.println("\n");

        editarContactoAux(AgendaAmigos);

        AgendaAmigos.buscarContacto("pablo");

    }

    /// La funcion de buscar contacto esta mal modulada ya que muestra la informacion del contacto a buscar
    public static void editarContactoAux(Agenda AgendaAmigos) {
        Scanner scan = new Scanner(System.in);
        Contacto editarContactoAux = new Contacto("nombre", "222", "correo");

        System.out.println("Que contacto deseas editar?");
        String contactoAEditar = scan.next();

        System.out.println("Introduce el nuevo nombre:");
        editarContactoAux.setNombre(scan.next());
        System.out.println("Introduce el nuevo telefono:");
        editarContactoAux.setNumeroTelefono(scan.next());
        System.out.println("Introduce el nuevo correo:");
        editarContactoAux.setEmail(scan.next());

        AgendaAmigos.editarContacto(contactoAEditar, editarContactoAux);
        scan.close();
    }
}