package Tema3_array.EjerciciosArraysMatricespdf;
import java.util.Scanner;
import java.util.Arrays;
public class ejercicio7 {
    /*Crear un programa que lea por teclado una tabla de 5 números enteros
    y la desplace una posición hacia la derecha: 
    el primero pasa a ser el segundo, 
    el segundo pasa a ser el tercero y así sucesivamente. 
    Igual que el anterior, pero desplazando N posiciones (N es un número introducido por el usuario). */
    public static void main(String[] args) {
        int tabla[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int temp=0;
        String posicion[]={"primero", "segundo", "tercer", "cuarto", "quinto"};
        
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Dime el "+posicion[i]+" número para la tabla");
            tabla[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(tabla));
        temp = tabla[tabla.length-1];
        for (int i = 4; i > 0; i--) {
            tabla[i] = tabla [i+1];
            tabla [0] = temp;
        }
        tabla[0] = temp;
        System.out.println();Arrays.toString(tabla);
        System.out.println(Arrays.toString(tabla));
    }
}
