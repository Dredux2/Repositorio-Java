package org.example;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un operando: ");
        int operando = sc.nextInt();
        double resultado;
        double resultado2;

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
    }
}
