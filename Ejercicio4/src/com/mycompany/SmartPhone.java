package com.mycompany;

public class SmartPhone extends SmartDevice{
    double peso;
    int numeroCamaras;

    public SmartPhone(){}
    public SmartPhone(int android,String fabricante,String modelo,double peso, int numeroCamaras){
        super(android,fabricante,modelo);
        this.peso=peso;
        this.numeroCamaras=numeroCamaras;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "peso=" + peso +
                ", numeroCamaras=" + numeroCamaras +
                ", android=" + android +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
