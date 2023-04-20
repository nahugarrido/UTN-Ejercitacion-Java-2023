package modelos;

public class PeliculaStock {
    private Pelicula pelicula;
    private int enStock;
    private int enPrestamo;
    private int enStockTotal;


    public PeliculaStock(Pelicula pelicula, int enStock, int enPrestamo, int enStockTotal) {
        this.pelicula = pelicula;
        this.enStock = enStock;
        this.enPrestamo = enPrestamo;
        this.enStockTotal = enStockTotal;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public int getEnStock() {
        return enStock;
    }

    public int getEnPrestamo() {
        return enPrestamo;
    }

    public int getEnStockTotal() {
        return enStockTotal;
    }

    public void setEnStock(int enStock) {
        this.enStock = enStock;
    }

    public void setEnPrestamo(int enPrestamo) {
        this.enPrestamo = enPrestamo;
    }

    public void setEnStockTotal(int enStockTotal) {
        this.enStockTotal = enStockTotal;
    }

    @Override
    public String toString() {
        return "PeliculaStock{" +
                "id=" + pelicula.getId() +
                "pelicula=" + pelicula.getTitulo() +
                ", enStock=" + enStock +
                ", enPrestamo=" + enPrestamo +
                ", enStockTotal=" + enStockTotal +
                '}';
    }
}
