package Codigo.Inicial;

import java.util.ArrayList;

public class Usuarios {
    UsuariosDB usuariosDB;

    public Usuarios(UsuariosDB usuariosDB) {
        this.usuariosDB = usuariosDB;
    }

    public ArrayList<Usuario> listar() {
        return usuariosDB.obtener();
    }

    public Usuario obtener(String username) {
        ArrayList<Usuario> usuarios = usuariosDB.obtener();

        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(username)) {
                return usuarioActual;
            }
        }

        return null;
    }

    public void insertar(Usuario usuario) {
        if (obtener(usuario.nombreUsuario) != null) {
            return;
        }

        usuariosDB.insertar(usuario);
    }

    public void borrar(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;
        usuariosDB.borrar(usuario);
    }
}
