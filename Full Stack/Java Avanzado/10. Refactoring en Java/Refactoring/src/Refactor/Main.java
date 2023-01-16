package Refactor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] numeros = {12, 23, -45, 1, 9};
        // imprimeMayorYMenor(numeros);

        ConstructorLargoBuilder cosa = new ConstructorLargoBuilder("marca")
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
        boolean isDomingo = (numero == 7 ? true : false);
        if (isDomingo) {
            System.out.println(isDomingo);
            return isDomingo;
        }
        return isDomingo;
    }

    public static void imprimeMayorYMenor(int[] numeros) {
        // int mayor = 0;
        // int menor = numeros[0];

        // for (int i: numeros) {
        //     mayor = mayor < i ? i : mayor;
        //     menor = menor > i ? i : menor;
        // }

        // for (int i = 0; i < numeros.length; i++) {
            // if (mayor < numeros[i]) {
            //     mayor = numeros[i];
            // }
            // mayor = mayor < numeros[i] ? numeros[i] : mayor;

            // if (menor > numeros[i]) {
            //     menor = numeros[i];
            // }
            // menor = menor > numeros[i] ? numeros[i] : menor;
        // }

        int mayor = Arrays.stream(numeros)
                        .reduce(0, (a, b) -> a > b ? a : b);

        int menor = Arrays.stream(numeros)
                        .reduce(0, (a, b) -> a < b ? a : b);

        System.out.println("Mayor: " + mayor + " y menor: " + menor);
    }

    public static int ifAnidado1() {
        int valor1 = 10;
        int valor2 = 10;

        if (valor1 > valor2) {
            return valor1;
        } // else {
        //     return valor2;
        // }
        return valor2;
    }
}