import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce el multiplicando (3 cifras): ");
            int Original1 = sc.nextInt();

            System.out.println("Introduce el multiplicador (3 cifras): ");
            int Original2 = sc.nextInt();

            if ((Original1 > 99 && Original1 < 1000) && (Original2 > 99 && Original2 < 1000)){
                int result = Original1 * Original2;
                System.out.println("El resultado es " + result);

                // Numero1
                String string1 = Integer.toString(Original1);
                String OriginalString1 = string1.substring(0,3);
                int OriginalInt1 = Integer.parseInt(OriginalString1);

                // Numero2
                String string2 = Integer.toString(Original2);
                String OriginalString2 = string2.substring(0,3);

                //Numeros individuales de Numero 2
                String IndividualInt1 = string2.substring(0,1);
                String IndividualInt2 = string2.substring(1,2);
                String IndividualInt3 = string2.substring(2,3);
                int Int1 = Integer.parseInt(IndividualInt1);
                int Int2 = Integer.parseInt(IndividualInt2);
                int Int3 = Integer.parseInt(IndividualInt3);

                // Multiplicacion
                int Resultado1 = OriginalInt1 * Int1;
                int Resultado2 = OriginalInt1 * Int2;
                int Resultado3 = OriginalInt1 * Int3;

                System.out.println("El proceso es: ");
                System.out.println("   " + OriginalString1);
                System.out.println("x  " + OriginalString2);
                System.out.println("--------");
                System.out.println("   " + Resultado1);
                System.out.println(" " + Resultado2 + "x");
                System.out.println(Resultado3 + "xx");
                System.out.println("--------");
                System.out.println(Original1 * Original2);
            } else {
                System.out.println("ERROR: Valores fuera de rango.");
            }
        } catch (InputMismatchException error) {
            System.out.println("ERROR: Debes ingresar un numero entero.");
        }
    }
}