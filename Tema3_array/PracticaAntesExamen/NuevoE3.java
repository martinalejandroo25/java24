
package PracticaAntesExamen;
import java.util.Arrays;

public class NuevoE3 {
    /*En Java existe una clase estática llamada Arrays que nos permite hacer varias 
cosas con arrays: 
a. Arrays.fill(array, valor): llena un array con un valor pasado como parámetro 
b.  Arrays.sort(array): el array que se le pasa como parámetro queda ordenado 
c. Arrays.toString(array): pasa un array a String con sus elementos 
d.  Arrays.copyOf(array): devuelve un array nuevo igual que el que se le pasa 

(1 punto) Realiza las siguientes tareas usando los métodos anteriores: 
a. Crear un array de 50 elementos de tipo int, declarar el array _/
b.  Rellena el array con el valor 100. Arrays.fill _/
c. Pinta el vector con Arrays.toString _/
d.  Ordena el vector. Arrays.sort _/
e. Pinta el vector con Arrays.toString _/
f. Crea una copia del vector usando Arrays.copyOf. _/
g. Pinta el vector copiado con Arrays.toString _/

(1 punto) Por último, crea tres métodos que hagan lo mismo que fill, sort, toString: 
a. public static void rellenar(int array[], int valor) 
b. public static void ordenar(int array[])   Usa el método de la burbuja visto en clase. 
c. public static String pintar(int array[])  Devuelve un String así “[ele1, ele2, ... ]” */
    public static void ordenar(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compara elementos adyacentes y los intercambia si están en el orden incorrecto
                if (arr[j] > arr[j + 1]) {
                    // Intercambio de elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void rellenar(int array[], int valor) {
        for (int i = 0; i < array.length; i++) {
            array[i] = valor;
        }
        System.out.println("Array rellenado por función "+Arrays.toString(array));
    }
    public static String pintar(int array[]) {
    StringBuilder resultado = new StringBuilder("[ ");

    for (int i = 0; i < array.length; i++) {
        String pinto = String.valueOf(array[i]);
        resultado.append(pinto);

        // Añadir una coma después de cada elemento, excepto el último
        if (i < array.length - 1) {
            resultado.append(", ");
        }
    }

    resultado.append(" ]");
    return resultado.toString();
}

    public static void main(String[] args) {
        int arrayA[] = new int [50];
        Arrays.fill(arrayA,100);
        System.out.println("Original "+Arrays.toString(arrayA));
        Arrays.sort(arrayA);
        System.out.println("Ordenador "+Arrays.toString(arrayA));
        int copia[] = Arrays.copyOf(arrayA, arrayA.length);
        System.out.println("Copia "+ Arrays.toString(copia));
        rellenar(arrayA, 5);
        System.out.println(Arrays.toString(arrayA));
        int pruebaBubble[] = {4, 1, 6, 9, 5, 43, 11, 65, 22, 99};
        ordenar(pruebaBubble);
        System.out.println(Arrays.toString(pruebaBubble));
        
        
    }
}