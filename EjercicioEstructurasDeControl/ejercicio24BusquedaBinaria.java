import java.util.Scanner;
public class ejercicio24BusquedaBinaria {

    public static int generarNumero(int min, int max)throws Exception{
        if (min>max) {
            throw new Exception("El valor mínimo no puede ser mayor al máximo");
        }
        return (int) ((Math.random()*(max - min + 1)+min)); //guardalo, que puede ser util
    }
    
    
    
    public static void main(String[] args) {
        int numeroActual=0;
        int max=100, min=1;
        int opcion=0;
        Scanner sc=null;
        System.out.println("Piensa un número del 1 al 100, te lo adivinaré");
        
        try {
            while (opcion !=1) {
                sc= new Scanner(System.in);
                System.out.println("entre "+min+" y "+max);
                numeroActual = generarNumero(min, max);
                System.out.println("¿Es tu número el  "+numeroActual+"?");
                System.out.println("1. Ese es el número, acertaste");
                System.out.println("2. Mi numero es mayor");
                System.out.println("3. mi numero es menor");

                opcion= Integer.parseInt(sc.nextLine());
                
            
                    switch (opcion) {
                    case 1: 
                    System.out.println("Genial!! adiviné");
                    break;
                    case 2:
                    min=numeroActual+1;
                    numeroActual= generarNumero(min, max);
                    break;
                    case 3:
                    max=numeroActual-1;
                    numeroActual= generarNumero(min, max);
                    break;
                    default:
                    break;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }    }
}
//generar numero aleatorio del 1 al 100
//1 acertaste 2, es mayor, 3 es menor
//ir actualizando el valor dependiendo ()