import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int dinerros, quiniento, dosciento, cien, cincuenta, veinte, diez, cinco, sobrante;
            try {
                System.out.println("dime los dinerros a contar jejee");
                dinerros = sc.nextInt();

                quiniento = dinerros / 500;
                dosciento = (dinerros % 500) / 200;
                cien = (((dinerros % 500) % 200) / 100);
                cincuenta = ((((dinerros % 500) % 200) % 100) / 50);
                veinte = (((((dinerros % 500) % 200) % 100) % 50) / 20);
                diez = ((((((dinerros % 500) % 200) % 100) % 50) % 20) / 10);
                cinco = (((((((dinerros % 500) % 200) % 100) % 50) % 20) / 10) / 5);
                sobrante = dinerros - (quiniento * 500 + dosciento * 200 + cien * 100 + cincuenta * 50 + veinte * 20 + diez * 10
                        + cinco * 5);
                if (quiniento > 0) {
                    System.out.println(quiniento + " billetes de 500");
                }
                if (dosciento > 0) {
                    System.out.println(dosciento + " billetes de 200");
                }
                if (cien > 0) {
                    System.out.println(cien + " billetes de 100");
                }
                if (cincuenta > 0) {
                    System.out.println(cincuenta + " billetes de 50");
                }
                if (veinte > 0) {
                    System.out.println(veinte + " billetes de 20");
                }
                if (diez > 0) {
                    System.out.println(diez + " billetes de 10");
                }
                if (cinco > 0) {
                    System.out.println(cinco + " billetes de 5");
                }
                System.out.println("sobran " + sobrante + " euros");    
            } catch (InputMismatchException e) {
                System.out.println("Los dinerros en númerros caballerro. "+ e.getMessage());
            }
        }

    }
}
