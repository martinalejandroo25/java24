package VariablesOperadores;
import java.util.Scanner;
public class Ejercicio5variables {
    /*Escribir un programa que, 
    dada una cantidad de euros, 
    nos indique cuál es su valor en dólares americanos. 
    Además de la variable para la cantidad de euros
    , se debe declarar otra para el cambio (el valor de un dólar en euros)
    y para el resultado final. 
    Muestra el resultado por consola. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double euros, dolar;
        System.out.println("Dinero cambio de euros a dolares:");
        euros = sc.nextDouble();
        dolar = euros * 1.08;
        System.out.println(euros+" euros  pasados a dolares equivale a "+dolar);
        sc.close();
    }
}
