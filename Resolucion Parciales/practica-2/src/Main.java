import modelos.Barco;
import modelos.Corbeta;
import modelos.Lancha;
import modelos.Sistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Sistema sistema = new Sistema();
        String opcion = "";

        do {
            System.out.println("SISTEMA DE PUERTO DE MAR DEL PLATA");
            System.out.println("Opcion 1 - Cargar Barcos");
            System.out.println("Opcion 2 - Listar Barcos");
            System.out.println("Opcion 3 - Mandar barcos a pescar");
            System.out.println("Opcion 4 - Total recaudado por Lanchas");
            System.out.println("Opcion 5 - Total recaudado por Corbetas");
            System.out.println("Opcion 6 - Total recaudado en general");
            System.out.println("Opcion 7 - Salir");
            System.out.println("Seleccione una opcion por favor:");

            opcion = scan.nextLine();

            switch (opcion) {
                case "1":
                    Barco barco1 = new Lancha(1,"Ford","F40", 250,50,"ABC123");
                    Barco barco2 = new Lancha(2,"Ford","F40", 250,60,"KGD352");
                    Barco barco3 = new Lancha(3,"Ford","F40", 250,80,"YYY444");
                    Barco barco4 = new Corbeta(4,"Ford","F40", 250,40,"ZZZ111",5);
                    Barco barco5 = new Corbeta(5,"Ford","F40", 250,50,"ZZZ222",3);
                    Barco barco6 = new Corbeta(6,"Ford","F40", 250,60,"ZZZ333",2);
                    System.out.println(sistema.agregarBarco(barco1));
                    System.out.println(sistema.agregarBarco(barco2));
                    System.out.println(sistema.agregarBarco(barco3));
                    System.out.println(sistema.agregarBarco(barco4));
                    System.out.println(sistema.agregarBarco(barco5));
                    System.out.println(sistema.agregarBarco(barco6));
                    break;
                case "2":
                    System.out.println(sistema.mostrarBarcos());
                    break;
                case "3":
                    System.out.println(sistema.enviarBarcoAPescar(1,3));
                    System.out.println(sistema.enviarBarcoAPescar(2,1));
                    System.out.println(sistema.enviarBarcoAPescar(3,3));
                    System.out.println(sistema.enviarBarcoAPescar(4,2));
                    System.out.println(sistema.enviarBarcoAPescar(5,3));
                    System.out.println(sistema.enviarBarcoAPescar(6,6));
                    break;
                case "4":
                    System.out.println(sistema.totalRecaudadoLancha());
                    break;
                case "5":
                    System.out.println(sistema.totalRecaudadoCorbeta());
                    break;
                case "6":
                    System.out.println(sistema.totalRecaudado());
                    break;
                default:
                    System.out.println("Selecciona una opcion valida.");
                    break;
            }

        } while (opcion != "7");
    }
}