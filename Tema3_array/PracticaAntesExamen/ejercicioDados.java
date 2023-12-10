package PracticaAntesExamen;
public class ejercicioDados {
    /*Dados
Escriba un programa que genere la tirada de 2 dados (de 6 lados)--
y genere tiradas aleatorias y 
vaya sumando sus resultados hasta que ambos saquen un 6.
Se deben mostrar todas las tiradas,
el número de tiradas realizadas y 
la suma de ambos dados hasta que sacaron ambos un 6. 

Escribe después una función llamada double[] estadisticas(int n) 
que lance un dado aleatoriamente un número n de veces recibido como parámetro y 
debes retornar el porcentaje de apariciones de cada número del
dado en las n tiradas (double[]). Pruébalo con n = 100 y n = 1000. */

//Función para generar la estadistica de un dado lanzado N veces
    public static double[] estadistica(int n) throws Exception {
        int cont[] = new int[6];
        for (int i = 0; i < cont.length; i++) {
        int numAle = generarNumeroAleatorio(1, 6);
            int resultado = numAle;
            cont [resultado -1]++; 
        }
        double porcentaje[] = new double[6];
        for (int i = 0; i < porcentaje.length; i++) {
            porcentaje[i] = ((cont[i] /(double)n) * 100);
        }
        return porcentaje;
    }
    //función para generar el número aleatorio entre 1 y 6
    public static int generarNumeroAleatorio(int min, int max) throws Exception {
        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public static void main(String[] args) throws Exception {
        //decalaración de variables, sum para sumar ambos dados hasta que ambos sean 6
        //tirada cuenta el número de veces que se repite el bucle hasta la aparición ambos 6
        int dado1, dado2, sum = 0, tiradas = 0;
        //generación de las tiradas
        do {
            dado1 = generarNumeroAleatorio(1, 6);
            dado2 = generarNumeroAleatorio(1, 6);
            sum+= dado1 + dado2;
            tiradas++;
            System.out.println("Tirada "+tiradas+" .Dado1 ="+dado1+". Dado2 =" +dado2+", suma = "+sum);
            //el bucle se repetira si dado 1 o dado 2 son distintos de 6
        } while (dado1 != 6 || dado2 != 6);
        //caso contrario imprime número de tiradas:
        System.out.println("Ambos dados han salido 6 después de "+tiradas+" tiradas");

        //llamada a la función de estadística (Lo siento, los porcentajes no me salieron bien)
        double[] estadistica = estadistica(100);
        for (int i = 0; i < estadistica.length; i++) {
            System.out.println("Porcentaje de " + (i + 1) + ": " + estadistica[i] + "%");
        }
        
    }
}