public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Pepe");
        usuario.añadirVehiculo(new Vehiculo("Coche"));

        Usuario usuario2 = new Usuario("Juan");
        usuario2.añadirVehiculo(new Vehiculo("Moto"));
        usuario2.añadirVehiculo(new Vehiculo("Coche"));

        Usuarios usuarios = new Usuarios();
        usuarios.meterUsuario(usuario);
        usuarios.meterUsuario(usuario2);

        Usuario userInfo = usuarios.obtenerUsuario("Juan");
        System.out.println("Listando información: " + userInfo.nombre);

        for (Vehiculo vehiculo: userInfo.vehiculos) {
            System.out.println(vehiculo.nombre);
        }
    }
}