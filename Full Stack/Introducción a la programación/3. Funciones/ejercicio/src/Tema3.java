public class Tema3 {

    private void sumaTresNumeros(int num1, int num2, int num3){
        int total;
        total = num1 + num2 + num3;
        System.out.println("La suma de los tres valores es: " + total);
    }

    public static void main(String[] args){
        Tema3 tema3 = new Tema3();
        tema3.sumaTresNumeros(2,3,4);
    }
}
