package modelos;

public class OperacionMatematica<T extends Number> {

    public OperacionMatematica() {

    }
    public T sumar(T n1, T n2) {
        double resultado = n1.doubleValue() + n2.doubleValue();
        return (T) Double.valueOf(resultado);
    }

    public T restar(T n1, T n2) {
        double resultado = n1.doubleValue() - n2.doubleValue();
        return (T) Double.valueOf(resultado);
    }

    public T dividir(T n1, T n2) {
        double resultado = n1.doubleValue() / n2.doubleValue();
        return (T) Double.valueOf(resultado);
    }

    public T multiplicar(T n1, T n2) {
        double resultado = n1.doubleValue() * n2.doubleValue();
        return (T) Double.valueOf(resultado);
    }

}
