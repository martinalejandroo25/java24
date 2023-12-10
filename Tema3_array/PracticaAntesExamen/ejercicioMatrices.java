package PracticaAntesExamen;

public class ejercicioMatrices {
    /*Tablero de ajedrez
    En este ejercicio tienes que dibujar un tablero de ajedrez y poner las piezas en el tablero.X
    Un tablero de ajedrez es un tablero de 8x8 con 64 piezas. Tendréis que guardar el tablero en un array bidimensional. X
    Para inicializarlo lo rellenaremos inicialmente con B para las casillas negras y W para las blancas.X
    A continuación, coloca las piezas como en el ajedrez teniendo en cuenta que:
    - Peón  I
    - Torre  T
    - Alfil  X
    - Caballo  L
    - Reina  O
    - Rey  +
    Realiza esa parte de pintar el tablero con una función y pruébala.
    Mejora la función para que pinte si la pieza es blanca o negra. Ej. “TN o TB”.
    Realiza un método coordenadasAjedrez(int i, int j), que dada la coordenada de una casilla, te
    devuelva la coordenada como si fuera un tablero de ajedrez, las filas van de la 1 a la 8, y las
    columnas de la A a la H. Ej. La coordenada 5,5 es (3,G).
    Realiza un método pintarMovimientosCaballo(int i, int j, String tablero[][]), que se le pasen
    unas coordenadas (i,j), donde se supone que hay un caballo, y debe pintar por pantalla las
    ocho posibilidades donde puede mover un caballo (mueve en L, dos casillas en horizontal o
    vertical y una casilla perpendicular al movimiento anterior). No pintes aquellas posibilidades
    que queden fuera de tablero, o donde haya ya una pieza, que no sea W o B. Prueba ese
    método para un caballo que se encontrara en la coordenada (5,5), teniendo en cuenta que
    (0,0) es donde está la torre izquierda negra */
    public static char[][] colocarPiezas(){
        char[][] tablero = new char[8][8];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                    if ((i + j) % 2 == 0) {
                        tablero[i][j] = 'W';
                    } else {
                        tablero[i][j] = 'B';
                    }//piezas
                    if (i == 1 || i == 6) {
                        tablero[i][j] = 'I'; // Peón
                    } else if ((i == 0 || i == 7) && (j == 0 || j == 7)) {
                        tablero[i][j] = 'T'; // Torre
                    } else if ((i == 0 || i == 7) && (j == 2 || j == 5)) {
                        tablero[i][j] = 'X'; // Alfil
                    } else if ((i == 0 || i == 7) && (j == 1 || j == 6)) {
                        tablero[i][j] = 'L'; // Caballo
                    } else if (i == 0 && j == 3) {
                        tablero[i][j] = 'O'; // Reina
                    } else if (i == 0 && j == 4) {
                        tablero[i][j] = '+'; // Rey
                    }
            }
        } return tablero;
    }
    public static void pintarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] tablero = colocarPiezas();
        pintarTablero(tablero);
    }
    
}