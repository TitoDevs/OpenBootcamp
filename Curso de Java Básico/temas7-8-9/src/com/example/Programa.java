package com.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce la dirección del archivo de entrada: ");
            String entrada = scanner.next();
            System.out.print("Introduce la dirección del archivo de salida: ");
            String salida = scanner.next();
            InputStream fileIn = new FileInputStream(entrada);
            PrintStream fileOut = new PrintStream(salida);

            Conversion(fileIn, fileOut);

            toList();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void Conversion(InputStream fileIn, PrintStream fileOut) throws FileNotFoundException {
        try {
            byte[] datos = fileIn.readAllBytes();
            fileIn.close();
            fileOut.write(datos);
            fileOut.close();

        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }

    public static void toList() {
        String[] nombres = {"Juanito","Paco", "Daniel"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(nombres));
        HashMap<Integer, String> hashList = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            hashList.put(i, list.get(i));
            System.out.println(hashList.get(i));
        }
    }
}
