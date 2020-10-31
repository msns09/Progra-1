/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

public class ProyectoProgra {
    
    public static void main(String[] args){
        
        //boolean exitLoop = false;
       // while (!exitLoop){
            
           //utilities
           Scanner input = new Scanner(System.in);
           Scanner reader = new Scanner(System.in);
           
           //variables
           double number1;
           double number2;
           double result;
           char operator;
           
           //main code
           System.out.println("Enter numbers: ");
           number1 = reader.nextDouble();
           number2 = reader.nextDouble();
           
           System.out.print("Enter operator +, -, *, /: ");
           operator = reader.next().charAt(0);
           
           switch(operator){
                case '+':
                    result = number1 + number2;
                    break;
                   
                case '-':
                    result = number1 - number2;
                    break;
                
                case '*':
                    result = number1 * number2;
                    break;
                    
                case '/':
                    result = number1 / number2;
                    break;
                    
                default:
                    System.out.printf("No valid operator chosen...");
                    return;
           }
           
           System.out.printf("%.1f %c %.1f = %.1f %n", number1, operator, number2, result);
        }
    //}
    
}    

    
