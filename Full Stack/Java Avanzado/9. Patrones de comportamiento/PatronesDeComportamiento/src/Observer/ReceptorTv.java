package Observer;

public class ReceptorTv implements Receptor {
    @Override
    public void recibe() {
        System.out.println("Señal recibida en TV");
    }
}
