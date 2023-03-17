import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        punto22();
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

    public static void punto7() {

        System.out.println("punto 7: \n");

        int start = 1;
        int acum = 0;

        for (int i = 0; i < 10; i++) {
            acum += start;
            start++;
        }

        System.out.println("La suma es " + acum);
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
        System.out.println("El numero elegido es: " + number + ", su doble es: " + (number * 2) + " y su triple es: " + (number * 3));
    }

    public static void punto15(int degrees) {
        //  F = 32 + ( 9 * C / 5)
        float centigrades = ((float) degrees - 32) * 5 / 9;
        System.out.println(degrees + " grados Farenheit equivalen a " + centigrades + "grados Celcius");
    }

    public static void punto16(float radio) {
        float longitud = (float) (2 * 3.14 * radio);
        float area = (float) 3.14 * (radio * radio);
        System.out.println("La logintud de la circunferencia es: " + longitud);
        System.out.println("El area de la circunferencia es: " + area);
    }

    public static void punto17(int km) {
        float miles = (float) 1.609;
        System.out.println("Una velocidad de " + km + " km/h equivale a una velocidad de " + ((km / miles) / 3600) + " m/s ");
    }

    public static double punto18(double c1, double c2) {
        double result = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        System.out.println("El valor de la hipotenusa es: " + result);
        return result;
    }

    public static void punto19() {
        double[] arr = new double[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 30;
        }

        double tempMin = arr[0];
        double tempMax = arr[0];
        double acum = 0;

        for (int i = 0; i < arr.length; i++) {
            tempMin = Math.min(tempMin, arr[i]);
            tempMax = Math.max(tempMax, arr[i]);
            acum += arr[i];
        }

        System.out.println("La temperatura minima es: " + tempMin);
        System.out.println("La temperatura maxima es: " + tempMax);
        System.out.println("El promedio de temperatura es: " + (acum / arr.length));

    }

    public static void punto20() {
        double[] numbers = new double[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero 1:");
        int n1 = scan.nextInt();
        System.out.println("Ingrese el numero 2:");
        int n2 = scan.nextInt();

        scan.close();

        for (int i = 0; i < numbers.length; i++) {
            if (n1 > n2) {
                numbers[i] = Math.random() * (n1 - n2) + n2;
            } else {
                numbers[i] = Math.random() * (n2 - n1) + n1;
            }
        }

        System.out.println("Numeros ingresados: " + n1 + " " + n2);

        for (double number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void punto21() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un dia de la semana por favor:");
        String day = scan.next().toLowerCase();

        switch (day) {
            case "lunes":
                System.out.println("Es dia laboral");
                break;
            case "martes":
                System.out.println("Es dia laboral");
                break;
            case "miercoles":
                System.out.println("Es dia laboral");
                break;
            case "jueves":
                System.out.println("Es dia laboral");
                break;
            case "viernes":
                System.out.println("Es dia laboral");
                break;
            case "sabado":
                System.out.println("No es dia laboral");
                break;
            case "domingo":
                System.out.println("No es dia laboral");
                break;

            default:
                System.out.println("No es un dia valido");
                break;
        }
    }

    public static void punto22() {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        int number;
        int cont = 0;

        do {
            System.out.println("Ingrese un numero positivo: ");
            number = scan.nextInt();

            if( number > 0) {
                flag = false;
            }

        } while(flag);

        while(number > 0) {
            cont++;
            number = number/10;
        }

        System.out.println("El numero tiene " + cont + " digitos");
    }


}