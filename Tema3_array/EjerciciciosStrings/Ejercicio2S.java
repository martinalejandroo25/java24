package EjerciciciosStrings;
import java.util.Scanner;
public class Ejercicio2S {
    /*Crea un programa que reciba una cadena de caracteres 
    y la devuelva invertida con efecto espejo, 
    este es, se concatena a la palabra original su inversa, 
    compartiendo la última letra, que hará de espejo, 
    por lo  que  la  palabra  obtenida  se  lee  igual  hacia  adelante  que  hacia  atrás.  
    Por  ejemplo,  al  introducir  “teclado” devolverá “tecladodalcet” 
    y al introducir “hola” devolverá “holaloh”. Version Strings */
    public static String invertirCadena(String cadena) {
        String inversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            inversa += cadena.charAt(i);
        }
        return inversa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String cadena;
        String temp;
        System.out.println("Dame una palabra o frase a hacer espejo");
        cadena = sc.nextLine();
        sc.close();
        temp = cadena;
        System.out.println(cadena.substring(0, cadena.length()-1)+invertirCadena(temp));

    }
}
