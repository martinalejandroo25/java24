package Tema3_array.EjerciciosArraysMatricespdf;
import java.util.Arrays;
public class ejercicio1 {
    
    /*Programa Java que guarda en un array 20 números enteros que se generen aleatoriamente entre -100 y 100. A
    continuación, se recorre el array y calcula cuántos números son positivos y cuántos negativos */

    public static int generarNumero(int min, int max) throws Exception {
        //genera numeros aleatorios dando el minimo y maximo 
        //Si min > max, lanzamos Exception "min debe ser menor que max"
        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }

        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }


    public static void main(String[] args) throws Exception {
        int num[]= new int[20];

        for (int i = 0; i < num.length; i++) {
            
            num[i]=generarNumero(-100, 100);
        }

        System.out.println(Arrays.toString(num));
        
        for (int i = 0; i < num.length; i++) {
            if (num[i]<0) {
                System.out.println(num[i]+" Es negativo");
            } else
            System.out.println(num[i]+" Es positivo");
        }
        
    }
}
