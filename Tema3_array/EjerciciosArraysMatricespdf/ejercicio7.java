package Tema3_array.EjerciciosArraysMatricespdf;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class ejercicio7 {
    //Genera aleatoriamente una tabla de 10 elementos numéricos enteros(listo), guardalos en una array(listo). 
    //Luego pide por teclado una posición (entre 0 y 9). 
    //Eliminar el elemento situado en la posición dada sin dejar huecos.

public static int generarNumero(int min, int max) throws Exception {
    //genera numeros aleatorios dando el minimo y maximo 
    //Si min > max, lanzamos Exception "min debe ser menor que max"
    if (min > max) {
        throw new Exception("El valor mínimo no puede ser mayor que el máximo");
    }

    return  (int) ((Math.random() * (max - min + 1) + min)) ;
}
    public static int[] eliminarElemento(int array[], int posicion){
        if(posicion<0 || posicion>=array.length) {
            System.out.println("La posición no es válida, pruebe de nuevo en el rango predefinido");
            return array; //Si la posición no fuera válida, devolver el array
            
        }
        //Crear un nuevo array con menor tamaño
        int[] arraymod = new int[array.length-1];
        //copiar los elementos antes de la posicion especificada
        for (int i = 0; i < posicion; i++) {
            arraymod[i] = array[i];
        }
        for (int i = posicion+1; i < array.length; i++) {
            arraymod[i-1] = array[i];
        }
        return arraymod;
    }
    public static void main(String[] args) throws Exception {
        try { Scanner sc = new Scanner(System.in);
            int tabla[] = new int [10];
            int posicion;
            for (int i = 0; i < tabla.length; i++) {
                tabla[i] = generarNumero(1, 100);
            }        
            System.out.println(Arrays.toString(tabla));
    
        System.out.println("Elige la posición que deseas eliminar, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9");
        posicion = Integer.parseInt(sc.nextLine());
        System.out.println("Eliminado con éxito");
        System.out.println(Arrays.toString(eliminarElemento(tabla, posicion)));
    
        } catch (NumberFormatException e) {
            System.out.println("Por favor, inserta unicamente números y en el rango proporcionado (0 al 9)");
        }  
    
    }

}
