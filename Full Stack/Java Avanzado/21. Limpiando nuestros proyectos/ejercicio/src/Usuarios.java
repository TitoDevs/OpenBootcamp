import java.util.ArrayList;

public class Usuarios {

    private ArrayList<Usuario> listUsuarios = new ArrayList<>();

    public void getListUsuarios() {
        for (Usuario usuario : listUsuarios) {
            System.out.println("Nombre: " + usuario.getName());
        }
    }

    public void addUsuarios(Usuario usuario) {
        listUsuarios.add(usuario);
    }
}
