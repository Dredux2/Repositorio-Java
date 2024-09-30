import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Como te llamas?");
        String nombre = sc.next();

        int edad = -1;
        while (edad < 0) {
            System.out.println("Introduce tu edad:");
            if (sc.hasNextInt()) { // Verifica si el input es un entero.
                edad = sc.nextInt();
                if (edad >= 18) {
                    System.out.println("Enhorabuena " + nombre + ", ahora puedes votar.");
                } else if (edad >= 0) {
                    int menor = 18 - edad;
                    System.out.println("Lo siento " + nombre + ", no puedes votar.");
                    System.out.println("Te faltan " + menor + " años para ser mayor de edad.");
                }
            } else {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // Evita el bucle infinito.
            }
        }
    }
}