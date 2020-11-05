package problema6;

import java.util.Scanner;

public class Areas {
    public static double circulo(){
    double resultado;
    
    //variables
    double pi = 3.14;
    double radio;
    double radio2;
    double area;
    
    //programa
    System.out.println("Cuanto mide el radio de el circulo? ");
    Scanner x = new Scanner(System.in);
    radio = x.nextDouble();
    radio2 = radio * radio;
    area = pi * radio2;
    resultado = area;
    
    return resultado;
    }
    public static double rectangulo(){
    double resultado;
    
    //variables
    double altura;
    double base;
    double area;
    
    //programa
    System.out.println("Cuanto mide la base de el rectangulo? ");
    Scanner x = new Scanner(System.in);
    base = x.nextDouble();
    System.out.println("Cuanto mide la altura de el rectangulo? ");
    Scanner y = new Scanner(System.in);
    altura = y.nextInt();
    area = base * altura;
    resultado = area / 2;
    
    return resultado;
}
    public static double cuadrado(){
        double area;
        
        //variables
        double lado;
        double cuadrado;
        
        //programa
        System.out.println("Cuanto mide el lado del cuadrado? ");
        Scanner x = new Scanner(System.in);
        lado = x.nextDouble();
        area = lado * lado;
       
        return area;
    }
    public static void main(String[] args) {

        double resultado = circulo();
        System.out.println("El area es: " + resultado);
    }
}

