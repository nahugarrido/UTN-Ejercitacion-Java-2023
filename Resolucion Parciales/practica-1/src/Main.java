import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opcion = "";

        do {
            System.out.println("MENU AEROPUERTO");
            System.out.println("Opcion 1 - Agregar aviones");

            switch (opcion) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Debes seleccionar una opcion valida.");
                    break;
            }

        } while(opcion != "5");
    }
}