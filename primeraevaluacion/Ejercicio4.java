import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

    public static void pintarTablero(String[][] tablero){
            for(String[] linea:tablero){
            System.out.println(Arrays.toString(linea));
        }
    }

    public static boolean disparar(int x, int y, String tablero[][]) {
        boolean sepuede = true;

        if (tablero[x][y].equals("a")) {
            tablero[x][y] = "x";
            return false;
        } else {

        }

        return sepuede;
    }
    public static void colocarBarco(int x, int y, String direccion, int longitud, char c, String tablero[][]){ 
        if (comprobarBarco(x, y, direccion, longitud, tablero)) {
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
            int a = x;
            int b = y;
            for (int i = 0; i < longitud; i++) {
                a += dx;
                b += dy;
            }
        } else {

        }
       /* //derecha - izquierda
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
        } */
    }

    public static boolean comprobarBarco(int x, int y, String direccion, int longitud, String tablero[][]){
        boolean sePuede = true;
        switch (direccion) {
            case "arriba":
                if (x - longitud < 0) {
                    return false;
                }
                break;
            case "abajo":
                if (x + longitud > tablero.length) {
                    return false;
                }
                break;
            case "derecha":
                if (y + longitud > tablero.length) {
                    return true;
                }
                break;
            case "izquierda":
                if (y - longitud < 0) {
                    return false;
                }
                break;
        
            default:
                break;
        }

        return sePuede;
    }
    public static void main(String[] args) {
        
        String tablero[][] = new String[10][10];

        for (int i = 0; i < tablero.length; i++) {
                Arrays.fill(tablero[i],"a");
            
        }
        pintarTablero(tablero);
        System.out.println();
        colocarBarco(3,3,"abajo",4,'p',tablero);
        disparar(4, 6, tablero);
        pintarTablero(tablero);
    }    
}
