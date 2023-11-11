import java.util.Scanner;

public class Ejerciciopropuesto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numast;
        System.out.println("Dime numero para hacerlo asteriscos jejee");
        numast=sc.nextInt();
        for (int i = 1; i<=numast; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
