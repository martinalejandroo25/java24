import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;
        int valorAcumulado = 0;
       try {
        System.out.println("Numero a calcular");
        num = sc.nextInt();
        String numCad = Integer.toString(num);

        if (num % 2 == 0) {
            System.out.println("tu número es múltiplo de 2");
        }
        if (num % 5 == 0) {
            System.out.println("tu número es múltiplo de 5");

        }
        for (int i = 0; i < numCad.length(); i++) {
            char digitochar = numCad.charAt(i);
            int digito = Character.getNumericValue(digitochar);
            suma += digito;
        }
        if (suma % 3 == 0) {
            System.out.println("Tu numero es multiplo de 3");
        }
        for (int i = numCad.length() - 1; i >= 0; i--) { // Corrección en el bucle
            char digitoChar = numCad.charAt(i);
            int digito = Character.getNumericValue(digitoChar);
            valorAcumulado += 2 * digito;
        }

        if (valorAcumulado % 7 == 0) {
            System.out.println("Tu número es múltiplo de 7");
        }
       } catch (InputMismatchException e) {
        System.out.println("Ingresa solo números, por favor, "+ e.getMessage());
    } 
    }
}
