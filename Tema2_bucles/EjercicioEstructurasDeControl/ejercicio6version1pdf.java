import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio6version1pdf {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);    
        int num;
       try {
        System.out.println("número para lista impar");
        num=sc.nextInt();
        for (int i = 1; i< num; i+=2) {
            System.out.println(i);
        }
        System.out.println();
       } catch (InputMismatchException e) {
        System.out.println("Ingresa solo números, por favor "+ e.getMessage());
    } 
    }
}
