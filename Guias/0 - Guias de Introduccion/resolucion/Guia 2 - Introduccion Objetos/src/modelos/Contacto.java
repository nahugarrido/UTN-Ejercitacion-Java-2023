package modelos;

public class Contacto {
    private String nombre;
    private String numeroTelefono;
    private String email;
    public  Contacto(String nombre, String numeroTelefono, String email) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

