import java.util.ArrayList;

public class Usuarios {
    private ArrayList<Usuario> aUsuarios = new ArrayList<Usuario>();

    public void añadirUsuarios(Usuario ...usuarios) throws UserException {
        for (Usuario usuario : usuarios) {
            if (aUsuarios.contains(usuario)) {
                throw new UserRegisteredException(usuario.nombre);
            }
            aUsuarios.add(usuario);
        }
    }
}
