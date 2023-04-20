import enums.Clasificacion;
import enums.Genero;
import sistema.VideoStore;


import java.util.Date;

public class Main {
    public static void main(String[] args) {

        VideoStore videoStore = new VideoStore();
        String retorno = "";


        // Se agregan peliculas
        System.out.println("\nAGREGANDO PELICULAS...");
        retorno = videoStore.agregarPelicula(1, "El amanecer de los monos", new Date(2022, 4, 04), Clasificacion.PG_13, "ES", "Una batalla epica de simios", Genero.ACCION);
        System.out.println(retorno);

        retorno = videoStore.agregarPelicula(3, "El amanecer de los monos", new Date(2022, 4, 04), Clasificacion.PG_13, "ES", "Una batalla epica de simios", Genero.ACCION);
        System.out.println(retorno);

        retorno = videoStore.agregarPelicula(2, "Rapidas y furiosas", new Date(2023, 9, 27), Clasificacion.NC_17, "US", "¿Quién llegará primero?", Genero.COMEDIA);
        System.out.println(retorno);

        retorno = videoStore.aumentarStockPelicula(1);
        System.out.println(retorno);

        System.out.println("\nMOSTRANDO STOCK...");
        retorno = videoStore.mostrarStock();
        System.out.println(retorno);

        System.out.println("\nAlQUILANDO UNA PELICULA...");
        videoStore.alquilarPelicula("El amanecer de los monos");

        System.out.println("\nMOSTRANDO CLIENTES...");
        retorno = videoStore.mostrarClientes();
        System.out.print(retorno);
        System.out.println("\n\nMOSTRANDO BOLETAS...");
        retorno = videoStore.mostrarBoletas();
        System.out.print(retorno);

        System.out.println("MOSTRANDO STOCK...");
        retorno = videoStore.mostrarStock();
        System.out.println(retorno);

        System.out.println("DEVOLVIENDO UNA PELICULA...");
        videoStore.devolverPelicula("nahuel","El amanecer de los monos");






    }
}