package Tema3_array.EjerciciosArraysMatricespdf;

import java.util.Arrays;

public class ejercicio10 {
    /*Realiza una función que devuelva un array con una combinación de la Lotería Primitiva (6 números entre 1 y 49).
    La particularidad es que los números no deben estar repetidos */
    public static int generarNumero(int min, int max) throws Exception {
        //genera numeros aleatorios dando el minimo y maximo 
        //Si min > max, lanzamos Exception "min debe ser menor que max"
        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }

        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    /*Verifica si el número ya está presente en las posiciones anteriores del array*/
    public static boolean contieneRepetido (int[] array, int indice, int numero) {
        for (int i = 0; i < indice; i++) {
            if(array[i] == numero) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        int numLot[] = new int[6];
        for (int i = 0; i < numLot.length; i++) {
            numLot[i] = generarNumero(1, 49);
        }
        for (int i = 0; i < numLot.length; i++) {
            do {
                numLot[i] = generarNumero(1, 49);
            } while (contieneRepetido(numLot, i,numLot[i]));
        }
        System.out.println(Arrays.toString(numLot));
    }
}
