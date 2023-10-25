import java.util.Scanner;
public class ejercicio5if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad preciose");
        int edad= sc.nextInt();

    if ((edad >= 1) && (edad <= 5))
         System.out.println("Eres un niño");
         else if ((edad >= 6) && (edad <= 12))
        System.out.println("Eres un chaval");
        else if ((edad >= 13) && (edad <= 18))
        System.out.println("Eres un adolescente");
        else if ((edad >= 19) && (edad <= 25))
        System.out.println("Estas en la edad de oro, disfutala");
        else if ((edad >= 26) && (edad <= 45))
        System.out.println("Eres un adulto, lo siento");
        else if ((edad >= 46) && (edad <= 65))
        System.out.println("Ya estas chocheando señor");
        else if (edad > 65)
        System.out.println("En tus tiempos mozos jugabas con palos y cuerda y tu mascota era un dinosaurio");
}
}