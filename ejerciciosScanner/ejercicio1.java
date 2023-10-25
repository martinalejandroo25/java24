
import java.util.Scanner;
public class ejercicio1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double cat1;
            double cat2;
            double hip;

            System.out.println("Primer cateto del triangulo: ");
            cat1 = sc.nextDouble();
            System.out.println("Segundo cateto del triangulo ");
            cat2 = sc.nextDouble();

            hip = ((Math.pow (cat1, 2)) + (Math.pow (cat2, 2)));
            System.out.println("La hipotenusa de este triangulo es " + Math.sqrt(hip));
            
        
        }

}
