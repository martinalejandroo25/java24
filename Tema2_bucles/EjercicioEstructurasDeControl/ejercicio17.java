import java.util.Scanner;
public class ejercicio17 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num=0;
            int conta=0;
            System.out.println("Escribe un número y verás sus divisores");
            num=Integer.parseInt(sc.nextLine());
            for (int i = 1; i <=num; i++) {
                if (num%i==0) {
                    System.out.println(i);
                    conta++;
                }
            }    
            System.out.println("El número "+num+" tiene "+conta+" divisores");
        } catch (NumberFormatException e) {
                e.printStackTrace();
            }
    }
}
