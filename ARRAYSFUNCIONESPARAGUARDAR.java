import java.util.Scanner;
import java.util.Arrays;
public class ARRAYSFUNCIONESPARAGUARDAR {
    public static void desplazarTabla(int tabla[], int n) {
        int longitud = tabla.length;
        int[] temp = new int[longitud];

        //copiar los elementos a un array temporal
        for (int i = 0; i < longitud; i++) {
            temp[i] = tabla[i];
        }

        //Realizar el desplazamiento
        for (int i = 0; i < temp.length; i++) {
            //(i+n)%longitud garantiza que no se salga del rango del array
            tabla[(i+n)%longitud]=temp[i];
        }
    }
///////////////////////////////////////////////////////////////////////////////////

// Función para llenar la tabla con los números ingresados por el usuario
//en el main habrá que aclarar y crear un String con la enumeracion que queramos usar (String posicion[]={"Primero", "Segundo", etc......})
private static void llenarTabla(int[] tabla, Scanner sc, String[] posicion) {
    for (int i = 0; i < tabla.length; i++) {
        System.out.println("Dame el " + posicion[i] + " número");
        tabla[i] = Integer.parseInt(sc.nextLine());
    }
}
}
