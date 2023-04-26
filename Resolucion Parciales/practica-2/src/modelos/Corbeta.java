package modelos;

public class Corbeta extends Barco{
    private int cantidadJaulas;
    private int capacidadJaulas;

    /// creo atributo para poder calcular velocidad de recoleccion x jaula x hora
    private double velocidadRecoleccion;

    public Corbeta(int id, String marca, String modelo, double capacidadCombustible, double capacidadCarga, String patente, int cantidadJaulas) {
        super(id, marca, modelo, capacidadCombustible, capacidadCarga, patente);
        this.cantidadJaulas = cantidadJaulas;
        this.capacidadJaulas = 10;
        this.velocidadRecoleccion = 10;
    }



    @Override
    public double pescar(double horas) {
        /// calculo la recoleccion bruta
        double recoleccion = horas * this.getVelocidadRecoleccion() * this.getCantidadJaulas();

        /// chequeo que no exceda la capacidad de la corbeta
        if(recoleccion > this.getCapacidadCarga()) {
            recoleccion = this.getCapacidadCarga();
        }
        return recoleccion;
    }

    @Override
    public String toString() {
        return "Corbeta{" + super.toString() +
                "cantidadJaulas=" + cantidadJaulas +
                ", capacidadJaulas=" + capacidadJaulas +
                ", velocidadRecoleccion=" + velocidadRecoleccion +
                '}';
    }

    public int getCantidadJaulas() {
        return cantidadJaulas;
    }

    public int getCapacidadJaulas() {
        return capacidadJaulas;
    }

    public double getVelocidadRecoleccion() {
        return velocidadRecoleccion;
    }
}
