public class Main {
    public static void main(String[] args) {
        getAllArgs(args);

        Usuarios usuarios = new Usuarios();
        Usuario usuario = new Usuario(args[0], args[1], Integer.parseInt(args[2]), Boolean.parseBoolean(args[3]));
        usuario.setAge(29);

        usuarios.addUsuarios(usuario);
        usuarios.getListUsuarios();
    }

    public static void getAllArgs(String[] argIndex) {
        for (String arg : argIndex) {
            System.out.println(arg);
        }
    }
}