package com.mycompany;

public class SmartWatch extends SmartDevice {
    boolean cargaInalambrica;


    public SmartWatch(int android,boolean cargaInalambrica,String fabricante,String modelo){
        super(android,fabricante,modelo);
        this.cargaInalambrica=cargaInalambrica;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "android=" + android +
                ", cargaInalambrica=" + cargaInalambrica +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
