package com.company;

public class CocheHibrido extends Coche{

    String motorHibrido;

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", motorHibrido='" + motorHibrido + '\'' +
                '}';
    }
}
