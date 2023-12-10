package EstructurasControl;
import java.util.Scanner;
public class Ejercicio12Estructuras {
    /*12. Escribe un programa en Java que pinte una pirámide con asteriscos. 
    El número de pisos debe introducido a través del teclado.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Dame un número y te haré una pirámide de asteriscos");
        num = sc.nextInt();
        sc.close();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
