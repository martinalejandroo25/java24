package EjerciciciosStrings;
import java.util.Scanner;
public class Ejercicio3 {
    /*Diseña  un  programa  en  Java  que  solicite  al  usuario  
    una  cadena  en  la  que  buscará  y  
    otra  que  será  la cadena buscada. 
    El programa indicará cuántas veces aparece la segunda cadena en la primera. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserte Cadena aquí");
        String cadena = sc.nextLine();
        System.out.println("Buscador de cadena:");
        String buscador = sc.nextLine();
        sc.close();
        int conta=0;
        if (cadena.contains(buscador)) {
            for (int i = 0; i <= cadena.length()-buscador.length(); i++) {
                if (cadena.substring(i, i+buscador.length()).equals(buscador)) {
                    conta++;
                }
            }
        }else
            System.out.println("sin resultados...");
        System.out.println(buscador+" aparece "+conta+" veces");
    }
}
