package excepciones;

public class MaximoJugadoresExcepcion extends Exception {

    private int contadorFutbolistas;
    public MaximoJugadoresExcepcion(String msg, int contadorFutbolistas) {
        super(msg);
        this.contadorFutbolistas = contadorFutbolistas;
    }

    @Override
    public String getMessage() {
        return "No se puede tener mas de 23 jugadores en el equipo, la cantidad actual es: " + this.getContadorFutbolistas();
    }

    public int getContadorFutbolistas() {
        return contadorFutbolistas;
    }
}
