import java.util.Scanner;
public class ejercicio20 {
   public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
         int num=0;
         double suma=0;
         double conta=0;
         int mayor= Integer.MIN_VALUE;
         int menor=Integer.MAX_VALUE;
         System.out.println("Teclee todos los números que quiera, escriba '-1' para hacer la media entre ellos");  
         try {
            while (true) {
               num= Integer.parseInt(sc.nextLine());
               if (num==-1) {
                  break;
               }
               else
               suma+=num;
               conta++; 
               if (num > mayor) {
                  mayor = num;
               }
               if (num < menor) {
                  menor = num;
               }
            }
            if (conta>0){
                  System.out.println("La media de los numeros es igual a "+ suma/conta);
            }else {
                  System.out.println("No se ingresaron números para calcular la media ");
               }
               if (mayor != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
                  System.out.println("El mayor es " + mayor);
                  System.out.println("El menor es " + menor);
               } else {
                     System.out.println("No se ingresaron números distintos de cero.");
                  }
         } catch (NumberFormatException e) {
               System.out.println("Error: Debes ingresar solo números enteros");
            }
      }

            
   }
}  
