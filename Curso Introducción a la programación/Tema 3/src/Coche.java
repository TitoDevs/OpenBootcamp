public class Coche {

    private int numPuertas = 0;

    private void addPuertas(int num){
        numPuertas = numPuertas + num;
    }

    private void getNumPuertas(){
        System.out.println("Número de puertas: " + numPuertas);
    }

    public static void main(String[] args){
        Coche miCoche = new Coche();
        miCoche.addPuertas(1);
        miCoche.getNumPuertas();
    }
}
