
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Crear una matriz de 5x5 elementos int aleatorios entre 1 y 20
    Opciones de menú:
    - 1. Suma una fila que se pedirá al usuario
    - 2. Suma una columna que se pedirá al usuario
    - 3. Suma la diagonal principal
    - 4. Devuelve la media de todos los valores de la matriz
    - 5. Salir
 */


public class matricesMenu {


    public static int sumaFila(int fila[][]) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        int suma=0;
        for (int i = 0; i < fila.length; i++) {
            for (int j = 0; j < fila.length; j++) {
                suma = fila[i][0]+fila[0+i][0];
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        
        System.out.println("opciones");
        System.out.println("1.Suma una fila");
        System.out.println("2.Suma una columna");
        System.out.println("3.Suma la diagonal principal");
        System.out.println("Devuelve la media de todos los valores de la matriz");
        System.out.println("5.Salir");
        
        int matriz[][]= new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            
        }
        try {
        try (Scanner sc = new Scanner(System.in)) {
            int opciones = Integer.parseInt(sc.nextLine());
            do {
                switch(opciones) {
                    case 1:
                        System.out.println("¿Que fila quieres sumar? elige del 1 al 5");
                        break;
                    case 2:
                        System.out.println("¿Que fila quieres sumar? elige del 1 al 5");
                        break;
                    case 3:
                        System.out.println("El total de la suma de diagonal principal es "/*+sumaDiagonal*/ );
                        break;
                    case 4:
                        System.out.println("La media de todos los valores de la tabla es de "/*+MediaValores)*/);
                        break;    
                    case 5:
                        System.out.println("adioos :)");
                        break;
                    default:
                        System.out.println("número incorrecto, elija una opción válida (1, 2, 3, 4, 5)");
                        break;
                    
                }  
            } while (opciones!=5);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
        } catch (InputMismatchException e) {
        System.out.println("Error" + e.getMessage()+ e.getCause()+"Por favor, solo números enteros, del 1 al 5");
        
        }
        
    }
}
