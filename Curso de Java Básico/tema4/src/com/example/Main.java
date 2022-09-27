package com.example;

public class Main {
    public static void main(String[] args) {
        SmartDevice phone = new SmartPhone("Samsung", "Galaxy X", 5.5, 64, 8, false);
        SmartDevice watch = new SmartWatch("Xiaomi", "GTR", 2.1, 4, 2, true);
        System.out.println(phone);
        System.out.println(watch);
    }
}