package modelos;

import java.util.Objects;

public class Lancha extends Barco{
    private double capacidadRecoleccion;

    public Lancha(int id, String marca, String modelo, double capacidadCombustible, double capacidadCarga, String patente) {
        super(id, marca, modelo, capacidadCombustible, capacidadCarga, patente);
        this.capacidadRecoleccion = 20;
    }

    @Override
    public String toString() {
        return "Lancha{" + super.toString() +
                "capacidadRecoleccion=" + capacidadRecoleccion +
                '}';
    }

    @Override
    public double pescar(double horas) {
        /// calculo recoleccion bruta
        double recoleccion = horas * this.capacidadRecoleccion;

        /// verifico que no se cargue mas de lo permitido
        if(recoleccion > this.getCapacidadCarga()) {
            recoleccion = this.getCapacidadCarga();
        }

        /// retorno la recoleccion
        return recoleccion;
    }

    public double getCapacidadRecoleccion() {
        return capacidadRecoleccion;
    }
}
