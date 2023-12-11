package EjerciciciosStrings;
import java.util.Scanner;
public class Ejercicio4 {
    /*Crea un programa en Java que solicite al usuario dos cadenas de caracteres 
    y que devuelva la primera cadena,  
    pero transformando  en  mayúsculas  la  parte  que  coincide  
    con  la  segunda  cadena  introducida. 
    Por ejemplo, si se introducen las cadenas “Esta es mi amiga Ana” y “amiga” devolverá “Esta es mi 
    AMIGA Ana” */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una frase;");
        String cadena = sc.nextLine();
        System.out.println("Dime la palabra a convertir a mayúsculas");
        String convertir = sc.nextLine();
        sc.close();

        if (cadena.contains(convertir) == true) {
            int inicio = cadena.indexOf(convertir);
            int fin = inicio + convertir.length();

            String cadenaConv = cadena.substring(0,inicio) + cadena.substring(inicio, fin).toUpperCase() + cadena.substring(fin, cadena.length());
            System.out.println(cadenaConv);
        }else
            System.out.println("Cadena no encontrada...");


    }
}
