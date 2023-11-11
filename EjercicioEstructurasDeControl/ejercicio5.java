import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double num;
        try {
         do { 
            System.out.println("Dame un número del 1 al 10 unicamente");
        num=sc.nextDouble();
        if (num>=1 && num<=10){
            System.out.println("Bien!, "+num+" es un numero válido entre el 1 y el 10");
            break;
         } else if (num<1 || num>10); {
                System.out.println("Número no válido");
         }} while (true);   
        } catch (InputMismatchException e) {
            System.out.println("Ingresa solo números, por favor "+ e.getMessage());
        }       
    }
}


