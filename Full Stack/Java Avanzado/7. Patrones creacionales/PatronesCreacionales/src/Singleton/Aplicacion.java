package Singleton;

public class Aplicacion {

    private static Aplicacion aplicacion;
    boolean isRunnging = false;

    private Aplicacion() {}
    public  static Aplicacion getInstance() {
        if (aplicacion == null) {
            aplicacion = new Aplicacion();
        }
        return aplicacion;
    }
    public void run() {
        if (!isRunnging) {
            System.out.println("Arrancando!");
            isRunnging = true;
        } else {
            System.out.println("Ya estaba en ejecución!");
        }
    }
}
