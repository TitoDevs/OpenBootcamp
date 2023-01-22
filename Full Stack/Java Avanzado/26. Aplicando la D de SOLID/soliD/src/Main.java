public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Pepe");

        DatabaseSQLite db = new DatabaseSQLite();
        guardarEnBaseDeDatos(db, usuario);
    }

    public static void guardarEnBaseDeDatos(DatabaseStore dbs, Usuario usuario) {
        dbs.guardar(usuario);
    }
}