package EjerciciciosStrings;
import java.util.Scanner;
public class Ejercicio5 {
    /*Diseña un programa en Java que solicite al usuario una cadena de caracteres y muestre por pantalla un 
conteo de cuántas vocales, consonantes y espacios en blanco contiene la cadena introducida */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dame una frase o palabra y e cuento vocales y consonantes");
    String cadena = sc.nextLine();
    sc.close();
    int vocales = 0, consonantes = 0, espacios = 0;
    System.out.println("La cadena tiene una longitud de " +cadena.length()+" carácteres");
    for (int i = 0; i < cadena.length(); i++) {
        char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                vocales++;
            } else if (caracter == ' ') {
                espacios++;
            }  else
                consonantes++;
    }
    System.out.println("En total la cadena contiene: ");
    System.out.println(+vocales+" vocales");
    System.out.println(consonantes+" consonantes");
    System.out.println(espacios+" Espacios");
}
}
