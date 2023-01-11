package com.worldevs.demoSpringRest.models;

// POJO
public class Bootcamper {
    private String nombre;
    private double valor;
    public Bootcamper() {}
    public Bootcamper(String nombre, double valor){this.nombre = nombre; this.valor = Math.random();}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public double getValor(){return valor;}
    public void setValor(double valor) {this.valor = valor;}
}
