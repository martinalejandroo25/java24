import java.util.Scanner;
public class ejercicio2SWITCH
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime uno de los meses del año del 1 al 12 :)");
        int estacion= sc.nextInt();

        switch (estacion)
        {
            case 1, 2, 3:
            System.out.println("Estas en invierno!");
            break;
            case 4, 5, 6:
                System.out.println("Estás en Primavera!");
            break;
            case 7, 8, 9:
                System.out.println("Estás en Verano!");
            break;
            case 10, 11, 12:
                System.out.println("Estás en Otoño!");
            break;
            default:    
               System.out.println("Eso no es un mes disponible zopenco");
            break;
        }

        
    }
}
