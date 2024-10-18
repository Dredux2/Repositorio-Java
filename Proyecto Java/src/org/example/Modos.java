package org.example;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Modos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa para calcular el año de nacimiento y la edad");
        System.out.println("1º Año de nacimiento");
        System.out.println("2º Edad");
        System.out.print("Seleciona una opcion: ");
        String opcion = sc.next();

        LocalDateTime hoy = LocalDateTime.now();
        int yearActual = hoy.getYear();
        switch (opcion) {
            case "1":
                System.out.print("Introduce tu año de nacimiento: ");
                String yearNacimiento = sc.next();
                int integerNacimiento = Integer.parseInt(yearNacimiento);

                if (integerNacimiento < 1900 && integerNacimiento > yearActual) {
                    System.out.println("ERROR: Fecha de nacimiento fuera de rango (Min 1900)");
                } else if (integerNacimiento >= 1900 && integerNacimiento <= 1927) {
                    System.out.println("Eres de la Generación sin bautizar");
                } else if (integerNacimiento >= 1928 && integerNacimiento <= 1944) {
                    System.out.println("Eres de la Generación Silent");
                } else if (integerNacimiento >= 1945 && integerNacimiento <= 1964) {
                    System.out.println("Eres de la Generación Baby Boomers");
                } else if (integerNacimiento >= 1965 && integerNacimiento <= 1981) {
                    System.out.println("Eres de la Generación X");
                } else if (integerNacimiento >= 1982 && integerNacimiento <= 1994) {
                    System.out.println("Eres de la Generación Millenial");
                } else if (integerNacimiento >= 1995 && integerNacimiento <= yearActual) {
                    System.out.println("Eres de la Generación Centennials");
                } else {
                    System.out.println("No eres de ninguna generación");
                }

            case "2":
                System.out.print("Introduce tu edad: ");
                int edad = sc.nextInt();

                if (edad >= 0){
                    int resultado = yearActual - edad;
                }

        }
    }
}