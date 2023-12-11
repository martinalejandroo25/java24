package EjerciciciosStrings;
import java.util.Scanner;
public class Ejercicio1S {
    /*Crea  un  programa  en  Java  que  solicite  al  usuario  la  introducción  
    de  una  cadena  de  caracteres  y 
    devuelva esta cadena invertida. 
    Version Strings */
    public static String invertirCadena(String cadena) {
        String inversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            inversa += cadena.charAt(i);
        }
        return inversa;
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner (System.in);
            System.out.println("Dame una frase o palabra a invertir");
            String cadena = sc.nextLine();
            sc.close();
            System.out.println(invertirCadena(cadena));
        } catch (Exception e) {
        System.out.println("error, vuelva a intentarlo" + e.getMessage() + " " + e.getLocalizedMessage() + " "+e.getCause());
        }
        
    }
}
