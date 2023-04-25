package modelos;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }



    // notas metodo equals
    @Override
    public boolean equals(Object aComparar) {
        if (aComparar != null && aComparar instanceof Empleado) {

            return this.getDni().equals(((Empleado) aComparar).getDni());
        }

        return false;
    }

//    @Override
//    public boolean equals(Object aComparar) {
//        if(aComparar != null && aComparar instanceof Hijo) {
//            return super.equals() && ....
//        }



}
