import java.io.*;

public class Salidas {

    public static void main(String[] args) throws FileNotFoundException {
        // PrintStream
        System.out.println("cosa");
        PrintStream info = new PrintStream("copia.txt");
        info.println("hola");


        try {
            InputStream in = new FileInputStream("C:/Users/daniel/Github");
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            out.close();

        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
        }

    }
}
