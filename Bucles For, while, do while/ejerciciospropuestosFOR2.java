import java.util.Scanner;
public class ejerciciospropuestosFOR2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double base, exponente, potencia;
        System.out.println("dime base");
        base=sc.nextDouble();
        System.out.println("Dime exponente");
        exponente=sc.nextDouble();
        potencia=1;
        for (int i = 0; i < exponente; i++) {
                potencia=potencia*base;
        }
        System.out.println(potencia);
    }
}
