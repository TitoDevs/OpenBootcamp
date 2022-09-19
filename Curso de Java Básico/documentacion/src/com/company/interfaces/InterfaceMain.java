package com.company.interfaces;

import com.company.Coche;

public class InterfaceMain {

    public static void main(String[] args) {

        CocheService service = new CocheServiceClassicImpl();
        CocheService service1 = new CocheServiceSportImpl();

        Coche coche = service.crearCocheDemo();

        Coche coche1 = service1.crearCocheDemo();
    }
}
