public class MainPruebas {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        Usuario openbootcamp = usuarios.obtenerUsuario("openbootcamp2");
        System.out.println(openbootcamp.nombreUsuario);

    }
}
