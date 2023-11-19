package Tema3_array.EjerciciosIntroduccionALaProgramacion;
import java.util.Scanner;
import java.util.Arrays;
public class ejercicio11Array {
    /*Crea un vector de 5 elementos de cadenas de caracteres,
     *  inicializa el vector con datos leídos por teclado.
     * Copia los elementos del vector en otro, pero en orden inverso
     * y muéstralo por la pantalla
     */

     public static void main(String[] args) {
        System.out.println("Dame 5 palabras");
        String palabra[]=new String[5];
        String inverso[]=new String[palabra.length];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < palabra.length; i++) {
            palabra[i]= sc.nextLine();
        }
        for (int i = 0; i < inverso.length; i++) {
            String temp=palabra[i];
            palabra[i]=palabra[palabra.length-1];

        }
        System.out.println(Arrays.toString(palabra));
        System.out.println(Arrays.toString(inverso));
    }
}
