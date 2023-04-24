package modelos;

import java.util.Date;
import java.util.Objects;

public abstract class Empleado {
    private int legajo;
    private String nombre;
    private String apellido;
    private String direccion;
    private Date fechaDeNacimiento;

    public Empleado(int legajo, String nombre, String apellido, String direccion, Date fechaDeNacimiento) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return legajo == empleado.legajo && Objects.equals(nombre, empleado.nombre) && Objects.equals(apellido, empleado.apellido) && Objects.equals(direccion, empleado.direccion) && Objects.equals(fechaDeNacimiento, empleado.fechaDeNacimiento);
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
}
