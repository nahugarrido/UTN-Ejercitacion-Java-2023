package excepciones;

public class ElementoRepetidoException extends Exception {
    private String codigo;



    public ElementoRepetidoException(String codigo,String  msg) {
        super(msg);
        this.codigo = codigo;
    }

    @Override
    public String getMessage() {
        return "el código " + this.getCodigo() + " esta repetido";
    }
    public String getCodigo() {
        return codigo;
    }
}
