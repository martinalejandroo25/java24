package EstructurasControl;
import java.util.Scanner;
public class Ejercicio7Estructuras {
    /*Escribe un programa en Java que acepte por teclado dos números enteros
    y calcule su máximo común divisor usando el algoritmo de Euclides. 
    Dicho algoritmo tiene los siguientes pasos:

a) Se divide el número mayor (`a`) entre el menor (`b`).

b) Si la división es exacta (resto igual a 0), el divisor es el m.c.d.

c) Si la división no es exacta, dividimos el divisor entre el resto obtenido y continuamos de esta forma hasta obtener una división exacta. 
El m.c.d. es el último divisor. */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Dame el primer número (mayor)");
        a = sc.nextInt();
        System.out.println("El segundo número (menor)");
        b = sc.nextInt();
        if (a < b) {
            System.out.println("Cambia el orden, así no es posible hacer la comprobación");
        }else if (a > b) {
                if (a%b == 0) {
                System.out.println(a+" Es Máximo Común de "+b);
                }else if(a%b != 0);
                System.out.println(a+" No es Maximo común múltiplo de "+b);
            }
            sc.close();
    }
}
