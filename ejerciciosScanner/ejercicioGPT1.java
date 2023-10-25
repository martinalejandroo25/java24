
import java.util.Scanner;
public class ejercicioGPT1 {
        public static void main(String[] args) 
        {
        
            Scanner sc = new Scanner (System.in);
            int caca1;
            int caca2;
            int cacafinal;
            
            System.out.println("Primer número para la suma");
            caca1 = sc.nextInt();
            System.out.println("Segundo número para la suma");
            caca2 = sc.nextInt();

            cacafinal = caca1 + caca2;
            System.out.println("La suma da como resultado " + cacafinal);


        }
}
