package procedimientos;
import java.util.Scanner;
public class ejerciciopropuesto2 {
    static Scanner sc= new Scanner(System.in);
    public static double calculadora(double num1, double num2, String op){
    if (op.equals("-")) {
        return num1 - num2;
    } else if (op.equals("+")) {
        return num1 + num2;
       } else {
            return 0;
        }
    
    
    }

    public static void main(String[] args) {
        double numero1, numero2;
        String op;
        System.out.println("numero 1");
        numero1=sc.nextDouble();
        System.out.println("operación + o -");
        op=sc.next();
        System.out.println("numero 2");
        numero2=sc.nextDouble();
        System.out.println(calculadora(numero1, numero2, op));
    }
}