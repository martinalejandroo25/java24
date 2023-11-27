import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio9 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            try {
                System.out.println("tell me number");
                num = sc.nextInt();
                int contador=1;
                while ((num/10)>0) {
                    contador++;
                    num=num/10;
                }
                System.out.println("tiene "+ contador +" digitos");
            } catch (InputMismatchException e) {
                    System.out.println("Ingresa solo números, por favor, error: "+ e.getMessage());
                }
        }
    }
}