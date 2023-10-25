import java.util.Scanner;
public class ejercicio4if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Dime un número ");
        num = sc.nextInt();

        if (num%2 == 0)
            System.out.println("Tu número es par ");
        else if (num%2 != 0)
            System.out.println("tu numero es impar");
        
        
        if (num%10 == 0)
            System.out.println("además es multiplo de 10 ");
        else {
            System.out.println("además no es multiplo de 10");
             }
        

    }
}