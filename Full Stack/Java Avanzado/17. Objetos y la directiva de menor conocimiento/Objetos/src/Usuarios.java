import java.util.ArrayList;

public class Usuarios {

    ArrayList<Usuario> usuarios = new ArrayList<>();

    public Usuario obtenerUsuario(String nombre){
        for (Usuario usuario : usuarios) {
            if (usuario.nombre == nombre) {
                return usuario;
            }
        }

        return null;
    }

    public void meterUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
