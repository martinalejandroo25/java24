import java.util.Scanner;
public class ejerciciospropuestosFOR {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);

     int num;
     int contadorDivisor=0;
        System.out.println("dame numerico ");
        num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if(num%i==0){System.out.println(i);
            contadorDivisor++;
        }
        }
            System.out.println("el numero "+num+" tiene "+contadorDivisor+ " divisores");
        }
            
    }