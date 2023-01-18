public class Main {
    public static void main(String[] args) {
        // TODO: es un comentario de algo que queda pendiente por hacer
        // To Do: Por hacer, algo pendiente
        // Se elimina cuando hayamos terminado la tarea por hacer

        /**
         *  Esto es para documentar el comportamiento de una clase, método...
         */

        /* titodev@18/01/23. Cambio en la clase */

        /*
         * Copyright (C) 2023
         */

        /**
         * La clase Usuarios implementa diversos métodos para la gestión del
         * modelo "Uusario". Provee funciones que hacen bla, bla, bla e
         * implementa el patrón "Iterador".
         *
         * El objetivo de esta clase es sustituir a la vieja clase "UsuariosManager"
         * tras una refactorización donde mantener el código antiguo era más costroso
         * que implementar esta nueva clase.
         *
         * A consecuencia de estos cambios, y al mantener durante un tiempo de transición
         * la vieja clase, se recomienda utilizar un patrón "facade" que esconda al
         * desarrollador final esta transición.
         *
         * Al utilizar el patron facade, en primera instancia, el desarrollador deberá invocar
         * a los nuevos métodos, pero garantizamos que a futuro, no deba volver a cambiar el
         * código que interactúa con la base de datos de usuarios.
         *
         * Como consecuencia hay que cambiar las llamadas UserManager por Usuarios.
         *
         * @see https://github.com/
         */

        // Comentario malo
        /*
         * Con esta función podemos meter un usuario en una lista
         */

        //  Comentario bueno
        /*
         * Esta funciónaade un número variable de objetos de tipo Usuario en
         * la instancia real.
         */

        // Comentario redundante
        // Iteramos sobre la lista de usuarios
        // --> Iteramos sobre la lista
    }

    // Código original: https://stackoverflow.com/questions/
    // Copiado por: @titodevs

    // JavaDoc
    /**
     * Devuelvo un boolean si es Domingo o no
     * @param numeroDia entero
     * @throws Exception Si la entrada no es un número
     * @since 12/12/2020
     */
    // Comentarios obligatorios
    private boolean hoyEsDomingo(int numeroDia) {
        // Si numeroDia es 0, lo consideramos Domingo por el calendario que siguen
        // los estadounidenses.
        //
        // Si quedan dudas, hablar con @titodev de este fragmento
        return numeroDia == 0 || numeroDia == 7;
    } // fin hoyEsDomingo


}