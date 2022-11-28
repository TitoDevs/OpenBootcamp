package com.company;

public class Funciones {

    public static void main(String[] args) {

        // holaMundo();
        holaMundo();

        // holaMundo("Tito");
        holaMundo("Dani");

        holaMundo("Tito", "Dev");

        String hola = devolverHola();
        System.out.println(hola);
    }

    public static void holaMundo() {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }

    // Función sobrecargada
    protected static void holaMundo(String name){
        System.out.println("Hola " + name);
    }

    private static void holaMundo(String name, String surname){
        System.out.println("Hola " + name + " " + surname );
    }

    private static String devolverHola(){
        return "Devolver texto";
    }

    private static int sum(int num1, int num2){
        return num1 + num2;
    }

}
