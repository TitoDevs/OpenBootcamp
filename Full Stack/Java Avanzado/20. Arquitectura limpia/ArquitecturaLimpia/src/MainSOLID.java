public class MainSOLID {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
                new Coche(),
                new Moto(),
                new Furgoneta(),
                new Avion()
        };

        imprimePotencia(vehiculos);

        Coche avion = new Coche();
        System.out.println(avion.obtenerPotencia());
    }

    public static void imprimePotencia(Vehiculo[] vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.obtenerPotencia());
        }
    }}