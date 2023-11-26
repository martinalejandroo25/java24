package Tema3_array.EjerciciosArraysMatricespdf;

public class ejercicio8 {
    /*Genera  aleatoriamente una tabla de 10 elementos numéricos enteros,
    guardalos en una array.
    Luego pide por teclado una posición (entre 0 y 9).
    Eliminar  el  elemento situado en la posición dada sin dejar huecos. */
    public static int generarNumero(int min, int max) throws Exception {
        //genera numeros aleatorios dando el minimo y maximo 
        //Si min > max, lanzamos Exception "min debe ser menor que max"
        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }

        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }
    public static void main(String[] args) throws Exception {
        int tabla[] = new int[10];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = generarNumero(1, 100);
        }
        
    }
}
