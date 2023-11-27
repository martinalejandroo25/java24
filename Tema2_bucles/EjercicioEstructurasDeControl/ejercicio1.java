import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio1 {
    /*Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
    los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros. Sería así: */

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int num1;
            int num2;
            int num3;
            int num4;
            
            try {
            System.out.println("primer numero a comparar");
            num1=sc.nextInt();
            System.out.println("segundo numero a comparar");
            num2=sc.nextInt();
            System.out.println("tercer numero a comparar");
            num3=sc.nextInt();
            System.out.println("cuarto numero a comparar");
            num4=sc.nextInt();
                if (num1 > num2 && num1>num3) {
                    System.out.println(num1 + " es el numero mas alto");
                } else if (num2 > num1 && num2>num3) {
                    System.out.println(num2 + " es el numero mas alto");
                } else if (num3 > num2 && num3>num1) {
                    System.out.println(num3 + " es el numero mas alto");
                } if (num4 > num1 && num4>num2 && num4>num3) {
                    System.out.println("además, "+num4+" es mayor que los demás");
                }  
            } catch (InputMismatchException e) {
                System.out.println("Ingresa solo números, por favor. "+ e.getMessage());
            }
        }
    }
}