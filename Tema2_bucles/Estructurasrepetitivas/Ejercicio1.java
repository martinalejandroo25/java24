import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            int numAdivinar;
            numAdivinar= (int) (Math.random()*100)-1;

            System.out.println("Dime el número que crees que he generado: ");
            num=sc.nextInt();

                if (num > numAdivinar) {
                    System.out.println("El número es mayor");
                } else {
                    System.out.println("El numero es menor");
                }
        }
    }
}
