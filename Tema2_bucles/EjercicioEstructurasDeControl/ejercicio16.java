import java.util.Scanner;
public class ejercicio16 {
   public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
         double num=0;
         double suma=0;
         double conta=0;
         System.out.println("Teclee todos los números que quiera, escriba '-1' para hacer la media entre ellos");  
         try {
            while (true) {
               num= Double.parseDouble(sc.nextLine());
               if (num==-1) {
                  break;
               }
               else
               suma+=num;
               conta++; 
            }
            if (conta>0){
               System.out.println("La media de los numeros es igual a "+ suma/conta);
            }else {
               System.out.println("No se ingresaron números para calcular la media ");
            }
         } catch (Exception e) {
               System.out.println("Ha habido un error al introducir los datos, recuerda solo introducir numeros enteros o decimales");
            }
      }
   }
}  
