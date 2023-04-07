package org.example;

import org.example.modelos.CD;
import org.example.modelos.DVD;
import org.example.modelos.Elemento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DOME();
    }

    public static void DOME() {
        /// variables del tp
        List<Elemento> elementos = new ArrayList<Elemento>();

        /// cargar informacion testeo
        elementos = cargarInformacionTesteo(elementos);
        /// variables de menu
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        String opcion = null;

        do {


            System.out.println("-----------------  MENU DOME   -----------------");
            System.out.println("OPERACIONES:");
            System.out.println("1-Agregar un CD nuevo");
            System.out.println("2-Agregar un DVD nuevo");
            System.out.println("3-Encontrar todos los CDs de un autor.");
            System.out.println("4-Encontrar todos los DVDs de un director.");
            System.out.println("5-Ver todos los CDs");
            System.out.println("6-Ver todos los DVDs");
            System.out.println("7-Terminar ejecucion");
            System.out.print("Selecciona una opcion: ");

            opcion = scan.next();

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese los datos del CD a agregar:");
                    System.out.print("Ingrese el titulo: ");
                    scan.nextLine();
                    String titulo = scan.nextLine();
                    System.out.print("Ingrese la duracion: ");
                    scan.nextLine();
                    String duracion = scan.nextLine();
                    System.out.print("Ingrese el comentario: ");
                    scan.nextLine();
                    String comentario = scan.nextLine();
                    System.out.print("Ingrese el interprete: ");
                    scan.nextLine();
                    String interprete = scan.nextLine();
                    System.out.print("Ingrese el numero de temas: ");
                    scan.nextLine();
                    int nroTemas = Integer.parseInt(scan.next());
                    CD nuevoCd = new CD(titulo, duracion, comentario, interprete, nroTemas);
                    elementos.add((Elemento) nuevoCd);

                    System.out.println("CD agregado con exito!");
                    break;
                case "2":
                    System.out.println("Ingrese los datos del DVD a agregar:");
                    System.out.print("Ingrese el titulo: ");
                    scan.nextLine();
                    titulo = scan.nextLine();
                    System.out.print("Ingrese la duracion: ");
                    scan.nextLine();
                    duracion = scan.next();
                    System.out.print("Ingrese el comentario: ");
                    scan.nextLine();
                    comentario = scan.nextLine();
                    System.out.print("Ingrese el director: ");
                    scan.nextLine();
                    String director = scan.nextLine();
                    DVD nuevoDVD = new DVD(titulo, duracion, comentario, director);
                    elementos.add((Elemento) nuevoDVD);

                    System.out.println("DVD agregado con exito!");
                    break;
                case "3":
                    System.out.print("Ingrese el nombre del interprete: ");
                    scan.nextLine();
                    interprete = scan.nextLine();
                    System.out.println("Interprete: " + interprete);
                    buscarPorInterprete(elementos, interprete);
                    break;
                case "4":
                    System.out.print("Ingrese el nombre del director: ");
                    scan.nextLine();
                    director = scan.nextLine();
                    buscarPorDirector(elementos, director);
                    break;
                case "5":
                    verTodosLosCDs(elementos);
                    break;
                case "6":
                    verTodosLosDVDs(elementos);
                    break;
                case "7":
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion no valida!");
            }

        } while (flag == true);
    }

    public static List<Elemento> cargarInformacionTesteo(List<Elemento> elementos) {
        DVD dummy1 = new DVD("El amanecer de los monos", "23:56", "Monardos","Steven Spilberg");
        DVD dummy2 = new DVD("Cactus en llamas", "12:20", "Muy caliente","Albert Tesla");
        DVD dummy3 = new DVD("Perro o Gato?", "56:50", "Guau!","director");
        CD dummy4 = new CD("Besos en la Espalda","50:00", "www.records.com", "Indios",12);
        CD dummy5 = new CD("Bohemian Rhapsody","56:15", "www.records.com", "Queen",12);
        CD dummy6 = new CD("The Beatles","38:30", "www.records.com", "The Beatles",12);

        elementos.add(dummy1);
        elementos.add(dummy5);
        elementos.add(dummy3);
        elementos.add(dummy4);
        elementos.add(dummy2);
        elementos.add(dummy6);

        return elementos;
    }

    public static void buscarPorInterprete(List<Elemento> elementos, String interprete) {
        System.out.println("-----------------  BUSCAR POR INTERPRETE  -----------------");
        for (Elemento elemento : elementos) {

            if (elemento instanceof CD) {
                if (((CD) elemento).getInterprete().equals(interprete)) {
                    System.out.println(((CD) elemento).imprimir());
                }
            }
        }
    }
    public static void buscarPorDirector(List<Elemento> elementos, String director) {
        System.out.println("-----------------  BUSCAR POR DIRECTOR  -----------------");
        for (Elemento elemento : elementos) {

            if (elemento instanceof DVD) {
                if (((DVD) elemento).getDirector().equals(director)) {
                    System.out.println(((DVD) elemento).imprimir());
                }
            }
        }
    }

    public static void verTodosLosCDs(List<Elemento> elementos) {
        System.out.println("-----------------  LISTA CDs   -----------------");
        for (Elemento elemento : elementos) {
            if (elemento instanceof CD) {
                    System.out.println(((CD) elemento).imprimir());
            }
        }
    }

    public static void verTodosLosDVDs(List<Elemento> elementos) {
        System.out.println("-----------------  LISTA DVDs   -----------------");
        for (Elemento elemento : elementos) {
            if (elemento instanceof DVD) {
                System.out.println(((DVD) elemento).imprimir());
            }
        }
    }


}