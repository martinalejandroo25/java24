
import java.util.Scanner;
public class EjemploContador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra= "";
        int contador=0;
        

        for(int i=0; i<6; i++){
            System.out.println("Dime una palabra");
            palabra = sc.nextLine();
            System.out.println(palabra.length());

            if (palabra.length() >5) {
                contador++;
            }
        }


        System.out.println("Las palabras con más de cinco caracteres son: " + contador);

    }
}
