package com.example.estructurascontrol.repeticion;

public class ForEach {
    public static void main(String[] args) {
        String[] nombres = {"Pepe", "Juanito", "Ruperta"}; // length 3

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        int[] numeros = {5,10,15}; // length 3

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

    }
}
