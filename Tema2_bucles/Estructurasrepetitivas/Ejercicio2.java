import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            /*Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
introducir). El programa debe informar de cuantos números introducidos son mayores que
0, menores que 0 e iguales a 0. */
            int num=0;
            int cantnum=0;
            int cantmayor0=0;
            int cantmenor0=0;
            int cant0=0;
            System.out.println("Cuantos numeros introduciras? ");
            cantnum = sc.nextInt();
            ////////////////////////////////////////////////////////////////
            for (int i=0; i<cantnum; i++){
                System.out.println("Escribe el numero:");
                num=sc.nextInt();

                if (num > 0) {
                    cantmayor0++;
                } else if (num < 0){
                    cantmenor0++;
                } else {
                    cant0++;
                }

            }
   
            System.out.println("Numeros mayores que cero "+cantmayor0);
            System.out.println("Numeros menores que cero "+cantmenor0);
            System.out.println("Numeros iguales que cero "+cant0);
        }
    }
}
