package com.example;

/**
 * Crear una función que reciba un precio y devuelva el precio con el IVA incluido
 */
public class Funciones {


    public static void main(String[] args) {

        // opción 1: funciones sin parámetros y sin tipo de retorno
        showMenu();
        // showMenu();

        // opción 2: función sin parámetros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrice();
        System.out.println(price);

        // opción 3: función con parámetros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootcamp");

        // opción 4: función con parámetros y con tipo de retorno
        String nombre = "Ana";
        String apellido = "Sastre";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int resultadoSuma = suma(50,200);
    }

    static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    static String obtenerSaludo(String nombre, String apellido) {
        return "Buenas tardes " + nombre + " " + apellido;
    }

    static void imprimirSaludoBuenosDias(String nombre) {
        System.out.println("Buenas tardes " + nombre);
    }

    static double getPrice() {
        return 100.99;
    }

    /**
     * void indica que no devuelve nada
     */
    static void showMenu(){
        System.out.println("Bienvenido al E-commerce de zapatillas:");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatilla");
        System.out.println("3 - Salira");
    }

    static String getMenu(){
        return "Bienvenidos al E-commerce de zapatillas \n 1 - Ver zapatillas....";

    }
}
