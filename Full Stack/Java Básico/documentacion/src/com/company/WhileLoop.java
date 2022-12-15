package com.company;

public class WhileLoop {

    public static void main(String[] args) {

        int count = 0;

        while(count < 10){
            count++;  // condición
            if (count == 6)
                // continue; // salta el valor 6 y continúa a la siguiente iteración
                break; // romple el flujo de ejecución

            System.out.println("Hola mundo " + count);

        }

        System.out.println("Fin");
    }
}
