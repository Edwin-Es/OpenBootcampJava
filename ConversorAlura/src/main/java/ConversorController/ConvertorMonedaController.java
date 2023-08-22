package ConversorController;

public class ConvertorMonedaController {

    double dolarAPesoMex=17.04;
    double dolarAPesoCol=4118.96;
    double dolarAPesoArg=350.05;
    double dolarAReal=4.9883;
    double dolarAEuro=0.918;
    double dolarAlibra=0.785;
    double dolarAYen=146.2855;

    public double convertir(double moneda,int opcion) {
        if (opcion >= 0 && opcion <= 13) {
            switch (opcion) {
                case 0 -> {
                    return moneda * dolarAPesoMex;
                }
                case 1 -> {
                    return moneda * dolarAPesoCol;
                }
                case 2 -> {
                    return moneda * dolarAPesoArg;
                }
                case 3 -> {
                    return moneda * dolarAReal;
                }
                case 4 -> {
                    return moneda * dolarAEuro;
                }
                case 5 -> {
                    return moneda * dolarAlibra;
                }
                case 6 -> {
                    return moneda * dolarAYen;
                }
                case 7 -> {
                    return moneda / dolarAPesoMex;
                }
                case 8 -> {
                    return moneda / dolarAPesoCol;
                }
                case 9 -> {
                    return moneda / dolarAPesoArg;
                }
                case 10 -> {
                    return moneda / dolarAReal;
                }
                case 11 -> {
                    return moneda / dolarAEuro;
                }
                case 12 -> {
                    return moneda / dolarAlibra;
                }
                case 13 -> {
                    return moneda / dolarAYen;
                }
            }
            ;
        }
        return moneda;
    }
}
