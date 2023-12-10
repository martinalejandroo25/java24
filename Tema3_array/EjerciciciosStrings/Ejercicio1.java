package EjerciciciosStrings;
import java.util.Scanner;
public class Ejercicio1 {
    /*Crea  un  programa  en  Java  que  solicite  al  usuario  la  introducción  
    de  una  cadena  de  caracteres  y 
    devuelva esta cadena invertida. 
    Haz dos versiones, una con String y otra con StringBuffer */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una palabra o frase a invertir");
        String cadena = sc.nextLine();
        StringBuffer sb = new StringBuffer(cadena);
        sb.reverse();
        System.out.println(sb);
    }
}
