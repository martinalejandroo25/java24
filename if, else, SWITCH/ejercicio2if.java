import java.util.Scanner;
public class ejercicio2if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Dime un número ");
        num = sc.nextInt();

        if (num%2 == 0)
            System.out.println("Tu número es par ");
        else if (num%2 != 0)
            System.out.println("tu numero es impar");

    }
}