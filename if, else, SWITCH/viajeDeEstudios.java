import java.util.Scanner;

    public class viajeDeEstudios 
        {
            public static void main(String[] args) 
            {
                Scanner sc = new Scanner(System.in);

                int numAlumnos, costeTotal;
                System.out.println("Dime el numero de alumnos que van al viaje");
                numAlumnos= sc.nextInt();

                if (numAlumnos >=100) {
                    costeTotal = numAlumnos*65;}
                else if (numAlumnos>= 50 && numAlumnos <= 99){ 
                    costeTotal= numAlumnos*70;}
                
                else if (numAlumnos>= 30 && numAlumnos<=49) {
                    costeTotal= numAlumnos*95;}
                else if (numAlumnos<30) {
                    costeTotal=numAlumnos*4000;}
               
                
            }
        }
        