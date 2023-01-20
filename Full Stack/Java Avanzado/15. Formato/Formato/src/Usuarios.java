import java.util.ArrayList;

public class Usuarios {
    ArrayList<String> sUsuarios = new ArrayList<>();
    private int contador = 0;

    public Usuarios() {
        contador = contador + 1;
        contador += 1;
        contador++;

        int sumador = 1;

        for (;;sumador ++) {

        }
    }

    public String obtenerUsuario() {
        return obteneUsuariosDeBasesDeDatos();
    }

    public String obtenerUsuario(int idUsuario) {
        return obteneUsuariosDeBasesDeDatos();
    }

    public String obtenerUsuario(int idUsuario, String nombre) {
        return obteneUsuariosDeBasesDeDatos();
    }

    private String obteneUsuariosDeBasesDeDatos() {
        conectarABBDD();
        return "";
    }

    public void conectarABBDD() {
        // Establecer conexión
        // Verificar conexión
        // Reintentar si falla
        // Devolver handler
    }
}
