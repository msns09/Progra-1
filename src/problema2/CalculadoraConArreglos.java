
package problema2;

import java.util.Scanner;


public class CalculadoraConArreglos {
    public static int promedio(int[] numeros){
        int resultado = 0;
        
        int suma = 0;
        for(int elem : numeros){
            suma = suma + elem;
        }
         resultado = suma / numeros.length;       
        return resultado;
    }
    public static void main(String[] args){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor digite los numeros deseados: ");
        n = entrada.nextInt();
        int[] notas = new int[5];
        
        for (int i = 0; i <= n; i++) {
            System.out.println("Favor digite numero "+ (i+1) + ": ");
            notas[i] = entrada.nextInt();            
        }
        int resultado = promedio(notas);
        System.out.println("El promedio es: " +resultado);
    }
    
}