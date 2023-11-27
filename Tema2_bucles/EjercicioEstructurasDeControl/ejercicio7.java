import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long factorial=1;
            int num=0;
            try {
                System.out.println("dame numero a factorizar");
                num=sc.nextInt();
                for (int i = 1; i <= num; i++) {
                    factorial*=i;
                }
                System.out.println("El factorial es "+factorial);   
            } catch (InputMismatchException e) {
                    System.out.println("Ingresa solo números, por favor. "+ e.getMessage());
                }
        }
    }
}
