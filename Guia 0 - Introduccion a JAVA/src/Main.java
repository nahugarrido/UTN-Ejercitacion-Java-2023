import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        punto15(46);
    }

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


        for (int i = 0; i < 5; i++) {
            System.out.println(" " + arr[i] + " ");
        }
    }

    public static void punto3() {
        int i = 0;
        int number = 2;

        System.out.println("punto 3: \n");

        while (i < 100) {
            boolean isPrimo = true;

            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
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
        int limit = scan.nextInt();
        scan.close();
        System.out.println("\n");


        while (i < limit) {
            boolean isPrimo = true;

            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
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
        int limit = scan.nextInt();
        scan.close();
        System.out.println("\n");


        while (i < limit) {
            boolean isPrimo = true;

            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                i++;
                System.out.println("EL numero : " + number + " es primo. \n");
            }
            number++;
        }


    }

    public static void punto8() {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        int number;
        String answer;
        int cont = 0;

        do {
            System.out.println("\nIngresa un numero por favor: ");
            number = scan.nextInt();
            if (number > 0) {
                cont++;
            }

            System.out.println("\nDeseas seguir ingresando numeros? (s/n): ");
            answer = scan.next();
            // System.out.println("\nanswer: " + answer);

            if (answer.equals("n")) {
                flag = false;
                scan.close();
            }

        } while (flag);

        System.out.println("La cantidad de numeros positivios ingresados fue " + cont);
    }

    public static void punto9(int year) {
        if (year % 4 == 0) {
            System.out.println("\nEl año " + year + " es año bisiesto");
        } else {
            System.out.println("\nEl año " + year + " no es año bisiesto");
        }
    }

    public static void punto10(char C) {
        System.out.println("El valor ASCII de " + C + " es: " + ((int) C));
    }

    public static int punto11(int n1, int n2) {
        int result = n1 * n2;
        System.out.println("El resultado de la multiplicación es: " + result);

        return result;
    }

    public static void punto12() {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        String answer = "";

        do {
            System.out.println("Opciones disponibles: (cuadrado, triangulo, circulo)");
            System.out.println("Que area deseas calcular?:");
            answer = scan.next();
            if (answer.equals("cuadrado") || answer.equals("triangulo") || answer.equals("circulo")) {
                flag = false;
            } else {
                System.out.println("\nDebes ingresar una opcion valida! :( \n");
            }
        } while (flag);

        System.out.println("\nOpción selecionada: " + answer);

    }

    public static void punto13(String str) {
        System.out.println("Good morning " + str + "!");
    }

    public static void punto14(int number) {
        System.out.println("El numero elegido es: " + number + ", su doble es: " + (number*2) + " y su triple es: " + (number*3));
    }

    public static void punto15(int degrees) {
        //  F = 32 + ( 9 * C / 5)
        float centigrades = ((float)degrees - 32) * 5/9;
        System.out.println(degrees + " grados Farenheit equivalen a " + centigrades + "grados Celcius");
    }

    public static void punto16(float radio) {

    }

}