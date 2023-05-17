import modelos.Almacenamiento;
import modelos.Animal;
import modelos.Pila;

public class Main {
    public static void main(String[] args) {
        //punto1();
        punto2();
    }

    public static void punto1() {
        Almacenamiento<Animal>  almacenamiento = new Almacenamiento<>();
        Animal animal1 = new Animal("Gato");
        Animal animal2 = new Animal("Jaguar");
        Animal animal3 = new Animal("Puma");

        almacenamiento.agregar(animal1);
        almacenamiento.agregar(animal2);
        almacenamiento.agregar(animal3);

        System.out.println(almacenamiento.mostrarAlmacenamiento());

        Animal buscado = almacenamiento.buscar(animal2);

        System.out.println("Elemento buscado: " + buscado.toString());
    }

    public static void punto2() {
        Pila<Integer> pilaEnteros = new Pila();

        pilaEnteros.apilar(1);
        pilaEnteros.apilar(2);
        pilaEnteros.apilar(3);
        pilaEnteros.apilar(4);
        pilaEnteros.apilar(5);
        pilaEnteros.mostrarPila();
        System.out.println("Tope: " + pilaEnteros.tope());
        System.out.println("Desapilar: " + pilaEnteros.desapilar());
        pilaEnteros.mostrarPila();

    }
}