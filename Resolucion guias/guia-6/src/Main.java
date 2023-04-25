import modelos.ArrayReales;
import modelos.Matematicas;
import modelos.Numero;

public class Main {
    public static void main(String[] args) {

//        punto1();

//        punto2();

        punto3();
    }

    public static void punto1() {
        ArrayReales lista = new ArrayReales();
        lista.cargarLista();

        System.out.println("El maximo es " + lista.maximo());
        System.out.println("El minimo es " + lista.minimo());
        System.out.println("El sumatorio es " + lista.sumatorio());
    }

    public static void punto2() {
        Matematicas lista = new Matematicas();

        lista.cargarLista();

        System.out.println("El inicio es " + lista.inicio());
        System.out.println("El ultimo es " + lista.fin());
    }

    public static void punto3() {
        Numero numero1 = new Numero(2);
        Numero numero2 = new Numero(5);

        System.out.println("Son iguales? " + numero1.esIgual(numero2));
        System.out.println("Es numero1 mayor que numero2? " + numero1.esMayor(numero2));
        System.out.println("Es numero1 menor que numero2? " + numero1.esMenor(numero2));
    }


}