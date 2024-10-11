package org.example;
import java.util.Scanner;
public class numeroSuerte {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (dd/mm/yyyy): ");
        String birth = sc.nextLine();

        try {
            String[] partes = birth.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int year = Integer.parseInt(partes[2]);

            if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (year >= 1 && year <= 9999)){
                int suma = dia+mes+year;
                int num1 = suma / 1000;
                int num2 = (suma / 100) % 10;
                int num3 = (suma / 10) % 10;
                int num4 = suma % 10;

                int suerte = num1+num2+num3+num4;
                System.out.println("Tu numero de la suerte es: " + suerte);
            } else {
                System.out.println("ERROR: Debe ingresar una fecha valida (dd/mm/yyyy)");
            }
        } catch (ArrayIndexOutOfBoundsException errorCadena){
            System.out.println("ERROR: Debe ingresar una fecha valida (dd/mm/yyyy)");
        } catch (NumberFormatException errorLetra){
            System.out.println("ERROR: Debe ingresar un numero");
        }
    }
}