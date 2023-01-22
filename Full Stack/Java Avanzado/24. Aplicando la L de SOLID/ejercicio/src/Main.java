public class Main {
    public static void main(String[] args) {
        System.out.println("Clase coche:");
        Coche coche = new CocheElectrico();
        System.out.println("Combustible: " + coche.getTipo() + "\n");

        System.out.println("Clase CocheExtensión:");
        CocheExtension coche2 = new CocheHibrido();
        System.out.println("Combustible: " + coche2.getTipo());
        System.out.println("Modelo: " + coche2.getModelo() + "\n");

        System.out.println("Clase CocheExtensión:");
        CocheExtension coche3 = new CocheCombustible();
        System.out.println("Combustible: " + coche3.getTipo());
        System.out.println("Modelo: " + coche3.getModelo() + "\n");
    }
}