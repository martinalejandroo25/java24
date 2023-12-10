package VariablesOperadores;
import java.util.Scanner;
public class Ejercicio9variables {
    /*9. Escribe un programa en Java que intercambie el valor de dos variables.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int inverso;
        int digito;
        System.out.println("Dime numero a invertir");
        numero = sc.nextInt();
        inverso = 0;
        while (numero > 0)  {
            digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero = numero / 10;
        }
        System.out.println(inverso);
        sc.close();
    }
}
