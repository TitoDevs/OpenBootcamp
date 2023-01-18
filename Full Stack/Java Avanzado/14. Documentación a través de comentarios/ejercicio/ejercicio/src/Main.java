public class Main {

    public static void main(String[] args) {
        System.out.println(sumaDosNumeros(2,3));
        System.out.println(esPar(5));
    }

    public static int sumaDosNumeros(int a, int b) {
        return a + b;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}