import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio10variante {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int ast;
            try {
                System.out.println("numero para piramide");
                ast=sc.nextInt();
                for (int i = ast; i > 0; i--) {
                    for (int j = 0; j<i; j++) {
                        System.out.print("* ");
                    
                    }
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                    System.out.println("Ingresa solo números, por favor, error: "+ e.getMessage());
                }
        } 
    }
}
