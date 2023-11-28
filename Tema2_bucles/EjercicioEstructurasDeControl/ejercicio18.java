import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio18 {
    public static boolean esPrimo(int numero) {
        boolean esPrimo=true;

        for(int i=2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        return esPrimo;
    }
    public static void main(String[] args) {
        try {
            try (Scanner sc = new Scanner(System.in)) {
                int num;
                System.out.println("¿Es primo?, dime el número y te lo diré");
                num= Integer.parseInt(sc.nextLine());
                if (esPrimo(num)==true)
                    System.out.println("Tu número es primo");
                else
                    System.out.println("Tu número no es primo");
            }
        } 
        catch (NumberFormatException e) {
            System.out.println("Zopenco, ¿te pido un número y me das otra cosa? que feo, solo números enteros");
        }catch (InputMismatchException a) {
            System.out.println("Hey, parece que introdujiste un número decimal, intentalo con un entero ;)");
        }
    }
}