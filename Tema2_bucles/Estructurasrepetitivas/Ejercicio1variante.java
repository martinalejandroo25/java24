
import java.util.Scanner;
public class Ejercicio1variante {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=0;
        int numAdivinar;
        int intentos=0;
        numAdivinar= (int) (Math.random()*100)-1;
        while (num != numAdivinar && intentos <10) {
            System.out.println("Dime el número que crees que he generado: ");
            num=sc.nextInt();
            intentos++;
            if (num > numAdivinar) {
                System.out.println("El número es mayor");
            } else if (num > numAdivinar){
                System.out.println("El numero es menor");
            } else {
                System.out.println("Acertaste");
            }
            
        }
        if (intentos == 10) {System.out.println("Has agotado los intentos ");
    } else {
        System.out.println("Acertaste en "+intentos+" intentos");
    }
        
        
    }
}
