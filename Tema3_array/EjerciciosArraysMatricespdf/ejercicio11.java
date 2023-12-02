package Tema3_array.EjerciciosArraysMatricespdf;
import java.util.Arrays;
public class ejercicio11 {
    //Crea una tabla bidimensional de tamaño 5x5
    // y rellenarla de forma que los elementos de la diagonal principal sean 1
    //y el resto 0. Mostrarla.
    public static void main(String[] args) {
        int tabla[][] = new int [5][5];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] = 0;
            }
                    if ( tabla[0][0] == 0){
                        tabla[0][0] = 1;
                    }if ( tabla[1][1] == 0){
                        tabla[1][1] = 1;
                    }if ( tabla[2][2] == 0){
                        tabla[2][2] = 1;
                    }if ( tabla[3][3] == 0){
                        tabla[3][3] = 1;
                    }if ( tabla[4][4] == 0){
                        tabla[4][4] = 1;
                    }
        }  System.out.println(Arrays.toString(tabla));
    }
}
