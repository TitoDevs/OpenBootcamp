package Refactor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ConstructorLargoBuilder constructorLargoBuilder = new ConstructorLargoBuilder("marca")
                .conModelo("b")
                .conMotor("electrico")
                .conPuertas(5);
        esOpenJDKJavaEnMacOS();
    }

    public static boolean esOpenJDKJavaEnMacOS() {
        boolean runTimeOracle = System.getProperty("java.runtime.name").contains("OpenJDK");
        boolean osVersion = System.getProperty("os.version").compareTo("10.0") == 0 ? true : false;

        if (runTimeOracle && osVersion) {
            System.out.println("Es OpenKDK JVM en macOS 11.6");
            return true;
        }
        return false;
    }

    public boolean hoyEsDomingo(int numero) {
        boolean isDomingo = (numero == 7);
        if (isDomingo) {
            System.out.println(isDomingo);
            return isDomingo;
        }
        return isDomingo;
    }

    public static void imprimeMayorYMenor(int[] numeros) {
        // Número mayor
        int imayor = Arrays.stream(numeros)
                        .reduce(0, (a, b) -> a > b ? a : b);

        int imenor = Arrays.stream(numeros)
                        .reduce(0, (a, b) -> a < b ? a : b);

        System.out.println("Mayor: " + imayor + " y menor: " + imenor);
    }

    // Aquí el nombre del método no tiene sentido. La función te devuelve cual de los dos números es mayor o menor
    // y siempre tiene la misma salida a no ser que cambiemos la función. NO tiene sentido
    public static int ifAnidado1() {
        int valor1 = 1;
        int valor2 = 10;

        if (valor1 > valor2) {
            return valor1;
        }
        return valor2;
    }
}