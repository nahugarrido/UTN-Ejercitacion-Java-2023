package excepciones;

public class PersonaYaExisteException extends Exception {
    private String key;

    public PersonaYaExisteException(String message, String key) {
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
