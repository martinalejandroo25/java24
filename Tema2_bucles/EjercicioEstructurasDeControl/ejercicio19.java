import java.util.Scanner;
public class ejercicio19 {
    public static boolean esPrimo(int numero) {
        boolean esPrimo=true;

        for(int i=2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        return esPrimo;
    }
    public static void main(String[] args) {
        try {
            try (Scanner sc = new Scanner(System.in)) {
                int num=0;
                System.out.println("Dime un número y te mostraré los números primos menores");
                num=Integer.parseInt(sc.nextLine());
                for (int i=2; i<=num; i++) {
                    if (esPrimo(i)==true) {
                        System.out.println(i);
                    } else{}
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Pero mira quien ha metido mal el número, si, tu. Solo números enteros");
        }
    }
}
