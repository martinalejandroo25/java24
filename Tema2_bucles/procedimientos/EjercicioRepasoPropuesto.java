package procedimientos;
import java.util.Scanner;
public class EjercicioRepasoPropuesto {

public static double potencia(double base, int exponente) {
    double resultado=1;
    for (int i = 0; i < exponente; i++) {
        resultado=resultado*base; //resultado *= base
        
    }
    return resultado;    
}

public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        double base;
        int exponente;
        double resultado;

try {
            System.out.println("Dime la base");
        base=Double.parseDouble(sc.nextLine());
        System.out.println("Dime exponente");
        exponente=Integer.parseInt(sc.nextLine());

        resultado=potencia(base, exponente);
        System.out.println("El resultado es "+resultado);

} catch (Exception e) {
        System.out.println("La base debe ser un Double y el exponente un entero");
}
    }



}
    
}