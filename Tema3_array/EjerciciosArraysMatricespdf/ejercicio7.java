package Tema3_array.EjerciciosArraysMatricespdf;
import java.util.Scanner;
import java.util.Arrays;
public class ejercicio7 {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabla[] = new int[5];

        String posicion[]={"primero", "segundo", "tercer", "cuarto", "quinto"};
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Dame el "+posicion[i]+" numero");
            tabla[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(tabla));
        System.out.println("Cuantas posiciones deseas desplazar?");
        int n = Integer.parseInt(sc.nextLine());
        desplazarTabla(tabla, n);
        System.out.println(Arrays.toString(tabla));
    }
}
