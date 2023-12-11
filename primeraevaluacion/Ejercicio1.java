package java24.primeraevaluacion;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio1 {
    /*Nos piden crear una matriz 20×20 de números enteros que inicialmente 
rellenamos de valores aleatorios (1-100), nos piden hacer un menú con estas opciones: 

1. Intercambiar fila. Te pedirá dos números de fila e intercambiará los valores de la 
primera por los valores de la segunda.                                                  
2. Suma de una columna que se pedirá al usuario (controlar que elija una correcta) 
3. Sumar la diagonal principal y la diagonal inversa, y mostrar las dos sumas  
4. Pintar las coordenadas i,j donde se encuentra el mayor elemento de la matriz. 
5. Pinta la matriz traspuesta 
6. Muestra la matriz con las filas ordenadas de mayor a menor 
7. Salir*/

/////////// imprime la tabla a traspuesta, las filas son las nuevas columnas y viceversa
public static int [][]traspuesta(int matriz[][]){
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            System.out.println(matriz[i][j]+" ");
        } System.out.println();
    } return matriz;
}
/////////// Hace una suma entre las diagonales principal e inversa
public static int sumaDiagonales(int matriz[][]){
    int sumapri = 0;
    int sumainv = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            sumapri += matriz[i][j];
            sumainv = matriz[i][matriz.length-i-1];
            
        }
    } return sumapri + sumainv;
}
///////////busca 
    /*public static int[] buscarElemento(int matriz[][], int elemento) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == elemento) {
                    return new int[]{i, j};
                }
            }
        }
        return null; // Retorna nulo si el elemento no se encuentra en la matriz
    }*/
    public static int[] pintarMayor(int matriz[][]){
        int mayor = matriz [0][0];
        int pos[] = {0, 0};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        } return pos;
    }
            //devuelve la suma de d¡2 columnas del array
    public static int sumaColumna(int matriz[][], int posicion){
        int suma = 0;
        if (posicion >= 0 && posicion < 20) {
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][posicion];
            }
        } else {
            System.out.println("Fallo al insertar la posicion de la columna");
        } return suma;
        }
                //intercambia 2 filas del array dadas
    public static int[][] intercambiarFila(int matriz[][], int pos1, int pos2) {
        int copia [][]= Arrays.copyOf(matriz, matriz.length);
        if (pos1 >= 0 && pos1 < 20 && pos2 >= 0 && pos2 < 20) {
            int[] temp = copia[pos2];
            copia[pos2] = copia[pos1];
            copia[pos1] = temp;
        }
        return copia;
    }   //genera un numero aleatorio dado un min y max
    public static int generarNumeroAleatorio(int min, int max) throws Exception {
        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[20][20];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = generarNumeroAleatorio(1, 100);
            }
        }
        System.out.println(Arrays.deepToString(matriz)); //imprimir tabla original

        System.out.println("~~~~~~Menú~~~~~~"); //imprimir las opciones(el menú)
        System.out.println("""
            1. Intercambiar fila. Te pedirá dos números de fila e intercambiará los valores de la 
            primera por los valores de la segunda.
            
            2. Suma de una columna que se pedirá al usuario (controlar que elija una correcta)

            3. Sumar la diagonal principal y la diagonal inversa, y mostrar las dos sumas  

            4. Pintar las coordenadas i,j donde se encuentra el mayor elemento de la matriz. 

            5. Pinta la matriz traspuesta 

            6. Muestra la matriz con las filas ordenadas de mayor a menor 
            
            7. Salir
            """);
            int menu = Integer.parseInt(sc.nextLine());
        switch (menu) { //elección de las opciones del menú
            case 1:
                System.out.println("Dame la primera fila a intercambiar");
                int Pos1 = Integer.parseInt(sc.nextLine());
                System.out.println("Dame la segunda fila a intercambiar");
                int Pos2 = Integer.parseInt(sc.nextLine());
                int cambio[][] = intercambiarFila(matriz, Pos1, Pos2);
                System.out.println(Arrays.deepToString(cambio));
                break;
            case 2:
                System.out.println("Dame la posicion de la columna");
                int posicion = Integer.parseInt(sc.nextLine());
                int sumatorio =sumaColumna(matriz, posicion);
                System.out.println("suma de las columnas es "+sumatorio);
                break;
            case 3:
                int sumatorio2 = sumaDiagonales(matriz);
                System.out.println("La suma de las diagonales es: "+ sumatorio2);
                break;
            case 4:
                int []indiceMayor =pintarMayor(matriz);
                System.out.println(Arrays.toString(indiceMayor));
                break;
            case 5:
                System.out.println("Traspuesta: ");
                traspuesta(matriz);
                break;
            case 7:
            System.out.println("Gracias por su visita, Adiós :)");
                break;
            
        
            default:
            System.out.println("Inserción erronea... elija una de las 7  opciones válidas");
                break;
        }
        
        sc.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
