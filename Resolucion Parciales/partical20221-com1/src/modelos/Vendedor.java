package modelos;

import interfaces.sueldos;
import java.util.Date;
import java.util.Objects;

public class Vendedor extends Empleado implements sueldos {

    private double montoVentaMensual;

    private double comision;

    public Vendedor(int legajo, String nombre, String apellido, String direccion, Date fechaDeNacimiento, double montoVentaMensual) {
        super(legajo, nombre, apellido, direccion, fechaDeNacimiento);
        this.montoVentaMensual = montoVentaMensual;
        this.comision = 0.3;

    }

    @Override
    public boolean equals(Object object) {
        if(object != null && object instanceof Vendedor) {
            return this.getLegajo() == ((Vendedor) object).getLegajo();
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString() +
                "montoVentaMensual=" + montoVentaMensual +
                ", comision=" + comision +
                '}';
    }

    @Override
    public double cobrarSueldo() {
        return this.getMontoVentaMensual() * this.getComision();
    }

    public double getMontoVentaMensual() {
        return montoVentaMensual;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
