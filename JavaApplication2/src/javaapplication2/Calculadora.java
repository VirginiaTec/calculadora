/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author saidc
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2;
            char operacion;
            System.out.println("Calculadora Básica");
            System.out.print("Introduce el primer número: ");
            num1 = scanner.nextDouble();
            System.out.print("Introduce el segundo número: ");
            num2 = scanner.nextDouble();
            System.out.print("Elige la operación: ");
            operacion = scanner.next().charAt(0);
            double resultado = 0;
            boolean operacionValida = true;
            switch (operacion) {case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                operacionValida = false;
            }   if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }
        }
    }
}