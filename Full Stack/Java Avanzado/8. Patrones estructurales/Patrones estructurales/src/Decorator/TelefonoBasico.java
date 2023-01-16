package Decorator;

public class TelefonoBasico implements Telefono {
    @Override
    public void crear() {
        System.out.println("Soy un teléfono básico. Tengo estas características: ");
        tengoGSM();
        tengoSMS();
    }

    private void tengoGSM(){
        System.out.println(" -> básico: Tengo GSM");
    }

    private void tengoSMS(){
        System.out.println(" -> básico: Tengo SMS");
    }
}
