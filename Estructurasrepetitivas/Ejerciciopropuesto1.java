import java.util.Scanner;

public class Ejerciciopropuesto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresame un numero del 1 al 10: ");
        int num = sc.nextInt();

        if( num >= 1 && num <=10) {
            System.out.println("Tabla de multiplicar del " + num + ":");

            for (int i = 1; i <=10; i++) {
                int resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("El numero ingresado no esta en el rango valido");
        }

    }
}
