package practica2;

public class formacionException extends RuntimeException {
    /**
     *
     * @param message que salta a la hora de no tener un formarto correcto
     */
    public formacionException(String message) {
        super(message);
    }
}
