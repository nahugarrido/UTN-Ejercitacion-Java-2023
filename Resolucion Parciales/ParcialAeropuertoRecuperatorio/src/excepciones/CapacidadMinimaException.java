package excepciones;

public class CapacidadMinimaException extends Exception {
    private int capacidad;
    public CapacidadMinimaException(String msg, int capacidad) {
        super(msg);
        this.capacidad = capacidad;
    }


    @Override
    public String getMessage() {
        return "La capacidad maxima del aeropuerto es " + this.getCapacidad();
    }

    public int getCapacidad() {
        return capacidad;
    }
}
