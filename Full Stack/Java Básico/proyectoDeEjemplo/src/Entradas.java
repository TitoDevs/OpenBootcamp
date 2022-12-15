import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entradas {

    public static void main(String[] args) {

        try {
            boolean ok = false;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Mete un número");
                try {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                }catch (InputMismatchException e){
                    System.out.println("Numeros invalidos");
                }
            } while (!ok);


            // System.out.println("Enteros son: " + a + " " + b);

            InputStream fichero = new FileInputStream("C:/Users/danie/Github/");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            try {
                byte datos[] = new byte[5];
                //byte[] datos = fichero.readAllBytes();
                int dato = ficheroBuffer.read();

                while (dato != -1) {
                    System.out.println((char)dato);
                    dato = fichero.read();
                }
                /*for(byte dato: datos) {
                    System.out.println((char)dato);
                }*/

            } catch (IOException e) {
                System.out.println("No puede leer el fichero: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Oye, que el programa da error: " + e.getMessage());
        }
    }
}
