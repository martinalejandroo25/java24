package EjerciciosArraysMatricespdf;
import java.util.Scanner;
public class ejercicio3 {
    /*Crea un array de números de un tamaño pasado por teclado, el array contendrá números 
    aleatorios entre 1 y 300
y mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado  
(debes controlar que se introduce un numero correcto), estos deben guardarse en un nuevo 
array. Por ejemplo, en un array de 10 posiciones e indicamos mostrar los números acabados en 5, 
podría salir 155, 25, etc. Cuando llene el segundo array finalizamos. */
public static int generarNumero(int min, int max) throws Exception {
    //genera numeros aleatorios dando el minimo y maximo 
    //Si min > max, lanzamos Exception "min debe ser menor que max"
    if (min > max) {
        throw new Exception("El valor mínimo no puede ser mayor que el máximo");
    }

    return  (int) ((Math.random() * (max - min + 1) + min)) ;
}
public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime el tamaño de Tu array");
    System.out.println("En que número quieres que terminen tus números?");
    int num[]= new int[Integer.parseInt(sc.nextLine())];
    for (int i = 0; i < num.length; i++) {
        num[i]= generarNumero(1, 300);
    }
    sc.close();
}
}
