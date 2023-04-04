package org.example.modelos;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public double calcularSalarioAnual() {
        return this.getSalario() * 12;
    }

    public String aumentarSalario(double porcentaje){
       double nuevoSalario = this.getSalario() * (1 + porcentaje);
       this.setSalario(nuevoSalario);
       return "Salario aumentado con exito";
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }
}
