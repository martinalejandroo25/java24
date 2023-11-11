import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio8 {
  public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num;
       try {
        do { 
            System.out.println("Dame un número del 1 al 10 para su tabla de multiplicar");
        num=sc.nextInt();
        if (num>=1 && num<=10){
            for (int i = 0; i < 11; i++) {
                System.out.println(num+" x "+i+" = "+num*i);
            };
            break;
         } else if (num<1 || num>10); {
                System.out.println("Número no válido");
         }} while (true);
       } catch (InputMismatchException e) {
        System.out.println("Ingresa solo números, por favor "+ e.getMessage());
    }       
    }
}
