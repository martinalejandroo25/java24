package EstructurasControl;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio5Estructuras {
    /*Escribe un programa en Java que muestre la nota literal
    de un estudiante en función de su nota numérica 
    usando `switch` como expresión, no como sentencia. */
    /*Nota Literal:
10: A+ (o Excelente)
9-9.9: A
8-8.9: B+
7-7.9: B
6-6.9: C+
5-5.9: C (o Suficiente)
4-4.9: D (o Insuficiente)
1-3.9: F (o Muy Deficiente) */
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner (System.in);
        int nota;
        System.out.println("Dime la nota en formato numérico y te daré su equivalencia en Literal");
        nota = sc.nextInt();
        
            switch (nota) {
                case 1, 2, 3:
                    System.out.println("Su nota es de F (lamentable)");
                    break;
                case 4:
                    System.out.println("Su nota es de D (aber estudiao)");
                    break;
                case 5:
                    System.out.println("Su nota es de C (pOR el cul0 te la inco)");
                    break;
                case 6:
                    System.out.println("Su nota es C+ (ole, vamoh mejorando)");
                    break;
                case 7:
                    System.out.println("Su nota es B (numerico de dios)");
                    break;
                case 8:
                    System.out.println("Su nota es B+ (uh, eso si es ser estudioso)");
                    break;
                case 9:
                    System.out.println("Su nota es A (Casi la perfección)");
                    break;
                case 10:
                    System.out.println("Su nota es A+ (que bendicioon)");
                    break;
                
            
                default:
                System.out.println("La nota introducida no  es válida, ingrese una del 1 al 10");
                    break;
            }
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Pablo, del 1 al 10 imbecil");
        } 
    }
}
