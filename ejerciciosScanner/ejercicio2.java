
import java.util.Scanner;
public class ejercicio2 {

    public static void main(String[] args) 
    {
        
Scanner sc = new Scanner (System.in);
    double Primerev;
    double Segunev;
    double Tercerev;
    double exfin;
    double trafin;
    double calfin;

    System.out.println("Nota primera evaluación");
    Primerev = sc.nextDouble();
    System.out.println("Nota segunda evaluación");
    Segunev = sc.nextDouble();
    System.out.println("Nota tercera evaluación");
    Tercerev = sc.nextDouble();
    System.out.println("Nota examen final");
    exfin = sc.nextDouble();
    System.out.println("Nota Trabajo final");
    trafin = sc.nextDouble();
    calfin = (((Primerev + Segunev + Tercerev)/3)*0.55) + exfin*0.3 + trafin*0.15;
    System.out.println("Tu calificación final es " + calfin );
    
    }



    }
    

