package EjerciciciosStrings;
import java.util.Scanner;
public class Ejercicio2SB {
    /*Crea un programa que reciba una cadena de caracteres 
    y la devuelva invertida con efecto espejo, 
    este es, se concatena a la palabra original su inversa, 
    compartiendo la última letra, que hará de espejo, 
    por lo  que  la  palabra  obtenida  se  lee  igual  hacia  adelante  que  hacia  atrás.  
    Por  ejemplo,  al  introducir  “teclado” devolverá “tecladodalcet” 
    y al introducir “hola” devolverá “holaloh”. Version StringBuffer */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una palabra y te doy un espejito");
        String palabra = sc.nextLine();
        sc.close();
        StringBuffer sb = new StringBuffer(palabra);
        StringBuffer temp = new StringBuffer(sb);
        sb.deleteCharAt(sb.length() -1);
        System.out.println(sb.toString() + temp.reverse());
    }

}
