package iterator;

public interface UsuarioIterator {
    // Hay más usuarios en el iterador?
    boolean hayMas();

    // Reinicia el contador (el iterador)
    void reinicia();

    // Obtiene el siguiente
    Usuario siguiente();
}
