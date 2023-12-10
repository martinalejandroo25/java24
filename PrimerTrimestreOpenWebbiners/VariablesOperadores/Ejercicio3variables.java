package VariablesOperadores;
import java.util.Scanner;
public class Ejercicio3variables {
/*Escribir un programa que calcule el área y el perímetro de un rectángulo 
y la muestre por consola. 
La `altura` y la `anchura` del mismo la puedes proporcionar como valores iniciales de las variables correspondientes. */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int area, perimetro;
        int num1, num2;
        System.out.println("Dime el primer número(Base)");
        num1 = sc.nextInt();
        System.out.println("Dime el Segundo número(Altura)");
        num2 = sc.nextInt();

        area = num1 * num2;
        perimetro = 2*(num1 * num2);

        System.out.println("El area es "+area+" y el perimetro es "+perimetro);
        sc.close();
    }
}