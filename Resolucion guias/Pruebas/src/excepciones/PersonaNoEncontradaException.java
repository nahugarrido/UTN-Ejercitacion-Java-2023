package excepciones;

public class PersonaNoEncontradaException extends Exception {

    private String key;

    public PersonaNoEncontradaException(String message, String key) {
        super(message);
        this.key = key;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + this.getKey();
    }

    public String getKey() {
        return key;
    }
}
