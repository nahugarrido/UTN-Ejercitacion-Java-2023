import enums.TipoEnvio;
import enums.TipoVehiculos;
import modelos.Empresa;
import modelos.Paquete;
import modelos.PaqueteAire;
import modelos.PaqueteTierra;

import java.util.Scanner;

//NOTA: almacenamiento, recolección y seguimiento avanzado.
/// No hay informacion de los otros productos que el cliente planea implementar por lo tanto no pueden ser implementados
/// Tambien habria que incluirlos en el presupuesto.

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        String opcion = "";

        do {
            System.out.println("MENU EMPRESA");
            System.out.println("Opcion 1 - Agregar Paquetes");
            System.out.println("Opcion 2 - Mostrar Paquetes");
            System.out.println("Opcion 3 - Ver cantidad total de Paquetes");
            System.out.println("Opcion 4 - Enviar Paquetes");
            System.out.println("Opcion 5 - Mostrar Paquetes sin enviar");
            System.out.println("Opcion 6 - Mostrar Paquetes enviados");
            System.out.println("Opcion 7 - Corroborar no se envian 2 veces (deben enviarse antes)");
            System.out.println("Opcion 8 - Salir");

            opcion = scan.nextLine();

            switch (opcion) {
                case "1":
                    Paquete paquete1 = new PaqueteTierra(1,5,"Argentina",true,false,20, TipoVehiculos.CAMION);
                    Paquete paquete2 = new PaqueteTierra(2,5,"Nicaragua",true,true,20, TipoVehiculos.TREN);
                    Paquete paquete3 = new PaqueteAire(3,3,"Italia",true,false,"AA", TipoEnvio.NORMAL);
                    Paquete paquete4 = new PaqueteAire(4,3,"Mexico",true,true,"BB", TipoEnvio.EXPRESS);
                    System.out.println(empresa.agregarPaquete(paquete1));
                    System.out.println(empresa.agregarPaquete(paquete2));
                    System.out.println(empresa.agregarPaquete(paquete3));
                    System.out.println(empresa.agregarPaquete(paquete4));
                    break;
                case "2":
                    System.out.println(empresa.mostrarPaquetes());
                    break;
                case "3":
                    System.out.println(empresa.cantidadTotalPaquetes());
                    break;
                case "4":
                    System.out.println(empresa.enviarPaquete(1));
                    System.out.println(empresa.enviarPaquete(4));
                    break;
                case "5":
                    System.out.println(empresa.mostrarPaquetesSinEnviar());
                    break;
                case "6":
                    System.out.println(empresa.mostrarPaquetesEnviados());
                    break;
                case "7":
                    System.out.println(empresa.enviarPaquete(4));
                    break;
                case "8":
                    flag = false;
                    break;
                default:
                    System.out.println("Debes seleccionar una opcion valida.");
                    break;
            }

        } while(flag);


    }
}