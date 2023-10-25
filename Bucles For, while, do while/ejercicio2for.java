import java.util.Scanner;
public class ejercicio2for {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        int numero=1000;
        int suma=0, contador=0;
        System.out.println("numero aqui");
        do {
            numero=sc.nextInt();
            suma += numero;
            contador++;
        }

        while (numero!=0);{
            suma=suma + numero;
            contador= contador+1;    
        
        }
        System.out.println("total de " + suma+ " y la media es " + (suma/contador));
    }
}
