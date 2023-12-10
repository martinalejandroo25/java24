package EstructurasControl;
import java.util.Scanner;
public class Ejercicio10Estructuras {
    /*10. Escribe un programa en Java que comprueba si un año es bisiesto o no.
    Recuerda que los años bisiestos son aquellos que son divisibles entre 4 
    pero que no son divisibles entre 100, 
    o que son divisibles entre 400.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio;
        System.out.println("Dame un año para comprobar si es o no bisiesto");
        anio = sc.nextInt();
        sc.close();
        if (anio%4 == 0 && anio%100 != 0) {
            System.out.println("Año bisiesto");
        } else
            System.out.println("Año no bisiesto");
    }
}
