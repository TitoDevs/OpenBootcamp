import java.util.ArrayList;

public class Usuarios {
    ArrayList<String> usuarios = new ArrayList<String>();
    ArrayList<Usuario> usuarios2 = new ArrayList<>();


    public Usuarios(Usuario usuario) {
        usuarios2.add(usuario);
    }

    public ArrayList<Usuario> getUsuarios2() {
        return usuarios2;
    }

    private void Usuarios(){}

    public void meterUsuario(String nombre) throws UsuariosNombreCortoException, UsuariosYaRegistradosException {
        if (nombre.length() < 5) {
            throw new UsuariosNombreCortoException(nombre);
        }
        for (String usuario : usuarios) {
            if (usuario == nombre) {
                throw new UsuariosYaRegistradosException(nombre);
            }
        }
        System.out.println("Usuario metido: " + nombre);
        usuarios.add(nombre);
    }
}
