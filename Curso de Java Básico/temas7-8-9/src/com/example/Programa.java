package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;

public class Programa {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            InputStream fileIn = new FileInputStream("C:/Users/danie/Github/");
            PrintStream fileOut = new PrintStream("destino.txt");
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
}
