package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un operando: ");
            int operando = sc.nextInt();
            // Variables double para permitir la raiz cuadrada.
            double resultado;
            double resultado2;

            // Interfaz
            System.out.println("Seleccione uno de los siguientes operadores: ");
            System.out.println("----------");
            System.out.println("+");
            System.out.println("-");
            System.out.println("*");
            System.out.println("/");
            System.out.println("R");
            System.out.println("----------");
            String operador = sc.next();

            System.out.print("Introduce un segundo operando: ");
            int operando2 = sc.nextInt();

            switch (operador){
                case "+":
                    resultado = operando + operando2;
                    System.out.println("El resultado de sumar " + operando + " + " + operando2 + " es: " + resultado);
                    break;
                case "-":
                    resultado = operando - operando2;
                    System.out.println("El resultado de restar " + operando + " - " + operando2 + " es: " + resultado);
                    break;
                case "*":
                    resultado = operando * operando2;
                    System.out.println("El resultado de multiplicar " + operando + " * " + operando2 + " es: " + resultado);
                    break;
                case "/":
                    resultado = operando / operando2;
                    System.out.println("El resultado de sumar " + operando + " / " + operando2 + " es: " + resultado);
                    break;
                case "R","r":
                    resultado = Math.sqrt(operando);
                    resultado2 = Math.sqrt(operando2);
                    // Con "%.2f" limito la cantidad de decimales en el resultado a 2.
                    // https://es.stackoverflow.com/questions/29408/como-limitar-la-cantidad-de-decimales-de-un-double
                    System.out.printf("El resultado de la raíz del primer número es: %.2f", resultado);
                    System.out.println();
                    System.out.printf("El resultado de la raíz del segundo número es: %.2f", resultado2);
                    break;
            }
            // Control de Excepciones
        } catch (ArithmeticException e1){
            System.out.println("ERROR: No se puede dividir por 0. || " + e1.getMessage());
        } catch (InputMismatchException e2){
            System.out.println("ERROR: Se debe introducir un numero. || " + e2.getMessage());
        }
    }
}
