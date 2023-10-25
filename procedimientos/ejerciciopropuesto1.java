package procedimientos;
import java.util.Scanner;
//funcion llamada suma que reciba tres numeros double, y devuelva la suma de los tres numeros -->double
public class ejerciciopropuesto1 {
    public static double suma(double a,double b, double c) {
        
        return a + b + c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("dime primer numero");
        num1= sc.nextInt();
        System.out.println("dime segundo numero");
        num2= sc.nextInt();
        System.out.println("dime tercer numero");
        num3= sc.nextInt();
        System.out.println(suma(num1, num2, num3));

    }
}
