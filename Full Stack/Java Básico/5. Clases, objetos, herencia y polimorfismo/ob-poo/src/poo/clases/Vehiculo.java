package poo.clases;

public class Vehiculo {

    // 1. atributos
    protected String modelo;
    protected String fabricante;
    protected double cc; // la diferencia de double y Double es que Double puede ser nulo.
    protected int year;
    protected boolean sport;
    protected int speed;

    Motor motor;

    // 2. constructores
    public Vehiculo(){

    }

    public Vehiculo(String modelo, String fabricante, double cc, int year, boolean sport, int speed, Motor motor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // 3. métodos (comportamiento)
    public void acelerar(int quantity){
        this.speed += quantity;
    }

    // getter y setter

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // toString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", sport=" + sport +
                ", speed=" + speed +
                '}';
    }
}
