/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

public class Calculadora {

    public static int promedio() {
        int resultado = 0;

        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor digite los numeros deseados: ");
        n = entrada.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Favor digite numero " + i + ": ");
            int num = entrada.nextInt();
            suma = suma + num;
        }
        resultado = suma / n;
        return resultado;
    }

    public static void main(String[] args) {

        int resultado = promedio();
        System.out.println("El promedio es: " + resultado);
    }
}
