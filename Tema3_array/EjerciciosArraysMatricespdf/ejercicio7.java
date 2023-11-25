package Tema3_array.EjerciciosArraysMatricespdf;
import java.util.Scanner;
import java.util.Arrays;
public class ejercicio7 {
    //Genera aleatoriamente una tabla de 10 elementos numéricos enteros(listo), guardalos en una array(listo). 
    //Luego pide por teclado una posición (entre 0 y 9). 
    //Eliminar el elemento situado en la posición dada sin dejar huecos.

public static int generarNumero(int min, int max) throws Exception {
    //genera numeros aleatorios dando el minimo y maximo 
    //Si min > max, lanzamos Exception "min debe ser menor que max"
    if (min > max) {
        throw new Exception("El valor mínimo no puede ser mayor que el máximo");
    }

    return  (int) ((Math.random() * (max - min + 1) + min)) ;
}
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
        int tabla[] = new int [10];
    for (int i = 0; i < tabla.length; i++) {
        tabla[i] = generarNumero(1, 100);
    }        
    System.out.println(Arrays.toString(tabla));
    
    System.out.println("Elige la posición que deseas eliminar, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9");
    
    int posicion = Integer.parseInt(sc.nextLine());
        switch (posicion) {
            case 0:
                tabla[0] =
                break;
        
            default:
                break;
        } 
    }

}
