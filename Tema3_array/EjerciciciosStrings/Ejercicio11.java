package EjerciciciosStrings;

import java.util.Scanner;

public class Ejercicio11 {
    /*Elimina los espacios (intermedios también) de una cadena de texto */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una frase");
        String cadena = sc.nextLine();

        String cadenaSin = cadena.trim();
        String cadSinEspacios= "";
        cadSinEspacios = cadenaSin.replace(" ", "");
        
        System.out.println(cadSinEspacios);
    }
}
