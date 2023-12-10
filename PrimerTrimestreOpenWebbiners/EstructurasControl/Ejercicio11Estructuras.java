package EstructurasControl;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio11Estructuras {
    /*11. Escribe un programa en Java que encuentre cuál es el mayor de 3 números usando sentencias if-else.*/
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Dame el primer número a comparar");
        num1 = sc.nextInt();
        System.out.println("Dame el segundo número a comparar");
        num2 = sc.nextInt();
        System.out.println("Dame el tercer número a comparar");
        num3 = sc.nextInt();
        sc.close();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor número de los tres es "+num1);
            
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor número de los tres es "+num2);
            
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("El mayor número de los tres es "+num3);
        }
        } catch (InputMismatchException e) {
            System.out.println("Solo número enteros");
        }
    }
}
