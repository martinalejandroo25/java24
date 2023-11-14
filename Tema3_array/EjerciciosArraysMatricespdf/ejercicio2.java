package Tema3_array.EjerciciosArraysMatricespdf;
import java.util.Arrays;
public class ejercicio2 {
    /*Crea una función que reciba como parámetro un array de 10 enteros, 
    debe devolver el mismo array donde se
    hayan intercambiado el primer elemento y el último elemento */
    public static void main(String[] args) {
        int num[]= {4,8,2,3,5,21,54,99,7};
        int temp= num[0];
        num[0]= num [num.length-1];
        num[num.length-1]=temp;
        System.out.println(Arrays.toString(num));
    }
}
