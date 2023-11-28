import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1=0;
            int num2=0;
            System.out.println("dame número 1");
            num1=Integer.parseInt(sc.nextLine());
            System.out.println("dame numero 2");
            num2=Integer.parseInt(sc.nextLine());
            do {
                if (num1 !=num2 || num1==num2) 
                    System.out.println(num1);
                    num1++;
                if (num1 %2==0) {
                    System.out.print("par: ");
                }    
            } while (num1<=num2);
            System.out.println("hay "+num2/2+" Números pares");
        } catch (NumberFormatException e) {
                e.printStackTrace();
            }
    }
}
    
