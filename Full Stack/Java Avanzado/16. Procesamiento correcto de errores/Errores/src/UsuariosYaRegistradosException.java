public class UsuariosYaRegistradosException extends UsuariosException {
    public UsuariosYaRegistradosException(String message) {
        super("Ya registrado -> " + message);
    }
}
