package com.example;

public class Concatenar {
    public static void main(String[] args) {
        String[] nombres = {"Pepito", "Juanito", "eveready"};
        String resultado = "";
        for (String nombre : nombres){
            resultado += nombre;
            System.out.println(resultado);
        }
    }
}