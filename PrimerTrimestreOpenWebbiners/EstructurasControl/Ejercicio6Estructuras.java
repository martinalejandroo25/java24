package EstructurasControl;
import java.util.InputMismatchException;
import java.util.Scanner;
/*Escribe un programa en Java que acepte por teclado un número entero entre 1 y 10 y muestre su tabla de multiplicar. */
public class Ejercicio6Estructuras {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int num;
            System.out.println("elige del 1 al 10 para  ver la tabla de multiplicar");
            num = sc.nextInt();

            
                switch (num) {
                case 1:
                    for (int i = 0; i <= 10 ; i++) {
                        System.out.println("1 x "+i+" = "+1*i);
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 10 ; i++) {
                        System.out.println("1 x "+i+" = "+2*i);
                    }
                    break;
                case 3:
                    for (int i = 0; i <= 10 ; i++) {
                        System.out.println("1 x "+i+" = "+3*i);
                    }
                    break;
                case 4:
                    for (int i = 0; i <= 10 ; i++) {
                        System.out.println("1 x "+i+" = "+4*i);
                    }
                    break;
                case 5:
                    for (int i = 0; i <= 10 ; i++) {
                        System.out.println("1 x "+i+" = "+5*i);
                    }
                    break;
                case 6:
                    for (int i = 0; i <= 10 ; i++) {
                        System.out.println("1 x "+i+" = "+6*i);
                    }
                    break;
                case 7:
                    for (int i = 0; i <= 10 ; i++) {
                        System.out.println("1 x "+i+" = "+7*i);
                    }
                    break;
                case 8:
                    for (int i = 0; i <= 10 ; i++) {
                        System.out.println("1 x "+i+" = "+8*i);
                    }
                    break;
                case 9:
                    for (int i = 0; i <= 10 ; i++) {
                        System.out.println("1 x "+i+" = "+9*i);
                    }
                    break;
                case 10:
                    for (int i = 0; i <= 10 ; i++) {
                        System.out.println("1 x "+i+" = "+10*i);
                    }
                    break;
            
                default:
                    System.out.println("Solo un número del 1 al 10");
                    break;
                
            }
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Chacho, que entiendes por número??");
        }
    }
}
