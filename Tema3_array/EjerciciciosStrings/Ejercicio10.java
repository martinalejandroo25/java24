package EjerciciciosStrings;

public class Ejercicio10 {
    /*Compara estos dos Strings sin tener en cuenta mayúsculas “Esta tarde no voy”, “esta tarde no VOY”. */
    public static void main(String[] args) {
        String cad1 = "Esta tarde no voy";
        String cad2 = "esta tarde no VOY";

        if (cad1.equalsIgnoreCase(cad2) == true) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
    }
}
