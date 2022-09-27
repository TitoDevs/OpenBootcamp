package com.example;

public class SmartPhone extends SmartDevice{

    boolean tieneFunda;

    public SmartPhone(){
    }
    public SmartPhone(String marca, String modelo, double pulgadas, int memoria, int ram, boolean tieneFunda) {
        super(marca, modelo, pulgadas, memoria, ram);
        this.tieneFunda = tieneFunda;
    }

    public boolean isTieneFunda() {
        return tieneFunda;
    }

    public void setTieneFunda(boolean tieneFunda) {
        this.tieneFunda = tieneFunda;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "tieneFunda=" + tieneFunda +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pulgadas=" + pulgadas +
                ", memoria=" + memoria +
                ", ram=" + ram +
                '}';
    }
}
