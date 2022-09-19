public class Tema4 {

    private void condicionIf(int numeroIf){
        if (numeroIf > 0){
            System.out.println("El número " + numeroIf + " es positivo");
        }

        if (numeroIf == 0){
            System.out.println("El número " + numeroIf + " 0");
        }

        if (numeroIf < 0){
            System.out.println("El número " + numeroIf + " es negativo");
        }
    }

    private void bucleWhile(){
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("Vuelta nº " + numeroWhile + " del bucle While");
            numeroWhile++;
        }
    }

    private void bucleDoWhile(){
        int numeroDoWhile = 4;
        do {
            System.out.println("Vuelta nº " + numeroDoWhile + " del bucle Do While");
        } while (numeroDoWhile < 4);
    }

    private void bucleFor(){
        int numeroFor = 0;
        for (int i = 0; i <= 3; i++){
            numeroFor++;
            System.out.println("Vuelta nº " + numeroFor + " del bucle For");
        }
    }

    private void estacionSwitch(String estacion){
        switch (estacion){
            case "Primavera":
                System.out.println("Estación primavera");
                break;
            case "Verano":
                System.out.println("Estación verano");
                break;
            case "Otoño":
                System.out.println("Estación otoño");
            case "Invierno":
                System.out.println("Estación invierno");
                break;
            default:
                System.out.println("No existe esa estación");
                break;
        }
    }

    public static void main(String[] args){

        Tema4 tema4 = new Tema4();
        tema4.condicionIf(2);
        tema4.bucleWhile();
        tema4.bucleDoWhile();
        tema4.bucleFor();
        tema4.estacionSwitch("Verano");
    }
}
