package modelos;

import java.time.LocalDate;
import java.util.UUID;

public class Alquiler {
    private UUID uuid;
   private Cliente cliente;
   private Vehiculo vehiculo;
   private LocalDate fechaInicio;
   private LocalDate fechaFinal;

    public Alquiler(Cliente cliente, Vehiculo vehiculo) {
        this.uuid = UUID.randomUUID();
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
