package ConversorController;

public class ConvertorTempController {
     public double celciusToF(double temp){
          return (temp*1.8)+32;
     }
     public double fahrenheitToC(double temp){
          return (temp-32)/1.8;
     }
}
