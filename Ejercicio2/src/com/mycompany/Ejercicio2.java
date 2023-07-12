package com.mycompany;

public class Ejercicio2 {
    public static void main(String[] args) {
        double result=precioConIva(29.99);
        System.out.println(result);
    }

    static double precioConIva(double precio){
        return precio+(precio*0.13);
    }
}
