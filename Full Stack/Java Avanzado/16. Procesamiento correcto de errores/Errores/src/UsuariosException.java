public class UsuariosException extends Exception {
    public UsuariosException(String message) {
        super("Error al registrar -> " + message);

        for (StackTraceElement element : getStackTrace()) {
            System.out.println(element.getClassName() + " " + element.getMethodName());
        }
    }
}
