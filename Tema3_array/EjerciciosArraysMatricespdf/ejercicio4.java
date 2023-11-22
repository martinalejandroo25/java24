package Tema3_array.EjerciciosArraysMatricespdf;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura;
        double conta=0;
        double media;
        
        try {
            System.out.println("Cuantas personas son?");
            double personas[] = new double[(int) Double.parseDouble(sc.nextLine())];
            for (int i = 0; i < personas.length; i++) {
                System.out.println("Dime la altura de la persona "+i);
                altura = Double.parseDouble(sc.nextLine()); 
                personas[i] = altura;
                if (personas[i] < 0) {
                    System.out.println("Número no válido");
                    break;
                }
            }   
            
            
            for (int i = 0; i < personas.length; i++) {
                conta+=personas[i];
            }
            media=conta/personas.length;
            for ( int i = 0; i < personas.length; i++) {
                if (personas[i]>media) {
                    System.out.println("La persona "+i+" tiene una altura mayor a la media");
                    
                } else
                System.out.println("La persona "+i+ " tiene una altura menor a la media");
            }
            
            System.out.println(Arrays.toString(personas));
            System.out.println("La altura media es de "+media);
            
        } catch (NegativeArraySizeException e) {
            System.out.println("No puede haber -X personas, por favor, introduce un número positivo entero");
        } catch (InputMismatchException k) {
            System.out.println("Números enteros sin decimales porfavor");
        } catch (NumberFormatException s) {
            System.out.println("Por favor, Introduce números únicamente, enteros y positivos");
        }
            
    }
}
