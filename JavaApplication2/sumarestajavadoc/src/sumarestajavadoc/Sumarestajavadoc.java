/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumarestajavadoc;

/**
 *
 * @author saidc
 */
public class Sumarestajavadoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
def sumar(a, b):
    return a + b

def restar(a, b):
    return a - b


num1 = float(input("Ingrese el primer número: "))
num2 = float(input("Ingrese el segundo número: "))


resultado_suma = sumar(num1, num2)
resultado_resta = restar(num1, num2)


print(f"La suma de {num1} y {num2} es: {resultado_suma}")
print(f"La resta de {num1} y {num2} es: {resultado_resta}")