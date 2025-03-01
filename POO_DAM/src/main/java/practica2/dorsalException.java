package practica2;

public class dorsalException extends RuntimeException {
    /**
     * Clase excepcion para comprobar  que los dorsales no sean iguales
     * * @param message que sale al tener los dorsales iguales
     */
    public dorsalException(String message) {
        super(message);
    }
}
