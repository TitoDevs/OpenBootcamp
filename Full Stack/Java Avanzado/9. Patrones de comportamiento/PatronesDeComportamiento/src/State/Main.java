package State;

public class Main {
    public static void main(String[] args) {
        Telefono tel1 = new Telefono();
        Telefono tel2 = new Telefono();

        System.out.println(tel1.estado.desbloquear());
        System.out.println(tel1.estado.abrirCamara());
        System.out.println(tel1.estado.hacerFoto());
        System.out.println(tel1.estado.hacerFoto());
        System.out.println(tel1.estado.hacerFoto());
    }
}
