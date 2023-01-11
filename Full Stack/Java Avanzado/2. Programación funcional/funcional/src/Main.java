import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Funcionales f = new Funcionales();
        // f.pruebas();

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Paco");
        nombres.add("Pepe");
        nombres.add("Juan");

        // nombres.stream().forEach(System.out::println);
        // nombres.stream().forEach(x -> System.out.println(x));

        Stream<String> valores = nombres.stream()
                .map((x) -> x.toUpperCase())
                .filter(x -> x.startsWith("P"));

        valores.forEach(x -> System.out.println(x));

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var stNumeros = Arrays.stream(numeros);

        // Forma funcional / declarativa
        var resutado = stNumeros
                .map(x -> x * 2)
                .filter(x -> x % 2 == 0)
                .reduce(0, (x, y) -> {
            System.out.println("X es " + x + ", Y es " + y);
            return x + y;
        });

        // Forma imperativa
        int sumatotal = 0;
        for (int numero: numeros){
            numero = numero * 2;
            if (numero % 2 != 0) {
                continue;
            }
            sumatotal += numero;
        }
        System.out.println("Mi suma de pares es: " + resutado + " y con for: " + sumatotal);
    }

    public static String toMayuscla(String nombre){
        return "Hola " + nombre.toUpperCase();
    }
}