package EjerciciosArraysMatricespdf;
import java.util.Scanner;
import java.util.Arrays;
public class ejercicio7 {
    /*Crear un programa que lea por teclado una tabla de 5 números enteros
    y la desplace una posición hacia la derecha: 
    el primero pasa a ser el segundo, 
    el segundo pasa a ser el tercero y así sucesivamente. 
    Igual que el anterior, pero desplazando N posiciones (N es un número introducido por el usuario). */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //numerar los elementos para el mensaje al usuario
        String numerar[]={"primer", "segundo", "tercer", "cuarto", "quinto"};//////
        int tabla[] = new int[5];
        // mal int temp=0;
        //leer de teclado 5 números para añadirlos al array
        try { for (int i = 0; i < tabla.length; i++) {
                System.out.println("Dime el "+numerar[i]+" elemento");
                tabla[i] = Integer.parseInt(sc.nextLine());
                // mal temp = tabla[i];
                }
            //Imprimir la tabla original
            System.out.println("La tabla actual es: "+Arrays.toString(tabla));
            
            System.out.println("Dame el número de posiciones a desplazar");
            int posicion=Integer.parseInt(sc.nextLine());

            //Realizar el desplazamiento N posiciones
        
            for (int i = 0; i < posicion; i++) {
                //Guardar en temp el último elemento de la tabla
                int temp = tabla[tabla.length-1];

                for (int j = tabla.length-1; j > 0; j--) {
                    tabla[j] = tabla[j-1];
                }
                //Asignar valor temporal al primer elemento
                tabla[0] = temp;
            }
            System.out.println(Arrays.toString(tabla));
            sc.close();
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduzca un número entero válido, error: " +e.getCause()+" "+e.getMessage());
        }
    }
    
    
}