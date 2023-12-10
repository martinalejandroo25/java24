package EjerciciosArraysMatricespdf;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        int num[]= new int[10];
        int numMayor;
        int numMenor;
        double media = 0;
        int conta = 0;
        String posicion[]={"primero", "segundo", "tercer", "cuarto", "quinto","sexto", "septimo", "octavo", "noveno", "decimo"};
        try (Scanner sc = new Scanner(System.in)) {
            try {
                for (int i = 0; i < num.length; i++) {
                System.out.println("Dame el "+posicion[i]+" numero");
                num[i]=Integer.parseInt(sc.nextLine());
                    
            }
            for ( int i = 0; i < num.length; i++) {
                conta += num[i];
            }
            numMayor=num[0];
            numMenor=num[num.length-1];
            for (int i = 0; i < posicion.length; i++) {
                if (num[i]>numMayor) {
                    numMayor=num[i];
                }
            }
            for (int i = 0; i < posicion.length; i++) {
                if (num[i]<numMenor) {
                    numMenor=num[i];
                }
            }
                System.out.println("Número menor= "+numMenor);
                System.out.println("Número mayor= "+numMayor);
            
            media = conta/num.length;
            System.out.println("La media es de "+media); 
            } catch (NumberFormatException e) {
                System.out.println("Por favor, solo números enteros");
            }
        }
        
        
    }
}
