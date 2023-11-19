package Tema3_array.PracticaFuera;
import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String apellidos[]= new String[5];
        int numero;
        int sumaPrecios = 0;
        int precios[]= new int [3];

        apellidos[0]="Labrada";
        apellidos[1]="Arteaga";
        apellidos[2]="Suarez";
        apellidos[3]="Romo";
        apellidos[4]="García";

        for (int i = 0; i < apellidos.length; i++) {
            System.out.println(apellidos[i]);
        }
        System.out.println(Arrays.toString(apellidos));
        


        for (int j = 0; j < precios.length; j++) {
            System.out.println("Dame el numero:");
            precios[j]= Integer.parseInt(sc.nextLine());
            
        }
        System.out.println(Arrays.toString(precios));

        for (int i = 0; i < precios.length; i++) {
            sumaPrecios = sumaPrecios + precios[i];
        }
        System.out.println(sumaPrecios);

        for (int i = 0; i < precios.length; i++) {
            
        }
        double mediaPrecios= sumaPrecios/precios.length;
        System.out.println(mediaPrecios);
    }
    
}
