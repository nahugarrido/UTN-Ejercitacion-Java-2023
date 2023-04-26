package interfaces;

/// Implemento interfaz por escalabilidad a futuro.
public interface GestionarCostos {
    public abstract double calcularTarifaEnvio();
    public abstract double calcularCostoAdicional();
    public abstract double calcularTotalPaquete();
}
