package modelos;

import java.time.LocalDate;

public class BoletaPrestamo {
    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDate fechaRetiro;
    private LocalDate fechaDevolucion;

    private boolean devolucionRealizada;

    public BoletaPrestamo(Cliente cliente, Pelicula pelicula) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaRetiro = LocalDate.now();
        this.fechaDevolucion = fechaRetiro.plusDays(7);
        this.devolucionRealizada = false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean isDevolucionRealizada() {
        return devolucionRealizada;
    }

    public void setDevolucionRealizada(boolean devolucionRealizada) {
        this.devolucionRealizada = devolucionRealizada;
    }

    @Override
    public String toString() {
        return "BoletaPrestamo{" +
                cliente.toString() +
                 pelicula.toString() +
                ", devolucionRealizada =" + devolucionRealizada +
                ", fechaRetiro=" + fechaRetiro +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
