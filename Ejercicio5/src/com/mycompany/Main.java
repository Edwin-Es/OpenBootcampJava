package com.mycompany;

public class Main {
    public static void main(String[] args) {
        CocheCRUDImpl coche=new CocheCRUDImpl();
        coche.save();
        coche.findAll();
        coche.delete();
    }
}
