package org.example;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Modos {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        LocalDateTime hoy = LocalDateTime.now();
        int anyoActual = hoy.getYear();

        System.out.println("Programa para calcular el año de nacimiento y la edad");
        System.out.println("1º Año de nacimiento");
        System.out.println("2º Edad");
        System.out.println("Seleciona una opcion: ");

        String opcion = teclado.next();
        int fechaNacimiento = 1800;

        boolean error = false;
        if (opcion  .equals("1")) {
            System.out.println("Introduce un año: ");
            String anyoNacimiento = teclado.next();

            try {
                fechaNacimiento = Integer.parseInt(anyoNacimiento);
            }catch (NumberFormatException e){
                System.out.println("Has introducido un formato erroneo. no es un numero. ");
            }

            if (fechaNacimiento < 1900 || fechaNacimiento > anyoActual){
                System.out.println("El año introducido no es correcto");
                error = true;
            }

        } else if (opcion.equals("2")) {

            int edad = 0;

            System.out.println("Introduce una edad: ");

            if (teclado.hasNextInt()){

            }else {
                System.out.println("La edad introducida no tiene un formato valido");
            }

            if (edad < 0){
                System.out.println("La edad introducida no es valida. ");
                error = true;
            }else {

                int anyo_nac = anyoActual - edad;

            }

        } else {
            System.out.println("El modo introdicdo no es correcto.");
        }

        if (error == false) {

            if (fechaNacimiento >= 1900 && fechaNacimiento <= 1927) {
                System.out.println("Eres de la generacion sin bautizar.");
            } else if (fechaNacimiento >= 1928 && fechaNacimiento <= 1944) {
                System.out.println("Eres de la generacion silet.");
            } else if (fechaNacimiento >= 1945 && fechaNacimiento <= 1964) {
                System.out.println("Eres de la generacion baby boomers.");
            } else if (fechaNacimiento >= 1965 && fechaNacimiento <= 1981) {
                System.out.println("Eres de la generacion x.");
            } else if (fechaNacimiento >= 1982 && fechaNacimiento <= 1994) {
                System.out.println("Eres de la generacion mellenial.");
            } else if (fechaNacimiento >= 1995 && fechaNacimiento <= anyoActual) {
                System.out.println("Eres de la generacion centenial.");
            } else {
                System.out.println("No eres de ninguna generacion.");
            }
        }

    }
}