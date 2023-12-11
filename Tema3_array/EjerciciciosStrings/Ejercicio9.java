package EjerciciciosStrings;
import java.util.Scanner;
public class Ejercicio9 {
    /*Crear una cadena de texto formada por tres cadenas “una”, “dos” y “tres” usando StringBuilder */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera cadena");
        StringBuilder cad1 = new StringBuilder(sc.nextLine());
        System.out.println("Segunda Cadena");
        StringBuilder cad2 = new StringBuilder(sc.nextLine());
        System.out.println("Tercera cadena");
        StringBuilder cad3 = new StringBuilder(sc.nextLine());
        sc.close();
        
        StringBuilder cadTodos = new StringBuilder();
        cadTodos.append(cad1 + " ");
        cadTodos.append(cad2 + " ");
        cadTodos.append(cad3);

        System.out.println(cadTodos);
    
    }
}
