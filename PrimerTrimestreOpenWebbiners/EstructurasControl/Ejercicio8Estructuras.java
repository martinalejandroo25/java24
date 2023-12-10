package EstructurasControl;
import java.util.Scanner;

public class Ejercicio8Estructuras {
    /*Escribe un programa que acepte por teclado una cadena y muestre la cadena inversa. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        String inversa= "";
        System.out.println("Dame una palabra");
        cadena = sc.nextLine();
        sc.close();

        for (int i = cadena.length()-1; i >= 0; i--) {
            inversa+= cadena.charAt(i);
        }
        System.out.println(inversa);
    }
}
