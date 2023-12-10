package VariablesOperadores;
import java.util.Scanner;
public class Ejercicio4variables {
    public static void main(String[] args) {
        /*Escribir un programa que calcule el perímetro y el área de un círculo
        y la muestre por consola. 
         El `radio` del mismo lo puedes proporcionar como un valor inicial de la variable correspondiente. */
        /*area = pi * radio x radio
         * perimetro = 2 x pi x radio
         */
        int radio; 
        double area, perimetro;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el radio a calcular");
        radio = sc.nextInt();
        area = Math.PI * Math.pow(radio,2);
        perimetro = 2 * Math.PI * radio;
        
        System.out.println("La circunferencia de radio "+radio+" Da como resultado el área "+area+" y de perímetro "+perimetro);
        sc.close();
    }
}
