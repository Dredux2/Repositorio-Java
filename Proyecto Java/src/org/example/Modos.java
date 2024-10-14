package org.example;
import java.util.Scanner;
public class Excepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        int dividendo = 0;
        int num_entero = 0;
        int division = 0;

        if (sc.hasNextInt()){
            System.out.print("Introduce el dividendo: ");
            dividendo = sc.nextInt();
        } else {
            System.out.print("El formato no es numerico");
        }

        try {
            System.out.print("Introduce el divisior: ");
            num_entero = Integer.parseInt(num1);
            division = dividendo  / num_entero;
        } catch (NumberFormatException e1){
            System.out.print("No has escrito un numero. " + e1.getMessage());
        } catch (ArithmeticException e2){
            System.out.print("El denomidador es 0, division erronea: " + e2.getMessage());
        } finally {
            System.out.print("El resultado es: " + division);
        }
    }
}
