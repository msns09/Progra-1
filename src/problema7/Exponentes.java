package problema7;

import java.util.Scanner;

public class Exponentes {
    
    public static int operacion(){
     //variables
     int base;
     int exponente;
     int resultado = 1;
     
     //programa
     System.out.println("Cual es la base? ");
     Scanner y = new Scanner(System.in);
     base = y.nextInt();
     System.out.println("Cual es el exponente? ");
     Scanner z = new Scanner(System.in);
     exponente = z.nextInt();
     
     for(; exponente != 0; --exponente){
         resultado *= base;
     }
     return resultado;
    }
    public static void main(String[] args) {

        double resultado = operacion();
        System.out.println("El resultado es: " + resultado);
    }
}
