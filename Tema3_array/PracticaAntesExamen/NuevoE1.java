package PracticaAntesExamen;
import java.util.Scanner;
public class NuevoE1 {
    /*Realiza una función que reciba como parámetro una cadena y una vocal 
(a,e,i,o,u) y devuelva como resultado la cadena inicial sustituyendo todas las vocales por la 
vocal introducida. Debe funcionar con mayúsculas y minúsculas, es decir, si la vocal a 
sustituir es la a, y encuentra una E, el resultado de la sustitución será una A.  

Ejemplo:   “Mi amiga Ana es prima de Eva y de Irene”, le pasamos la ‘e’ y el resultado sería: 
        “Me emege Ene es preme de Eve y de Erene”. 

No se pueden usar los métodos replace ni replaceAll de String ni StringBuffer. 
Para sacar más nota se recomienda usar una estructura mutable (StringBuffer o 
StringBuilder) para hacer la sustitución. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una frase");
        StringBuffer cadena = new StringBuffer(sc.nextLine());
        System.out.println("Dime que vocal quieres cambiar");
        char vocal = sc.nextLine().charAt(0);

        sc.close();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
                if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                    cadena.setCharAt(i, vocal);
                }
            }
            System.out.println(cadena);
    }
}
