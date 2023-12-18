import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {



    public static void colocarBarco(int x, int y, String direccion, int longitud, String letra, String tablero[][]){ 
        int dx = 0;
        int dy = 0;
        switch (direccion) {
            case "arriba":
                dx= -1;
                break;
            case "abajo":
                dx = 1;
                break;
            case "derecha":
                dy = 1;
                break;
            case "izquierda":
                dy = -1;
                break;
        
            default:
                break;
        }
        //derecha - izquierda
        if (dy !=0) {
            int j=y;
            for (int i = y; i < y + longitud; i++) {
                tablero[x][j] = letra;
                j += dy;
            }
        }
        //arriba - abajo
        if (dx !=0) {
            int h = x;
            for (int i = x; i < x + longitud; i += dx) {
                tablero[h][y] = letra;
                h += dy;
            }
        }
    }
    public static void main(String[] args) {
        
        String tablero[][] = new String[10][10];

        for (int i = 0; i < tablero.length; i++) {
                Arrays.fill(tablero[i],"a");
            
        }
        pintarTablero(tablero);
        colocarBarco(3,3,"abajo",4,'p',tablero);
    }    
}
