package Encapsulacion;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Pepe");
        usuario.setEdad(13);

        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());
    }
}
