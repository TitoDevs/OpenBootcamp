package Adapter;

public class Lightbulb {
    boolean poweredON = false;
    int voltage = 0;

    public void turnOn(int voltage) {
        poweredON = true;
        this.voltage = voltage;
        System.out.println("Lightbulb poweredOn with " + voltage + " of current");
    }

    public void turnOff() {
        poweredON = false;
        voltage = 0;
        System.out.println("Lightbulb poweredOff");
    }

    public boolean isPoweredOn() {
        return poweredON;
    }
}
