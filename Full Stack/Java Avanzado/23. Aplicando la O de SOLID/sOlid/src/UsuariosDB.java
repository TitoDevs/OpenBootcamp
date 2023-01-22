import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosDB {
    public String ficheroDatos = "usuarios.txt";

    public ArrayList<Usuario> convertirUsuariosFicheroEnArrayList() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String usuarioActual = scanner.next();
                String[] partes = usuarioActual.split(",");

                Usuario usuario = new Usuario();
                usuario.nombreUsuario = partes[0];
                usuario.nombre = partes[1];
                usuario.apellidos = partes[2];
                usuario.email = partes[3];
                usuario.nivelAcceso = Integer.parseInt(partes[4]);

                usuarios.add(usuario);
            }
        } catch (Exception e) {

        }

        return usuarios;
    }

    public void insertar(Usuario usuario){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(ficheroDatos, true);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(separarUsuariosPorComar(usuario));
            printStream.flush();
            printStream.close();
        } catch (Exception e) {}
    }

    public String separarUsuariosPorComar(Usuario usuario) {
        return usuario.nombreUsuario + " "
                + usuario.nombre + " "
                + usuario.apellidos + " "
                + usuario.email + " "
                + usuario.nivelAcceso;
    }

    public void borrar(Usuario usuario) {
        ArrayList<Usuario> usuarios = convertirUsuariosFicheroEnArrayList();

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)) {
                usuarios.remove(i);
            }
        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            for (Usuario usuarioActual : usuarios) {
                String usuarioComas = separarUsuariosPorComar(usuarioActual);
                printStream.println(usuarioComas);
            }

            printStream.flush();
            printStream.close();
        } catch (Exception e) {

        }
    }

    public Usuario buscar(Usuario usuario) {
        ArrayList<Usuario> usuarios = convertirUsuariosFicheroEnArrayList();

        for (Usuario a : usuarios) {
            if (a == usuario) {
                return usuario;
            }
        }
        return null;
    }
}
