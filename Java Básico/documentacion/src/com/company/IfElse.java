package com.company;

public class IfElse {

    public static void main(String[] args) {

        boolean check = 5 < 10;

        int number1 = 5;
        int number2 = 10;
        int number3 = 20;
        int number4 = 1000;

        if (check && number1 < number2){
            System.out.println("Verdadero");
        } else if (number3 < number4){
            System.out.println("else if");
        } else {

        }

        System.out.println("Fin");
    }
}
