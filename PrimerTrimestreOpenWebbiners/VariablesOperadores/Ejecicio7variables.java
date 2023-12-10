package VariablesOperadores;
import java.util.Scanner;
public class Ejecicio7variables {
    /*Escribe un programa que lea dos números enteros por teclado, 
    y realice las operaciones básicas de una calculadora con ellos: 
    suma, resta, multiplicación, división y resto. 
    Debe mostrar todos los resultados por consola. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String operador;
        System.out.println("Que operación quieres hacer?(Suma(+) Resta(-) Multiplicar(*) Dividir(/) )");
        operador = sc.nextLine();
        System.out.println("Primer número a calcular");
        num1 = sc.nextInt();
        System.out.println("Segundo número a calcular");
        num2 = sc.nextInt();
        switch (operador) {
            case "+":
            System.out.println(num1+num2);
            break;
            case "-":
            System.out.println(num1-num2);
            break;
            case "*":
            System.out.println(num1*num2);
            break;
            case "/":
            System.out.println(num1/num2);
            break;
        
            default:
            System.out.println("Introducción Incorrecta, intentalo de nuevo");
                break;
        }
        sc.close();
    }
}
