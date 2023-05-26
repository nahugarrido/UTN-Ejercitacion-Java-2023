import modelos.Contacto;
import modelos.Libreta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libreta libreta = new Libreta();
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        String opcion = "";

        do {
            System.out.println("MENU LIBRETA");
            System.out.println("Opción 1 - Cargar contactos");
            System.out.println("Opción 2 - Mostrar contactos");
            System.out.println("Opción 3 - Buscar contacto (Carlos)");
            System.out.println("Opción 4 - Eliminar contacto (Carlos)");
            System.out.println("Opción 5 - Buscar contacto (no existe)");
            System.out.println("Opción 6 - Eliminar contacto (no existe)");
            System.out.println("Opción 7 - Contar contactos");
            System.out.println("Opción 8 - Salir");

            opcion = scan.nextLine();

            switch (opcion) {
                case "1":
                    Contacto contacto1 = new Contacto(123123);
                    Contacto contacto2 = new Contacto(456465, "Libertad 2525");
                    Contacto contacto3 = new Contacto(666666, "Jara 852", "Juan Pablo");
                    System.out.println(libreta.cargarContacto("Brahian", contacto1));
                    System.out.println(libreta.cargarContacto("Carlos", contacto2));
                    System.out.println(libreta.cargarContacto("Alberto", contacto3));
                    break;
                case "2":
                    System.out.println("MOSTRAR CONTACTOS:");
                    System.out.println(libreta.mostrarContactos());
                    break;
                case "3":
                    System.out.println("Buscar contacto: CARLOS");
                    try {
                        System.out.println(libreta.buscarContacto("Carlos"));
                    } catch (RuntimeException e) {
                        System.out.println(e);
                    }
                    break;
                case "4":
                    System.out.println("Eliminar contacto: CARLOS");
                    try {
                        System.out.println(libreta.borrarContacto("Carlos"));
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case "5":
                    System.out.println("Buscar contacto: INEXISTENTE");
                    try {
                        System.out.println(libreta.buscarContacto("Juanito"));
                    } catch (RuntimeException e) {
                        System.out.println(e);
                    }
                    break;
                case "6":
                    System.out.println("Eliminar contacto: INEXISTENTE");
                    try {
                        System.out.println(libreta.borrarContacto("Juanito"));
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case "7":
                    System.out.println("Contador de contactos: " + libreta.contarCantidadContactos());
                    break;
                case "8":
                    continuar = false;
                    break;
                default:
                    System.out.println("Debes selecionar una opción valida...");
                    break;
            }
        } while (continuar);
    }
}