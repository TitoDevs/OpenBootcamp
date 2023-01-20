import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static int[] aNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        divisionEntreCero(33);
        getPosicionArray(34);
        existeFile("ejemplo.txt");
    }

    public static int divisionEntreCero(int numero) {
        try {
            return numero / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error ArithmeticException: " + e.getMessage());
        }
        return 0;
    }

    public static int getPosicionArray(int numero) {
        try {
            return aNumeros[numero];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        return 0;
    }

    public static boolean existeFile(String path) {
        try {
            FileInputStream file = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("Error FileNotFoundException: " + e.getMessage());
        }
        return false;
    }
}