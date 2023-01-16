package Strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFichero implements Usuarios {

    private String ficheroUsuarios = "usuarios.txt";
    private PrintStream fichero;

    public UsuariosFichero() {
        try {
            fichero = new PrintStream(ficheroUsuarios);
        } catch(Exception e) {
            System.out.println("No puedo abrirlo: " + e.getLocalizedMessage());
        }
    }

    @Override
    public void crear(String nombre) {
        fichero.println(nombre);
    }

    @Override
    public ArrayList<String> listar() {
        ArrayList<String> usuarios = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(ficheroUsuarios));

            while (scanner.hasNext()) {
                usuarios.add(scanner.next());
            }
            scanner.close();

        } catch (Exception e) {
            System.out.println("Error leyendo: " + e.getMessage());
        }

        return usuarios;
    }
}
