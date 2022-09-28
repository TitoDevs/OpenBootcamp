import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Warnings {


    public static void main(String[] args) {
        //demoMapa();
        try {
            divide(4,0);
        } catch (Exception e) {
            System.out.println("AAA");
        }

    }

    public static int divide(int A, int B) throws ArithmeticException, IOException {
        int resultado = 0;

        try {
            resultado = A / B;
        } catch (ArithmeticException e){
            throw new IOException();
        }
        return resultado;
    }
    private static void demoMapa() {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);

        for (Map.Entry<String, Integer> elemento: mapa.entrySet()) {
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());
        }
    }
}
