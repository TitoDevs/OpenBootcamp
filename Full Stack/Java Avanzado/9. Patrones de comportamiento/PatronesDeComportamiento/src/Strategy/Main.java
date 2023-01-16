package Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int tipo = 0;
        if (tipo == 0) {
            UsuariosMemoria usuarios = new UsuariosMemoria();
        } else {
            UsuariosFichero usuarios = new UsuariosFichero();
        }

        // crear(usuarios, "fulano");
        // crear(usuarios, "mengano");
        // crear(usuarios, "pepe");

        // for (String usuario : listar(usuarios)) {
        //    System.out.println(usuario);
        //}
    }

    public static void crear(Usuarios usuario, String nombre) {
        usuario.crear(nombre);
    }

    public static ArrayList<String> listar(Usuarios usuarios) {
        return usuarios.listar();
    }
}
