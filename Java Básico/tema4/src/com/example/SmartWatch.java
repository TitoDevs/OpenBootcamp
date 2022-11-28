package com.example;

public class SmartWatch extends SmartDevice{

    boolean tieneCorrea;

    public SmartWatch(){
    }
    public SmartWatch(String marca, String modelo, double pulgadas, int memoria, int ram, boolean tieneCorrea) {
        super(marca, modelo, pulgadas, memoria, ram);
        this.tieneCorrea = tieneCorrea;
    }

    public boolean isTieneCorrea() {
        return tieneCorrea;
    }

    public void setTieneCorrea(boolean tieneCorrea) {
        this.tieneCorrea = tieneCorrea;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tieneCorrea=" + tieneCorrea +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pulgadas=" + pulgadas +
                ", memoria=" + memoria +
                ", ram=" + ram +
                '}';
    }
}
