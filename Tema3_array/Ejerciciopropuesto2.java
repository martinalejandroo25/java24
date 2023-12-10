
import java.util.Arrays;
/*Crea un array de 20 int y rellénalo con el número 0. Pintalo. ahora consigue que los elementos en posiciones pares tengan valor -1  */
public class Ejerciciopropuesto2 {

    public static void main(String[] args) {
        int num[]=new int[20];
        Arrays.fill(num, 1);
        for (int i = 0; i < num.length; i++) {
            if (i%2==0) {
                num[i]=-1;
            }
            
        }
        
        System.out.println(Arrays.toString(num));
    }
    
    
}