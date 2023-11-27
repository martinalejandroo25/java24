package Tema3_array;
import java.util.Scanner;
public class pdfrepaso1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String palabras[]=new String[5];
        String invertido[]=new String[5];
        
        int contador=0;


        //Llenar el array con Strings leídos de teclado
        for( int i=0; i<palabras.length; i++) {
            System.out.println("Introduce palabra");
            palabras[i] = sc.nextLine();
        }

        contador = 0;
        for (int i = palabras.length-1; i >=0; i--) {
            invertido[contador]=palabras[i];
            contador++;            
        }

        for(int i=0; i<invertido.length; i++) {
            System.out.println(invertido[i]);
        }
        sc.close();
    }
}
