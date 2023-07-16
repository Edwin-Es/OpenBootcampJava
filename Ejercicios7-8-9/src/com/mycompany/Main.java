package com.mycompany;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // instruccion 1:
        instruccion(1);
        String[] cadenas= {"hola","mundo","de la","programacion"};
        for(String cadena:cadenas){
            System.out.print(cadena +" ");
        }
        System.out.println();

        //Intruccion 2:
        instruccion(2);
        Integer[][] bidimensional={{1,2,3},{10,20,30}};
        for(int i=0;i<2;i++){
            for(int j=0;j<=2;j++){
                System.out.println("Valor en posicion: i:"+i+" j:"+j+" es:"+bidimensional[i][j]);
            }
        }

        //Intruccion 3:
        instruccion(3);
        Vector<Integer> numeros=new Vector<>();
        numeros.add(1);numeros.add(2);numeros.add(3);numeros.add(4);numeros.add(5);
        numeros.remove(1);numeros.remove(1);//al remover el segundo el tercero se vuelve el segundo por ende es el mismo index
        System.out.println(numeros);

        //Intruccion 4:
        /*
        Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        R// Si la capacidad excede los 1000 registros el vector se duplicara con 2000 espacios y estara copiando cada registro en el nuevo vector teniendo
        una capicidad de 3000 en total
         */

        //Intruccion 5:
        instruccion(5);
        ArrayList<String> cadena2=new ArrayList<>();
        cadena2.add("Hola");
        cadena2.add("como");
        cadena2.add("estan");
        cadena2.add("todos");

        LinkedList<String> cadena2linked=new LinkedList<>(cadena2);

        for(String cadena2link:cadena2linked){
            System.out.print(cadena2link +" ");
        }
        System.out.println(" ");

        //Instruccion 6:
        instruccion(6);
        ArrayList<Integer> numeros2=new ArrayList<>();
        for(int i=1;i<=10;i++){
            numeros2.add(i);
        }
        for(Integer numero2:numeros2){
            if(numero2%2!=0){
                System.out.println(numero2);
            }
        }

        //Instrucion 7:
        instruccion(7);
        try{
            DividePorCero();
        }catch (ArithmeticException e){
            System.out.println("esto no se puede hacer");
        }
        finally{
            System.out.println("Demo del codigo");
        }

        //Instruccion 8:
        instruccion(8);
        try{
            FileInputStream fileIn=new FileInputStream("c://desktop/java/demo/file.txt");
            PrintStream fileOut=new PrintStream("file.text");
        }catch (Exception e){
            System.out.println("File no existe");
        }


        //Instruccion 9:
        instruccion(9);
        Scanner in= new Scanner(System.in);
        System.out.print("Digite su cadena de texto: --> ");
        String cadena= in.nextLine();
        String[] parts = cadena.split("");
        String[] newcadena= new String[parts.length];
        int j=0;
        for(int i=parts.length-1;i>=0;i--){
            newcadena[j]=parts[i];
            j++;
        }
        System.out.println("Su cadena al revez seria:" + Arrays.toString(newcadena));



    }

    public static void instruccion(int num){
        System.out.println(" ");
        System.out.println("Instruccion "+num);
    }

    public static void DividePorCero() throws ArithmeticException{
        throw new ArithmeticException();
    }

}
