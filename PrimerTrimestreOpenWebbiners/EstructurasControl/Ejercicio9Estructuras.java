package EstructurasControl;
import java.util.Scanner;
public class Ejercicio9Estructuras {
    /*9. Escribe un programa en Java que compruebe si un carácter es una vocal o no.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caracter;
        System.out.println("Dame una vocal");
        caracter = sc.nextLine();
        sc.close();

        switch (caracter) {
            case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U", "á", "é", "í", "ó", "ú":
                System.out.println(caracter+ " es una vocal!");
                break;
        
            default:
                System.out.println(caracter +" no es una vocal");
                break;
        }
    }
}
