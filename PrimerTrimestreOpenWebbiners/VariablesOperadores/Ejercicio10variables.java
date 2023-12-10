package VariablesOperadores;
import java.util.Scanner;
public class Ejercicio10variables {
    public static void main(String[] args) {
        /*10. Escribe un programa en Java que calcule cuál es el espacio recorrido por un objeto,
        como por ejemplo, una sonda espacial, que se mueve a velocidad constante. 
        Podemos suponer que el objeto ha recorrido un espacio inicial de 150.000 km y
        se mueve a una velocidad 17 km por segundo. */
        Scanner sc = new Scanner(System.in);
         int d, v, t; //distancia, velocidad, tiempo
        System.out.println("velocidad (km/s)");
        v = sc.nextInt();
        System.out.println("Tiempo en segundos");
        t = sc.nextInt();

        d = v * t;
        System.out.println("La distancia recorrida es de "+d+"Km");
        sc.close();

    }
}
