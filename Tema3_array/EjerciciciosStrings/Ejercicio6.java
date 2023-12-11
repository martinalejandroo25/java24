package EjerciciciosStrings;
import java.util.Scanner;
public class Ejercicio6 {
    /*Crea un método que determine si una cadena es un palíndromo, o sea, se lee igual en los dos sentidos */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Es un palíndromo??");
        String cadena = sc.nextLine();
        sc.close();
        String minus = cadena.toLowerCase();

        String limpia1 = minus.trim();
        String limpia = "";

        for (int i = 0; i < limpia1.length(); i++) {
            String sub = limpia1.substring(i, i+1);
            if (!sub.isBlank()) {
                sub = switch (sub) {
                    case "á" -> "a";
                    case "é" -> "e";
                    case "í" -> "i";
                    case "ó" -> "o";
                    case "ú" -> "u";
                    default -> sub;
                };
                limpia += sub;
            }
        }

        String inversa = "";
        for (int i = limpia.length()-1; i >= 0 ; i--) {
            inversa += limpia1.charAt(i);
        }
        if (limpia.equals(inversa) == true) {
            System.out.println("Es un palíndromo!");
        } else
            System.out.println("No es un palíndromo");
    }
}
