import javax.swing.*;
import java.util.Hashtable;

// El nombrado deber revelar lo que hace

public class Main {
    public static void main(String[] args) {

        // Notación húngara para objetos
        UserManager oUserManager = new UserManager();
    }
}

// Las clases empiezan en mayúscula y si tiene varias palabras, las iniciales se ponen en mayúscula
class ReverseString {

}

class UserManager {
    // Las constantes siempre se ponen en MAYÚSCULAS y las palabras se separan con un guión bajo
    public int MAX_USERS = 15;

    // Las variables tienen que ser autodescriptivos y empiezan en minúscula (igual que el método)
    private int contador = 0;
    boolean diaONoche;


    // Los métodos empiezan en minúscula y la primera letra de las siguientes palabras se pondrán en mayúsculas
    public void createUser(){
        // Letras permitidas para definir una variable dentro de un bucle: i, j, k...
        for (int i = 0; i < 10; i++){
            // vacio
        }

        // La notación húngara: es un sistema de nomenclatura de variables utilizado en programación
        // para indicar el tipo de datos de una variable. En esta notación, se coloca un prefijo delante del
        // nombre de la variable que indica su tipo, como "i" para "entero", "f" para "flotante" o "str" para "cadena".
        // La notación húngara se utiliza para ayudar a los programadores a entender el tipo de datos de una variable en
        // un código de programación, lo que ayuda a evitar errores y aumenta la legibilidad del código.
        int[] aNumeros = {1, 2, 3, 4};
        boolean bEsDeDia = false;
        char cLetra = 'a';
        double dValor = 5.2d;
        Hashtable<String, Integer> hUsuarios = new Hashtable<>();
        int iValores = 5;
        long iValoresLong = 2;
        String sCadena = "Hola, mundo";
        // var vVariable = 5;
        byte yByte = 1; // o by
        float fFloat = 2.4f; // o fl

        JButton btnBotonAceptar;
        JButton btnBotonCancelar;
        JLabel lblLabel;

        int[] sNumeros2 = {1, 2, 3, 4, 5}; // Error: 's' es para Strings

        int[] aiNumeros2 = {1, 2, 3, 4, 5}; // Correcto
        String[] asNombres = {"Hola", "Juan"};

        // NO se puede reutilizar una variable creada para algo en concreto
        int contador1 = 0;
        // más código
        contador1 = aiNumeros2[2];

        // Tampoco asígnar un nombre que no tenga nada que ver con lo que es
        JLabel lblLabel1 = new JLabel("Botón de aceptar");
    }

    // NO hacer juegos de palabras
    public void talOPimienta() {}
    public void trucoOTrato() {}
    public void iteradorConItinerancia() {}
}

class Casa {
    // Esta totalmemte prohibido que dentro de la clase "Casa" contenga atributos o métodos de "Coches"
}

// Enumeraciones comienzan por la letra n y como son constantes se ponen en mayúsculas
enum nEstado {
    INICIAL,
    EN_PROGRESO
}

// Las interfaces se nombran con adjetivos acabados en able
interface Iterable { // Iterable

}

interface Serializable { // Serializador

}