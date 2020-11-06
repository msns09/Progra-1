package problema8;

import java.util.Scanner;

public class Monedas {

    public static void main(String[] args) {
        
        //utilidades
        Scanner input = new Scanner(System.in);

        //variables
        int monedas[] = {1000, 500, 100, 10, 5, 1};
        int x[];
        x = new int[6];
        int i;
        int costo;
        
        //programa
        System.out.println("Ingrese un monto");
        costo = input.nextInt();

        for (i = 0; i <= 5; i++) {
            x[i] = 0;
            x[i] = costo / monedas[i];
            costo = costo - (x[i] * monedas[i]);
        }

        for (i = 0; i <= 5; i++) {
            if (x[i] != 0) {
                System.out.print(monedas[i]);
                System.out.print(" monedas ocupadas: ");
                System.out.println(x[i]);
            }
        }
    }
}
