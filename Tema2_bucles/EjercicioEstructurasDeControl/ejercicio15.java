import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int menor = Integer.MAX_VALUE;
            int mayor = Integer.MIN_VALUE;
            int num;
            System.out.println("Dime números:");

            try {
                do {
                    num = Integer.parseInt(sc.nextLine());
                    if (num != 0) {
                        if (num > mayor) {
                            mayor = num;
                        }
                        if (num < menor) {
                            menor = num;
                        }
                    } else {
                        break;
                    }
                } while (true);

                if (mayor != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
                    System.out.println("El mayor es " + mayor);
                    System.out.println("El menor es " + menor);
                } else {
                    System.out.println("No se ingresaron números distintos de cero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar solo números enteros.");
            }
        }
    }
}