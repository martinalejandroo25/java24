import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int ast;
            try {
                System.out.println("Dime asteriscos para la piramide");
                ast= Integer.parseInt(sc.nextLine());
                for (int i = 0; i < ast; i++) {
                    for (int j = 0; j <ast-i-1; j++) {
                        System.out.print(" ");
                    }
                    for ( int j = 0; j <=i; j++) {
                        System.out.print("*");
                        
                    }for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } catch (NumberFormatException e) {
                    System.out.println("Ingresa solo números, por favor "+ e.getMessage());
                }
        }
        
    }
}
