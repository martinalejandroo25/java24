package VariablesOperadores;
import java.util.Scanner;
public class Ejercicio6variables {
    /*Escribe un programa que determine si un número es par o impar usando el operador ternario */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String parImpar;
        System.out.println("Este número es par o impar?");
        num = sc.nextInt();
        parImpar = (num%2 == 0) ? "Par" : "Impar";
        System.out.println("Es "+parImpar);
        sc.close();
    }
}
