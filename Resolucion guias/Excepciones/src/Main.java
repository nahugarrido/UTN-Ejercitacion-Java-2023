import excepciones.SaldoInsuficienteException;
import modelos.CuentaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //punto1();
        //punto2();
        punto5();
    }

    public static void punto1() {
        double resultado = 0;
        int n1 = 2;
        int n2 = 0;

        try {
            resultado = (double) n1 / n2;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }

    public static void punto2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa una cadena de caracteres por favor: ");
        String texto = scan.nextLine();
        try {
            try {
                Integer.parseInt(texto);
            } catch(NumberFormatException e) {
                System.out.println("El length() del String es: " + texto.length());
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void punto5() {
        try {
            CuentaBancaria cuenta = new CuentaBancaria("123123", 100);
            cuenta.retirarDinero(101);
        } catch(SaldoInsuficienteException e) {
            System.out.println(e.getMesagge());
        }

    }
}