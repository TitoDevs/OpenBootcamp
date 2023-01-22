import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = "openbootcamp";
        usuario.nombre = "Open";
        usuario.apellidos = "Boorcamp";
        usuario.email = "ejemplos@open-bootcamp.com";
        usuario.nivelAcceso = 1;

        Usuario usuario2 = new Usuario();
        usuario2.nombreUsuario = "openbootcamp2";
        usuario2.nombre = "Open";
        usuario2.apellidos = "Boorcamp";
        usuario2.email = "ejemplos@open-bootcamp.com";
        usuario2.nivelAcceso = 5;

        Usuario usuario3 = new Usuario();
        usuario3.nombreUsuario = "openbootcamp3";
        usuario3.nombre = "Open";
        usuario3.apellidos = "Boorcamp";
        usuario3.email = "ejemplos@open-bootcamp.com";
        usuario3.nivelAcceso = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 (ficheros) - 2 (memoria) - 3 (vacio)");
        UsuariosDB usuariosDB;
        int tipo = scanner.nextInt();
        if (tipo == 1) {
            usuariosDB = new UsuariosDBFichero();
        } else if (tipo == 2) {
            usuariosDB = new UsuariosDBMemoria();
        }

        Usuarios usuarios = new Usuarios(new UsuariosDBMemoria());
        usuarios.insertar(usuario);
        usuarios.insertar(usuario2);
        usuarios.insertar(usuario3);

        for (Usuario a : usuarios.listar()){
            System.out.println("Usuario actual: " + a.nombreUsuario);
            System.out.println("----------------" + "-".repeat(a.nombreUsuario.length()));
            System.out.println(a);
            System.out.println();
        }
    }
}