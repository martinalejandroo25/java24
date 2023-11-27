package Excepciones;
import java.util.Scanner;
public class ejercicioMENU {
    public static void main(String[] args) {
        int opcion=0;

        try (Scanner sc = new Scanner(System.in)) {
            while (opcion!=3) {
                System.out.println("1.Saludo anónimo");
                System.out.println("2.Saludo con tu nombre");
                System.out.println("3. Salir");
                
                try {
                    opcion= Integer.parseInt(sc.nextLine());
                    switch (opcion) {
                case 1:
                    System.out.println("wenas tardes :)");
                    break;
                case 2:
                    System.out.println("Dime tu nombre");
                    String nombre=sc.next();
                    System.out.println("wenas tardes "+nombre+" :D");
                    break;
                default:
                System.out.println("Adiós");
                    break;
            }
                } catch (NumberFormatException e) {
                    System.out.println("Error en la elección de opciones, por favor elija (1, 2 o 3)");
                    
                }
            
            }
        }
    }
}
