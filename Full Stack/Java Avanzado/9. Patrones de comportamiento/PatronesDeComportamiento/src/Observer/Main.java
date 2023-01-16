package Observer;

public class Main {
    public static void main(String[] args) {
        Emisora emisora = new Emisora();

        ReceptorTv tv = new ReceptorTv();
        ReceptorRadio radio = new ReceptorRadio();
        ReceptorSatelite satelite = new ReceptorSatelite();

        emisora.meteReceptor(tv);
        emisora.meteReceptor(radio);
        emisora.meteReceptor(satelite);

        emisora.emite();
    }
}
