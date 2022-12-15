package com.company;

public class CocheMain {

    public static void main(String[] args) {

        String coche = "alfa romeo";
        Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche("rojo","honda","civic",123.45, 5.4);
        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 30.5;

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "Verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "civic";

        System.out.println(cocheElectrico);

        CocheHibrido cocheHibrido = new CocheHibrido();
        System.out.println(cocheHibrido);

        CocheElectrico cocheElectrico1 = new CocheElectrico("azul","alfa","romero",23.4,53.6d,"Text");

        System.out.println(cocheElectrico1);
    }
}
