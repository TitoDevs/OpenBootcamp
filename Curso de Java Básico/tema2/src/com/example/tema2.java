package com.example;

public class tema2 {
    public static void main(String[] args) {

        double resultado = precioConIva(10);
        System.out.println(resultado);
    }

    static double precioConIva(int precio){
        return precio * 1.21;
    }
}