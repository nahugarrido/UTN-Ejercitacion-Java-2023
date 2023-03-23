package modelos;

/// En este caso utilizo System.out.println() dentro de metodos de la clase, esto no debe hacerse.
/// Deberia modularizar mas los metodos para no usar estas llamadas al sistema en el objeto, pero eso implicaria complejizar la logica

public class Agenda {
    private String nombreAgenda;
    private Contacto[] contactos = new Contacto[20];
    private int validos = 0;

    public Agenda(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
    }

    public void cargarContacto(String nombre, String numTelefono, String correo) {
        Contacto nuevoContacto;
        nuevoContacto = new Contacto(nombre, numTelefono, correo);

        contactos[this.validos] = nuevoContacto;
        this.validos++;
    }

    public int buscarContacto(String nombre) {
        boolean flag = false;
        int indice = 0;

        for (int i = 0; i < this.validos; i++) {
            if ((contactos[i].getNombre()).equals(nombre)) {
                System.out.println("Se ha encontrado el contacto!");
                System.out.println(mostrarContacto(i));
                indice = i;
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("No se ha encontrado contacto");
        }

        return indice;
    }

    public String mostrarContacto(int indice) {
        return "Nombre: " + contactos[indice].getNombre() + "Correo Electronico: " + contactos[indice].getEmail() + "Numero de Telefono: " + contactos[indice].getNumeroTelefono();

    }

    public void eliminarContacto(String nombre) {
        int indice = buscarContacto(nombre);

        for (int i = indice; i < this.validos; i++) {
            contactos[i] = contactos[i + 1];
        }
        this.validos--;

        System.out.println("Contacto eliminado con exito!");
    }

    public void editarContacto(String nombre, Contacto nuevoContacto) {
        int indice = buscarContacto(nombre);
        contactos[indice] = nuevoContacto;
        System.out.println("Contacto editado con exito!");
    }


}
