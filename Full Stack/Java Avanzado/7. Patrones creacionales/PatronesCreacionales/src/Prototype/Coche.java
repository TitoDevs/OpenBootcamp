package Prototype;

public class Coche implements Cloneable {
    public String marca;
    public String modelo;
    int puertas;

    public Coche() {}

    public Coche clonar() throws CloneNotSupportedException {
        return (Coche)this.clone();
    }
}
