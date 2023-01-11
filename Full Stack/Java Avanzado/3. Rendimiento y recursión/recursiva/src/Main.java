import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Suma iterativa: " + suma(5));
        System.out.println("Suma recursiva: " + sumaRecursitva(5));
        System.out.println("Suma funcional: " + sumaFuncional(5));

        System.out.println("Factorial iterativa: " + factorial(5));
        System.out.println("Factorial recursiva: " + factorialRecursivo(5));
        System.out.println("Factorial funcional: " + factorialFuncional(5));
    }

    public static int factorial(int numero) {
        int resultado = 1;

        for(int i = 1; i <= numero; i++){
            resultado *= i;
        }

        return resultado;
    }

    public static int factorialRecursivo(int numero){
        if(numero == 0){
            return 1;
        }

        return numero * factorialRecursivo(numero - 1);
    }

    public static int factorialFuncional(int numero){
        return IntStream.rangeClosed(1, numero)
                .reduce(1, (a, b) -> a * b);
    }

    // Función recursiva
    public static int sumaRecursitva(int numero) {
        if (numero == 1) {
            return 1;
        }
        return numero + sumaRecursitva(numero - 1);
    }

    public static int sumaFuncional(int numero) {
        // 5 + 4 + 3 + 2 + 1
        return IntStream.rangeClosed(1, 5)
                .reduce(0, (a, b) -> a + b);
    }

    // de cola
    public static void tailRecursion(int valor){
        if (valor == 0) {
            return;
        }
        System.out.println(valor);
        tailRecursion(valor - 1);
    }

    // de cabeza
    public static void headRecursion(int valor) {
        if (valor == 0) {
            return;
        }
        headRecursion(valor - 1);
        System.out.println(valor);
    }

    // Funcion iterativa
    public static int suma (int max){
        int resultado = 0;

        for (int i = 0; i <= max; i++) {
            resultado = resultado + i;
            // resultado += i;
        }

        return resultado;
    }
}