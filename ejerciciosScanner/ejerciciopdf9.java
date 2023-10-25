
import java.util.Scanner;

public class ejerciciopdf9 {
    public static void main(String[] args) {
        
        //Dado un punto (x1,y1 ) y otro punto(x2,y2), calcular la distancia

        //1.decaracion de variables
        double  x1,y1,x2,y2;
        double  distancia;
        double distanciaX, distanciaY;

        //2.pedir datos por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("dime la coordenada x  del primer punto ");
        x1 = sc.nextDouble();
        System.out.println("dime la coordenada y del primer punto ");
        y1 = sc.nextDouble();
        System.out.println("dime la coordenada x  del segundo punto ");
        x2 = sc.nextDouble();
        System.out.println("dime la coordenada y del segundo punto ");
        y2 = sc.nextDouble();

        //3. Calcular la distancia -> Raiz cuadrada de (x2-x1) y (y1-y2)
        distanciaX = Math.pow(x2-x1, 2);
        distanciaY = Math.pow(y2-y1, 2);
        distancia = Math.sqrt(distanciaX+distanciaY);
        System.out.println("La distancia es de "+distancia+"m");





    }

}
