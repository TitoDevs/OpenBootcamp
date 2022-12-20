public class Strings {

    public static void main(String[] args) {

        String cadena = "Mensaje de TEXTo";

        int cadenaLen = cadena.length();
        System.out.println("La longitud de mi cadena es de: " + cadenaLen);

        String cadenaMinus = cadena.toLowerCase();
        System.out.println("La cadena ahora es: " + cadenaMinus);

        String cadenaMayus = cadena.toUpperCase();
        System.out.println("La cadena ahora es: " + cadenaMayus);

        boolean resultado = cadena.startsWith("Men");
        boolean resultado2 = cadena.endsWith("o");

        if (resultado) {
            System.out.println("Empieza por lo que estoy buscando");
        } else {
            System.out.println("No empieza por lo que quiero");
        }

        char letra = cadena.charAt(0);
        System.out.println("Caracter es: " + letra);

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Cadena actual: " + cadena.charAt(i));
        }
    }
}