import java.util.Scanner;
public class ejercicio3SWITCH
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un mes");
        int mes= sc.nextInt();
        System.out.println("Dime un día");
        int dia=sc.nextInt();

        switch (mes)
        {
        :
                if (dia >=1 && dia <=31)
                    System.out.println("fecha correcta");
                else {System.out.println("fecha incorrecta");}
            break;
            case 4, 6, 9, 11:
                if (dia >=1 && dia <=30)
                    System.out.println("fecha correcta");
                else {System.out.println("fecha incorrecta");}
            break;
            case 2:
                if (dia >=1 && dia <=28)
                    System.out.println("fecha correcta");
                else {System.out.println("fecha incorrecta");}
            break;
            default:    
                System.out.println("Eso no es una fecha disponible zopenco");
        }

        
    }
}

