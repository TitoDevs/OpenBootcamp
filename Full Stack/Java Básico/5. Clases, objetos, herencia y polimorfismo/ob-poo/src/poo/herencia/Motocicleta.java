package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

/**
 * Clase derivada o clase hija o subclase
 */
public class Motocicleta extends Vehiculo {

    boolean baul;

    public Motocicleta(){

    }
    public Motocicleta(String modelo, String fabricante, double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
        super(modelo, fabricante, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}
