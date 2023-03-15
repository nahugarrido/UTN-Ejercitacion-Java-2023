import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        punto4();

    }

    /// PUNTO 1
    public static void punto1a() {

        int acum = 0;
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            acum += numbers[i];
        }

        System.out.println(acum);
    }

    public static void punto1b() {
        int[] arr = new int[5];
        int aux;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero: ");
             aux = scan.nextInt();
            arr[i] = aux;
            System.out.println("\n");
        }

        scan.close();


        for(int i = 0; i < 5; i++) {
            System.out.println(" "+ arr[i] + " ");
        }
    }
    public static void punto3() {
        int i = 0;
        int number = 2;

        System.out.println("punto 3: \n");

        while(i < 100) {
            boolean isPrimo = true;

            for(int j = 2; j < number; j++ ) {
                if(number % j == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if(isPrimo) {
                i++;
                System.out.println("EL numero : " + number + " es primo. \n");
            }
            number++;
        }
    }

    public static void punto4() {
        int i = 0;
        int number = 2;

        System.out.println("punto 4: \n");
        System.out.println("Ingrese la cantidad de primos que quiere buscar: ");
        Scanner scan = new Scanner(System.in);
        int limit =  scan.nextInt();
        scan.close();
        System.out.println("\n");


        while(i < limit) {
            boolean isPrimo = true;

            for(int j = 2; j < number; j++ ) {
                if(number % j == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if(isPrimo) {
                i++;
                System.out.println("EL numero : " + number + " es primo. \n");
            }
            number++;
        }
    }

    public static void punto6() {
        int i = 0;
        int number = 2;

        System.out.println("punto 6: \n");
        System.out.println("Ingrese un numero");
        Scanner scan = new Scanner(System.in);
        int limit =  scan.nextInt();
        scan.close();
        System.out.println("\n");


        while(i < limit) {
            boolean isPrimo = true;

            for(int j = 2; j < number; j++ ) {
                if(number % j == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if(isPrimo) {
                i++;
                System.out.println("EL numero : " + number + " es primo. \n");
            }
            number++;
        }
    }


    }