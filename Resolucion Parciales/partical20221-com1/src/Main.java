import modelos.Administrador;
import modelos.DistribuidoraGolosinas;
import modelos.Empleado;
import modelos.Vendedor;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DistribuidoraGolosinas distribuidora = new DistribuidoraGolosinas();
        String opcion;

        do {

            /// MENU
            System.out.println("\nDISTRIBUIDORA PARCIAL 1 MENU:");
            System.out.println("Opcion 1 - Cargar Datos");
            System.out.println("Opcion 2 - Buscar empleado por legajo");
            System.out.println("Opcion 3 - Contar empleados");
            System.out.println("Opcion 4 - Ver lista de empleados");
            System.out.println("Opcion 5 - Eliminar un empleado");
            System.out.println("Opcion 6 - Calcular total sueldos");
            System.out.println("Opcion 7 - Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scan.nextLine();

            /// SWITCH CON INVOCACIONES DE FUNCIONES
            switch(opcion) {
                case "1":
                    System.out.println("OPCION SELECIONADA: Opcion 1 - Cargar Datos");
                    Vendedor vendedor1 = new Vendedor(1,"Juan Carlos","Gutierrez","Jara 2101", new Date(2000,2,2),1000);
                    Vendedor vendedor2 = new Vendedor(2,"Axel","De la Canal","Mario Bravo 567", new Date(1996,5,15),5000);
                    Vendedor vendedor3 = new Vendedor(3,"Jeremias","Richard","Constitucion 3100", new Date(1995,8,22),3000);
                    Administrador administrador1 = new Administrador(4,"Señor","Administrador","Independencia 323",new Date(1980,3,12),"Recursos Humanos");
                    Administrador administrador2 = new Administrador(5,"Señora","Administradora","Juan B Justo 562",new Date(1965,8,30),"Sistemas");
                    System.out.println(distribuidora.agregar(vendedor1));
                    System.out.println(distribuidora.agregar(vendedor2));
                    System.out.println(distribuidora.agregar(vendedor3));
                    System.out.println(distribuidora.agregar(administrador1));
                    System.out.println(distribuidora.agregar(administrador2));
                    System.out.println("Datos cargados con exito..............");
                    break;

                case "2":
                    System.out.println("OPCION SELECIONADA: Opcion 2 - Buscar empleado por legajo");
                    /// SE SELECCIONA UN LEGAJO A BUSCAR
                    int legajoABuscar = 3;
                    System.out.println("Empleado a buscar: " + legajoABuscar);
                    Empleado encontrado = distribuidora.buscarPorLegajo(legajoABuscar);
                    System.out.println("Empleado: " + encontrado.toString());

                    break;
                case "3":
                    System.out.println("OPCION SELECIONADA: Opcion 3 - Contar empleados");
                    System.out.println("Cantidad de empleados : " + distribuidora.contarEmpleados());

                    break;
                case "4":
                    System.out.println("OPCION SELECCIONADA: Opcion 4 - Ver lista de empleados");
                    List<Empleado> empleados = distribuidora.getEmpleados();

                    for(Empleado empleado : empleados) {
                       System.out.println(empleado.toString());
                    }

                    break;
                case "5":
                    System.out.println("OPCION SELECIONADA: Opcion 5 - Eliminar un empleado");
                    int legajoAEliminar = 3;
                    System.out.println("Empleado a eliminar: " + legajoAEliminar);
                    distribuidora.eliminarPorLegajo(legajoAEliminar);
                    break;
                case "6":
                    System.out.println("OPCION SELECIONADA: Opcion 6 - Calcular total sueldos");
                    System.out.println("El total de sueldos es " + distribuidora.calcularTotalSueldos());
                    break;
                case "7":
                    break;
                default:
                    System.out.println("Debes seleccionar una opcion valida!");
                    System.out.println("\n");
                    break;
            }

        } while(opcion != "7");

    }


}