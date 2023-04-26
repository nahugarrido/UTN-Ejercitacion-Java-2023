package modelos;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Paquete> paquetes;

    public Empresa() {
        this.paquetes = new ArrayList();
    }

    public String agregarPaquete(Paquete nuevoPaquete) {
        paquetes.add(nuevoPaquete);
        return "El paquete con id: " + nuevoPaquete.getId() + " ha sido agregado con exito";
    }

    public String mostrarPaquetes() {
        String texto = "";
        List<Paquete> listaMostrar = this.getPaquetes();

        for (Paquete item : listaMostrar) {
            texto += item.toString() + "\n";
        }

        return texto;
    }

    /// La funcion de contar paquetes considera si el paquete ha sido enviado o no
    public String cantidadTotalPaquetes() {
        int contadorSinEnviar = 0;
        int contadorEnviados = 0;
        List<Paquete> listaContar = this.getPaquetes();

        for (Paquete item : listaContar) {
            if (!item.isEstaEnviado()) {
                contadorSinEnviar++;
            } else {
                contadorEnviados++;
            }
        }

        return "La empresa actualmente tiene " + contadorSinEnviar + " paquetes sin enviar y " + contadorEnviados + " enviados, siendo en total " + (contadorEnviados + contadorSinEnviar) + " paquetes";
    }

    public String enviarPaquete(int id) {
        List<Paquete> listaRecorrer = this.getPaquetes();
        String texto = "No se ha encontrado el paquete";


        for (Paquete item : listaRecorrer) {
            if (item.getId() == id) {
                if (item.isEstaEnviado()) {
                    texto = "El paquete ya ha sido enviado";
                } else {
                    item.setEstaEnviado(true);
                    texto = "Se ha enviado el paquete correctamente.";
                }
                break;
            }
        }

        return texto;
    }

    public String mostrarPaquetesSinEnviar() {
        List<Paquete> listaRecorrer = this.getPaquetes();
        String texto = "";

        for (Paquete item : listaRecorrer) {
            if (!item.isEstaEnviado()) {
                texto += item.toString() + "\n";
            }
        }

        return texto;
    }

    public String mostrarPaquetesEnviados() {
        List<Paquete> listaRecorrer = this.getPaquetes();
        String texto = "";

        for (Paquete item : listaRecorrer) {
            if (item.isEstaEnviado()) {
                texto += item.toString() + "\n";
            }
        }

        return texto;
    }

    private List<Paquete> getPaquetes() {
        return paquetes;
    }
}
