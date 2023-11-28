import java.util.Scanner;
public class ejercicio21 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero;
            String numInver = "";

            try {
                do {
                    System.out.print("Ingrese un número del 1 al 999: ");
                    numero = Integer.parseInt(sc.nextLine());
                    if (numero < 1 || numero > 999) {
                        System.out.println("El número debe estar en el rango de 1 a 999.");
                    }
                } while (numero < 1 || numero > 999);

                String numString = String.valueOf(numero);
                for (int i = numString.length()-1; i<=0; i--) {
                    numInver+=numString.charAt(i);
                }
            } catch (NumberFormatException e) {
                    System.out.println("Nope, eso no vale, solo números enteros del 1 al 999"+e.getMessage());
                } 
            System.out.println("Tu número seria el "+numInver);
        }
    }
}
