import modelos.Contacto;
import modelos.Libreta;

public class Main {
    public static void main(String[] args) {
        Libreta libreta = new Libreta();

        Contacto contacto1 = new Contacto(123123);
        Contacto contacto2 = new Contacto(456465, "Libertad 2525");
        Contacto contacto3 = new Contacto(666666, "Jara 852", "Juan Pablo");

        libreta.cargarContacto("Brahian", contacto1);
        libreta.cargarContacto("Carlos", contacto2);
        libreta.cargarContacto("bernardo", contacto3);
        libreta.cargarContacto("Alberto", contacto3);

        System.out.println(libreta.mostrarContactos());

    }
}