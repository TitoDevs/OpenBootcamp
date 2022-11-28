package com.example;

public abstract class SmartDevice {

    protected String marca;
    protected String modelo;
    protected double pulgadas;
    protected int memoria;
    protected int ram;

    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, double pulgadas, int memoria, int ram) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.memoria = memoria;
        this.ram = ram;
    }
}
