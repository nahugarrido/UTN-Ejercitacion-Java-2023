package modelos;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
     private List<Barco> barcos;

     /// recoleccion en kg
     private double recoleccionLancha;
     /// recoleccion en kg
     private double recoleccionCorbeta;
     private double precioMerluza;



    public Sistema() {
        this.barcos = new ArrayList();
        this.precioMerluza = 11;
    }

    public String agregarBarco(Barco nuevoBarco) {
        barcos.add(nuevoBarco);
        return "El barco con id: " + nuevoBarco.getId() + ", ha sido agregado con exito";
    }

    public String mostrarBarcos() {
        String texto = "";
        for(Barco item : barcos) {
            texto += item.toString() + "\n";
        }
        return texto;
    }

    public String enviarBarcoAPescar(int id, double horas) {
        double recoleccion = 0;

        for(Barco barco: barcos) {
            if(barco.getId() == id) {

                recoleccion = barco.pescar(horas);

                if( barco instanceof Lancha) {
                    this.setRecoleccionLancha(this.getRecoleccionLancha() + recoleccion);
                }

                if( barco instanceof Corbeta) {
                    this.setRecoleccionCorbeta(this.getRecoleccionCorbeta() + recoleccion);
                }

                break;
            }
        }

        return "El barco con id: " + id + " ha sido enviado a pescar y a retornado con una pesca de " + recoleccion + " kilos";
    }

    public String totalRecaudadoLancha() {
        double recaudado = this.getRecoleccionLancha() * this.getPrecioMerluza();
        return "El total recaudado de lanchas es de $" + recaudado + " dolares.";
    }

    public String totalRecaudadoCorbeta() {
        double recaudado = this.getRecoleccionCorbeta() * this.getPrecioMerluza();
        return "El total recaudado de corbetas es de $" + recaudado + " dolares.";
    }

    public String totalRecaudado() {
        double recaudado = this.getPrecioMerluza() * (this.getRecoleccionCorbeta() + this.getRecoleccionLancha());
        return "El total recaudado de lanchas es de $" + recaudado + " dolares.";
    }

    public double getRecoleccionLancha() {
        return recoleccionLancha;
    }

    private void setRecoleccionLancha(double recoleccionLancha) {
        this.recoleccionLancha = recoleccionLancha;
    }

    public double getRecoleccionCorbeta() {
        return recoleccionCorbeta;
    }

    private void setRecoleccionCorbeta(double recoleccionCorbeta) {
        this.recoleccionCorbeta = recoleccionCorbeta;
    }

    public double getPrecioMerluza() {
        return precioMerluza;
    }

    public void setPrecioMerluza(double precioMerluza) {
        this.precioMerluza = precioMerluza;
    }
}
