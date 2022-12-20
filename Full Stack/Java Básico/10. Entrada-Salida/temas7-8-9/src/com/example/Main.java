package com.example;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


public class Main {

    public static void main(String[] args) {

        // Cadena al revés
        System.out.println("Cadena al revés");
        String texto = "hola mundo";
        System.out.println(reverse(texto));

        // Array unidimensional
        System.out.println("\nArray unidimensional");
        String[] arrayUni = new String[]{"1", "2", "3", "4"};
        for (String s : arrayUni) {
            System.out.println(s);
        }

        // Array bidimensional
        System.out.println("\nArray bidimensional");
        int[][] arrayBidi = new int[2][2];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[1][0] = 3;
        arrayBidi[1][1] = 4;
        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("Posición " + i);
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("Valor " + arrayBidi[i][j]);
            }
        }

        // Vector
        System.out.println("\nVector");
        Vector<String> vector = new Vector<>();
        vector.add("Pepe");
        vector.add("Juanito");
        vector.add("Rodrigo");
        vector.add("Patricia");
        vector.add("Joaquina");
        vector.remove("Juanito");
        vector.remove("Rodrigo");
        System.out.println(vector);

        // Problema de vector con la capacidad por defecto si tuviesemos 1000 elementos:
        // El problema es que se duplicaría la capacidad (2000) y sería más costoso.

        // ArrayList de String con 4 elementos
        System.out.println("\nArrayList con 4 elementos");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Pepe");
        arrayList.add("Juanito");
        arrayList.add("Rodrigo");
        arrayList.add("Patricia");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // LinkedList
        System.out.println("\nLinkedList");
        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        for (String element : linkedList) {
            System.out.println(element);
        }

        // ArrayList de int
        System.out.println("\nArrayList de int");
        ArrayList<Integer> listEnteros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listEnteros.add(i);
            System.out.println(listEnteros.get(i - 1));
        }

        // Eliminar pares
        System.out.println("\nEliminamos los pares");
        for (int i = 0; i < listEnteros.size(); i++) {
            if (listEnteros.get(i) % 2 == 0) {
                listEnteros.remove(i);
            }
        }

        // Mostrar ArrayList de int
        for (Integer listEntero : listEnteros) {
            System.out.println(listEntero);
        }

        // DividePorCero
        System.out.println("\nDivide por cero");
        DividePorCero(3);

        // InputStream y PrintStream
        System.out.println("\nInputStream y PrintStream");
        try {
            InputStream fileIn = new FileInputStream("C:\\Users\\daniel\\Github\\entrada.txt");
            PrintStream fileOut = new PrintStream("C:\\Users\\daniel\\Github\\destino.txt");
            Conversion(fileIn, fileOut);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Conversion(InputStream fileIn, PrintStream fileOut) {
        try {
            byte[] datos = fileIn.readAllBytes();
            fileIn.close();

            fileOut.write(datos);
            fileOut.close();

        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
    public static void DividePorCero(int num) throws ArithmeticException {
        try {
            int result = num / 0;
            System.out.println("El resultado es: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    public static String reverse(String texto) {
        String result = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            result += texto.charAt(i);
        }
        return result;
    }
}