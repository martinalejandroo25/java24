import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ast;
       try {
        System.out.println("numero para piramide");
        ast=sc.nextInt();
        for (int i = 1; i < ast; i++) {
            for (int j = 0; j<(i); j++) {
                System.out.print("* ");
            
            }
            System.out.println();
        }
       } catch (InputMismatchException e) {
        System.out.println("Ingresa solo números, por favor, error: "+ e.getMessage());
    }
    }
}
