package Excepciones;
import java.util.Scanner;
public class generarAleatorios {
    public static int generarNumero(int min, int max)throws Exception{
        if (min>max) {
            throw new Exception("El valor mínimo no puede ser mayor al máximo");
        }
        return (int) ((Math.random()*(max - min + 1)+min)); //guardalo, que puede ser util
    }

    public static void main(String[] args) {
     try {
           System.out.println(generarNumero(1, 10));
           System.out.println(generarNumero(20, 30));
     } catch (Exception e) {
        System.out.println(e.getMessage());
     }
    }
    
}
