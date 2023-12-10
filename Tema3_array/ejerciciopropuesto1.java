
import java.util.Scanner;
public class ejerciciopropuesto1 {
    public static void main(String[] args) {
        //En una empresa hay 10 trabajadores, Pide por teclado el salario de cada uno > guardalo en un array
        //muestra todos los salarios, > dime el salario medio de tus trabajadores
        Scanner sc= new Scanner(System.in);

        int salario[] = new int[10];
        int conta=0;
        System.out.println("Dame el salario de tus trabajadores");
        for (int i = 0; i <salario.length; i++) {
            System.out.println("Dime el salario del trabajador "+i);
            salario[i] = Integer.parseInt(sc.nextLine());
            conta+=salario[i];
        }
        System.out.println("La media de los salarios es de "+conta/salario.length);
        sc.close();
    }
}
