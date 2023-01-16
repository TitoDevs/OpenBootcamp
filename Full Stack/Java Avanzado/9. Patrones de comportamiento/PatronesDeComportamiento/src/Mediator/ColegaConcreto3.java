package Mediator;

public class ColegaConcreto3 extends Colega {
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto3");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto3, envio un mensaje");
        mediator.reenvia(this);
    }
}
