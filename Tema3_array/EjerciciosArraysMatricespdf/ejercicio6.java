package EjerciciosArraysMatricespdf;
import java.util.Arrays;
public class ejercicio6 {
    public static int generarNumero(int min, int max) throws Exception {
        //genera numeros aleatorios dando el minimo y maximo 
        //Si min > max, lanzamos Exception "min debe ser menor que max"
        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }

        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }
    public static void main(String[] args) throws Exception {
        
        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {
            
            num[i]=generarNumero(1, 100);
        }
        System.out.println(Arrays.toString(num));
        System.out.print("[");
        for (int i = 0; i < num.length/2; i++) {
        System.out.print(num[i]+", ");
        System.out.print( num[num.length-1-i]+", ");
        }
        System.out.print("]");
            
    }
    

}
