package modelos;

import interfaces.sueldos;

import java.util.Date;

public class Administrador extends Empleado implements sueldos {

    private String area;

    private double sueldo;

    public Administrador(int legajo, String nombre, String apellido, String direccion, Date fechaDeNacimiento, String area) {
        super(legajo, nombre, apellido, direccion, fechaDeNacimiento);
        this.area = area;
        this.sueldo = 15;
    }

    public String getArea() {
        return area;
    }

    @Override
    public double cobrarSueldo() {
        return this.getSueldo();
    }

    @Override
    public String toString() {
        return "Administrador{" +
                super.toString() +
                "area='" + area + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if( object != null && object instanceof Administrador) {
                return this.getLegajo() == ((Administrador) object).getLegajo();
        } else {
            return false;
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
