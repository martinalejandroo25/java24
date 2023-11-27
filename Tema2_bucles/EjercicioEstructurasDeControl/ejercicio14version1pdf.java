import java.util.Scanner;
public class ejercicio14version1pdf {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cdu;
            int c, d, u;
            System.out.println("num:");
            cdu=sc.nextInt();
            c=cdu/100;
            d=(cdu/10)%10;
            u=cdu%10;
    
            System.out.println("Me veo al espejo y el numero se vuelve "+((100*u)+(10*d)+(c)));
        }
    }
}
