import java.util.Scanner;

public class Errores {

    public static void main(String[] args) {

        // Errores en tiempo de ejecución
        System.out.println(5 / 0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        // Gestionar errores
        try {
            int resultado = numeroA / numeroB;
            System.out.println("Resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fin");
        }


        // Errores de compilación
        // int numeroA = scanner.nextInt() (le falta el punto y coma)

        // Error lógico / error humano
        int temperatura = 25;
        if (temperatura >= 25){  // Hace calor
            System.out.println("Hace frio");
        }
    }
}
