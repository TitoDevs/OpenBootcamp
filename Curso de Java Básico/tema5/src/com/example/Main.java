package com.example;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.findAll();
        cocheCRUD.save();
        cocheCRUD.delete();
    }
}