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
        int posicion=Integer.parseInt(sc.nextLine());
        int temp=0;
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(tabla));
        for (int i = posicion; i < tabla.length; i++) {
            temp = tabla[i];
            
        }
    }
}
