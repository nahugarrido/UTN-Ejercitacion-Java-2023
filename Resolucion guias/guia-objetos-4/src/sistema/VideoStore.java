package sistema;

import enums.Clasificacion;
import enums.Genero;
import modelos.BoletaPrestamo;
import modelos.Cliente;
import modelos.Pelicula;
import modelos.PeliculaStock;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class VideoStore {
    private List<PeliculaStock> stock = new ArrayList();
    private List<Cliente> clientes = new ArrayList();
    private List<BoletaPrestamo> prestamos = new ArrayList();

    public VideoStore() {

    }

    public String agregarPelicula(int id, String titulo, Date fecha, Clasificacion clasificacion, String origen, String descripcion, Genero genero) {

        Pelicula nuevaPelicula = new Pelicula(id, titulo, fecha, clasificacion, origen, descripcion, genero);

        for (PeliculaStock item : stock) {
            if (item.getPelicula().getTitulo().equals(nuevaPelicula.getTitulo())) {
                item.setEnStockTotal(item.getEnStockTotal() + 1);
                item.setEnStock(item.getEnStock() + 1);
                return "Stock actualizado con exito";
            }
        }

        PeliculaStock nueva = new PeliculaStock(nuevaPelicula,1,0,1);

        stock.add(nueva);

        return "Pelicula agregada con exito";
    }

    public String aumentarStockPelicula(int id) {

        String texto = "No se ha encontrado la pelicula";

        for (PeliculaStock item : stock) {
            if (item.getPelicula().getId() == id) {
                item.setEnStockTotal(item.getEnStockTotal() + 1);
                item.setEnStock(item.getEnStock() + 1);
                texto = "Stock actualizado con exito";
                break;
            }
        }
        return texto;
    }

    public void alquilarPelicula(String titulo) {

        /// se busca la pelicula
        for(PeliculaStock item : stock) {
            if(item.getPelicula().getTitulo().equals(titulo)) {
                /// se hacen operaciones en stock
                if(item.getEnStock() > 0) {
                    item.setEnStock(item.getEnStock() - 1);
                    item.setEnPrestamo(item.getEnPrestamo() + 1);

                    /// se piden los datos del cliente
                    Cliente nuevoCliente = pedirDatosCliente();

                    /// verificamos si es nuevo cliente
                    if(this.esNuevoCliente(nuevoCliente)) {
                        clientes.add(nuevoCliente);
                    }

                    /// generamos boleta
                    BoletaPrestamo nuevaBoleta = new BoletaPrestamo(nuevoCliente, item.getPelicula());
                    prestamos.add(nuevaBoleta);
                }

            }
        }
    }

    public String devolverPelicula(String nombreCliente, String nombrePelicula) {
        for(BoletaPrestamo boleta : prestamos) {
            /// se chequea estado de boleta, se comparar nombre de cliente y titulo de pelicula
            if(!boleta.isDevolucionRealizada() && boleta.getCliente().getNombre().equals(nombreCliente) && boleta.getPelicula().getTitulo().equals(nombrePelicula)) {
                for(PeliculaStock item : stock) {
                    if(item.getPelicula().getTitulo().equals(nombrePelicula)) {
                        item.setEnPrestamo(item.getEnPrestamo() - 1);
                        item.setEnStock(item.getEnStock() + 1);
                        boleta.setDevolucionRealizada(true);
                    }
                }
            }
        }
        return "Pelicula devuelta con exito";
    }

    public String consultarAlquileresVigentes() {
        String texto = "";

        for(BoletaPrestamo boleta : prestamos) {
//            /// se chequea devolucion no realizada y fecha de retiro
//            if(!boleta.isDevolucionRealizada() && (boleta.getFechaDevolucion().compareTo(LocalDate.now())) > 0) {
//                texto += boleta.toString() + "\n";
//            }

            /// Dejo este para que aparezcan los alquileres atrasados
            if(!boleta.isDevolucionRealizada()) {
                texto += boleta.toString() + "\n";
            }
        }

        return texto;
    }

    public String consultarDevolucionesDelDia() {
        String texto = "";

        for(BoletaPrestamo boleta : prestamos) {
            /// se chequea devolucion no realizada y fecha de retiro /// con == chequea solo del dia <= chequea tambien los atrasados
            if(!boleta.isDevolucionRealizada() && (boleta.getFechaDevolucion().compareTo(LocalDate.now())) == 0) {
                texto += boleta.toString() + "\n";
            }
        }

        return texto;
    }

    public String buscarPorGenero(Genero genero) {
        String texto = "";

        for(PeliculaStock item : stock) {
            if(item.getPelicula().getGenero() == genero) {
                texto += item.getPelicula().toString() + "\n";
            }
        }

        return texto;
    }

    public String detalleTitulo(String titulo) {
        String texto = "No se ha encontrado el titulo";

        for(PeliculaStock item: stock) {
            if(item.getPelicula().getTitulo().equals(titulo)) {
                texto = item.getPelicula().toString();
            }
        }

        return texto;
    }


    public String mostrarStock() {
        String peliculas = "";

        for( PeliculaStock item : stock) {
            peliculas += item.toString() + "\n";
        }


        return peliculas;
    }

    public String mostrarClientes() {
        String texto = "";

        for( Cliente item : clientes) {
            texto += item.toString() + "\n";
        }


        return texto;
    }

    public String mostrarBoletas() {
        String boletas = "";

        for( BoletaPrestamo item : prestamos) {
            boletas += item.toString() + "\n";
        }


        return boletas;
    }

    private boolean esNuevoCliente(Cliente nuevoCliente) {
        boolean flag = true;
        for(Cliente item: clientes) {
            if(item.getTelefono().equals(nuevoCliente.getTelefono())) {
                flag = false;
            }
        }
        return flag;
    }

    private Cliente pedirDatosCliente() {
        Scanner scan = new Scanner(System.in);

        System.out.println("INGRESE SUS DATOS POR FAVOR:");

        System.out.print("Ingrese su nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Ingrese su telefono: ");
        String telefono = scan.nextLine();
        System.out.print("Ingrese su direccion: ");
        String direccion = scan.nextLine();

        scan.close();

        return new Cliente(nombre,telefono,direccion);
    }


}
