package modelos;

import java.util.ArrayList;
import java.util.List;

public class DistribuidoraGolosinas {

    private List<Empleado> empleados = new ArrayList();

    private List<Repartidor> repartidores = new ArrayList();

    public DistribuidoraGolosinas() {
    }

//    agregar()
//    buscarPorLegajo()
//    contarEmpleados();
//    devolverListado();
//    eliminarPorLegajo();
//    ###calcularTotalSueldos();

    /// Agregar un empleado nuevo
    public String agregar(Empleado empleado) {
        empleados.add(empleado);
        return "Empleado agregado con exito!";
    }

    /// Buscar un empleado por legajo y retornarlo
    public Empleado buscarPorLegajo(int legajo) {
        for (Empleado aBuscar : empleados) {
            if (aBuscar.getLegajo() == legajo) {
                return aBuscar;
            }
        }
        return null;
    }

    /// Contar empleados
    public int contarEmpleados() {
        int contador = 0;

        for (Empleado item : empleados) {
            contador++;
        }
        return contador;
    }

    /// Devolver listado de empleados
    public List<Empleado> devolverListado() {
        return this.getEmpleados();
    }

    /// Eliminar por legajo
    public String eliminarPorLegajo(int legajo) {
        String texto = "No se ha encontrado el empleado";
        for (Empleado aEliminar : empleados) {
            if (aEliminar.getLegajo() == legajo) {
                empleados.remove(aEliminar);
                texto = "Legajo eliminado con exito";
                break;
            }
        }
        return texto;
    }

    /// Calcular total sueldos
    public double calcularTotalSueldos() {

        double montoTotalSueldos = 0;

        /// Agrego el monto de los sueldos de los empleados
        for(Empleado empleado : empleados) {
            if (empleado instanceof Vendedor) {
                montoTotalSueldos += ((Vendedor) empleado).cobrarSueldo();
            }
            if (empleado instanceof Administrador) {
                montoTotalSueldos += ((Administrador) empleado).cobrarSueldo();
            }
        }

        /// Agrego el monto de los suelos de los repartidores
        for(Repartidor repartidor: repartidores) {
            montoTotalSueldos += repartidor.getKmRecorridos() * 3;
        }

        return montoTotalSueldos;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Repartidor> getRepartidores() {
        return repartidores;
    }

}
