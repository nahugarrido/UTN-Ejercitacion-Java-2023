package org.example;

import org.example.modelos.Empleado;
import org.example.modelos.Hora;
import org.example.modelos.ItemDeVenta;
import org.example.modelos.Rectangulo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Resolucion guia modelado de clases 1");

        //punto1();
        //punto2();
        //punto3();
        //punto4();
        //punto5();
    }

    public static void punto1() {
        System.out.println("\nPunto 1:\n");
        Rectangulo rectangulo = new Rectangulo(10, 15);
        System.out.println("El alto del rectangulo es " + rectangulo.getAlto() + " y su ancho es " + rectangulo.getAncho());
        System.out.println("El perimetro del rectangulo es " + rectangulo.calcularPerimetro() + " y su area es " + rectangulo.calcularArea());

        rectangulo.setAlto(100);
        rectangulo.setAncho(120);
        System.out.println("El nuevo alto del rectangulo es " + rectangulo.getAlto() + " y su nuevo ancho es " + rectangulo.getAncho());
        System.out.println("El nuevo perimetro del rectangulo es " + rectangulo.calcularPerimetro() + " y su nueva area es " + rectangulo.calcularArea());

        Rectangulo rectangulo2 = new Rectangulo();
        System.out.println("El rectangulo por defecto se inicializa con los atributos: \nancho: " + rectangulo2.getAncho() + "\nalto: " + rectangulo2.getAlto());
    }

    public static void punto2() {
        System.out.println("\nPunto 2:\n");
        Empleado empleado1 = new Empleado("23456345", "Carlos", "Gutiérrez", 25000);
        Empleado empleado2 = new Empleado("34234123", "Ana", "Sánchez", 27500);
        mostrarEmpleado(empleado1);
        mostrarEmpleado(empleado2);

        empleado1.aumentarSalario(0.20);
        double salarioAnual = empleado1.calcularSalarioAnual();
        mostrarEmpleado(empleado1);
        System.out.println("El salario anual es " + salarioAnual);

    }

    public static void mostrarEmpleado(Empleado empleado) {
        System.out.println("Empleado: " + empleado.getNombre() + empleado.getApellido());
        System.out.println("DNI: " + empleado.getDni());
        System.out.println("Salario: " + empleado.getSalario());
    }

    public static void punto3() {
        System.out.println("\nPunto 3:\n");
        ItemDeVenta lentejas = new ItemDeVenta(1, "lentejas deliciosas", 200, 250);
        String info = lentejas.mostrarItem();
        System.out.println(info);
    }

    public static void punto4() {
        System.out.println("\nPunto 4:\n");
        String text = "Realizado en guia de introduccion a objetos";
        System.out.println(text);
    }

    public static void punto5() {
        Hora nuevaHora = new Hora(23, 59, 59);
        System.out.println(nuevaHora.imprimirHora());
        nuevaHora.avanzarUnSegundo();
        System.out.println(nuevaHora.imprimirHora());
        nuevaHora.retrocederUnSegundo();
        System.out.println(nuevaHora.imprimirHora());
    }


}