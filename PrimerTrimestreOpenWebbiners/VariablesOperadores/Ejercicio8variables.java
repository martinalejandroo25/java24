package VariablesOperadores;
import java.util.Scanner;
public class Ejercicio8variables {
    /*8. Escribe un programa en Java que calcule la media de 3 números que se hayan leído desde el teclado y la muestre por consola.
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Primer número");
        num1 = sc.nextInt();
        System.out.println("Segundo número");
        num2 = sc.nextInt();
        System.out.println("Tercer número");
        num3 = sc.nextInt();
        System.out.println("La media entre estos números es "+((num1+num2+num3)/3));
        sc.close();
    }
}
