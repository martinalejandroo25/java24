
import java.util.Scanner;
public class ejercicio2variante {

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
    if (calfin <= 3) {
        System.out.println("lamentable bro");
        }else if (calfin>=4 && calfin <=5){
        System.out.println("Uf, medio lamentable pero salvable");
        } else if (calfin>=5 && calfin<=7) {
            System.out.println("Ni tan mal... ni tan mal ;)");
        } else if (calfin >=8 && calfin ==10) {
            System.out.println("Ahora eres tu el que puede decirle a los demás 'haber estudiao'");
        }
    }



    }
    

