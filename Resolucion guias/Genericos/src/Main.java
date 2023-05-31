import modelos.*;
import otros.Elemento;

public class Main {
    public static void main(String[] args) {
        //punto1();
        //punto2();
        //punto3();
        //punto4();
        punto5();
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

    public static void punto3() {
        double n1 = 0.32;
        double n2 = 0.06;

        OperacionMatematica<Double> calculadora = new OperacionMatematica();

        System.out.println("Resultado de sumar: " + calculadora.sumar(n1, n2));
        System.out.println("Resultado de restar: " + calculadora.restar(n1, n2));
        System.out.println("Resultado de dividir: " + calculadora.dividir(n1, n2));
        System.out.println("Resultado de multiplicar: " + calculadora.multiplicar(n1, n2));
    }

    public static void punto4() {
        Conjunto<Animal> animales = new Conjunto();

        animales.agregarElemento(new Animal("Gato"));
        animales.agregarElemento(new Animal("Perro"));
        animales.agregarElemento(new Animal("Vaca"));
        animales.agregarElemento(new Animal("Gato"));
        System.out.println(animales.mostrarElementos());

        System.out.println("Animal a buscar: Gato, se ha encontrado el animal? " + animales.verificarExistencia(new Animal("Gato")));
    }

    public static void punto5() {
        ListaOrdenada<Elemento> lista = new ListaOrdenada<>();
        lista.agregarElemento(new Elemento(1,"elemento1"));
        lista.agregarElemento(new Elemento(20,"elemento5"));
        lista.agregarElemento(new Elemento(18,"elemento4"));
        lista.agregarElemento(new Elemento(3,"elemento2"));
        lista.agregarElemento(new Elemento(9,"elemento3"));

        System.out.println(lista.mostrarLista());

        System.out.println("Remover elemento: elemento1");
        lista.eliminarElemento(new Elemento(1,"elemento1"));

        System.out.println(lista.mostrarLista());

        System.out.println("Obtener elemento indice (2): " + lista.obtenerElemento(2));
    }

}