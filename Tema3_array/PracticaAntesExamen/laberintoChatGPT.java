package PracticaAntesExamen;

import java.util.Random;
import java.util.Scanner;

public class laberintoChatGPT {
    public static void main(String[] args) {
        char[][] tablero = new char[20][20];
        int[] salida = generarCoordenadasAleatorias();
        int[] bomba = generarCoordenadasAleatorias();
        int[] jugador = {0, 0};
        int pasos = 0;

        inicializarTablero(tablero, salida, bomba, jugador);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            pintarTablero(tablero);

            System.out.println("Elige una dirección: 1 (derecha), 2 (izquierda), 3 (abajo), 4 (arriba)");
            int opcion = scanner.nextInt();

            try {
                moverJugador(tablero, jugador, opcion);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Te has salido del tablero. Has perdido.");
                break;
            }

            pasos++;

            if (jugador[0] == salida[0] && jugador[1] == salida[1]) {
                System.out.println("¡Felicidades! Has encontrado la salida en " + pasos + " pasos.");
                break;
            }

            if (jugador[0] == bomba[0] && jugador[1] == bomba[1]) {
                System.out.println("¡Boom! Has pisado una bomba. Has perdido.");
                tablero[bomba[0]][bomba[1]] = 'X';
                break;
            }
        }
    }

    public static void inicializarTablero(char[][] tablero, int[] salida, int[] bomba, int[] jugador) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i == 0 || i == tablero.length - 1) {
                    tablero[i][j] = '-';
                } else if (j == 0 || j == tablero[i].length - 1) {
                    tablero[i][j] = '|';
                } else {
                    tablero[i][j] = '.';
                }
            }
        }

        tablero[salida[0]][salida[1]] = '#';
        tablero[bomba[0]][bomba[1]] = '.';
        tablero[jugador[0]][jugador[1]] = '@';
    }

    public static void pintarTablero(char[][] tablero) {
        for (char[] fila : tablero) {
            for (char celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }

    public static void moverJugador(char[][] tablero, int[] jugador, int direccion) {
        tablero[jugador[0]][jugador[1]] = '.';

        switch (direccion) {
            case 1:
                jugador[1]++;
                break;
            case 2:
                jugador[1]--;
                break;
            case 3:
                jugador[0]++;
                break;
            case 4:
                jugador[0]--;
                break;
        }

        tablero[jugador[0]][jugador[1]] = '@';
    }

    public static int[] generarCoordenadasAleatorias() {
        Random rand = new Random();
        return new int[]{rand.nextInt(18) + 1, rand.nextInt(18) + 1};
    }
}

