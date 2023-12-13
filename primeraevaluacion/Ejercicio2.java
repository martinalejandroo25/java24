

public class Ejercicio2 {
    /*Craps. Es un juego de dados muy facil, y consiste en arrojar la suma de 2 dados, 
y su suma es 7 u 11 ganas la partida. En cambio, si sacas un 2, 3 o 12 pierdes. Con cualquier 
otro numero que saques, debes guardar ese número y tirar los dados repetidamente hasta 
volver a sacar ese dado (ganas) o sacar el 7 (pierdes). Realiza el juego para dos jugadores 
simulando las tiradas de forma aleatoria y que jueguen 10 partidas, indica cuántas partidas 
gana jugador1 y cuántas jugador2. Ahora simula 1000 partidas e indica las partidas que 
gana cada uno. */
public static int generarNumeroAleatorio(int min, int max) throws Exception {
    if (min > max) {
        throw new Exception("El valor mínimo no puede ser mayor que el máximo");
    }
    return (int) (Math.random() * (max - min + 1) + min);
}
    public static void main(String[] args) throws Exception {
        System.out.println("Tirada del jugador uno");
        int tirada1j1 = generarNumeroAleatorio(1, 6);
        int tirada2j1 = generarNumeroAleatorio(1, 6);
        int suma1 = tirada1j1 + tirada2j1;
        if (suma1 == 7 || suma1 == 11) {
            System.out.println("El ganador ha sido el jugador 1");
        
        } else if (suma1 == 2 || suma1 == 3 || suma1 == 12) {
            System.out.println("Jugador uno pierde...");

        } else {System.out.println("Tirada del jugador2");
            int tirada1j2 = generarNumeroAleatorio(1, 6);
            int tirada2j2 = generarNumeroAleatorio(1, 6);
            int suma2 = tirada1j2 + tirada2j2;
            if (suma2 == 7 || suma1 == 11) {
            System.out.println("El ganador ha sido el jugador 2");
            
            }
            }
        
    }
}
