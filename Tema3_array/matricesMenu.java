package Tema3_array;

import java.util.Scanner;

public class matricesMenu {
    public static void main(String[] args) {
        //MENÚ
        int opcion;
        Scanner sc = new Scanner(System.in);

        try {
            do {
                System.out.println("1. Suma una fila que se pedirá al usuario");
                System.out.println("2. Suma una columna que se pedirá al usuario");
                System.out.println("3. Suma la diagonal principal");
                System.out.println("4. Devuelve la media de todos los valores de la matriz");
                System.out.println("5. Salir");
                System.out.println("Introduce opción");
                opcion = Integer.parseInt(sc.nextLine());

                //Según la opción hacemos lo que corresponde
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce número de fila a sumar [0 - " + (tabla.length-1) + "]");
                        int fila = Integer.parseInt(sc.nextLine());
                        System.out.println("La suma es " + sumaFila(fila, tabla));

                        break;
                    case 2:
                        System.out.println("Introduce número de columna a sumar [0 - " + (tabla[0].length-1) + "]");
                        int columna = Integer.parseInt(sc.nextLine());
                        System.out.println("La suma es " + sumaColumna(columna, tabla));
                        break;
                    case 3:
                        System.out.println("3");
                        break;
                    case 4:
                        System.out.println("4");
                        break;
                    case 5:
                        System.out.println("Adiós");
                        break;
                
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            } while (opcion != 5);




        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
/**
 * Crear una matriz de 5x5 elementos int aleatorios entre 1 y 20
   Opciones de menú:
    - 1. Suma una fila que se pedirá al usuario
    - 2. Suma una columna que se pedirá al usuario
    - 3. Suma la diagonal principal
    - 4. Devuelve la media de todos los valores de la matriz
    - 5. Salir
 */
