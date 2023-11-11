import java.util.Scanner;

public class ejercicio23 {
    public static boolean FechaCorrecta(int dia, int mes, int anio) {
        boolean fechaC = true;
        switch (mes) {
            case 1,3,5,8,10,12://31 dias
                if(dia<1 || dia>31)
                    fechaC=false;
                break;
            case 4,6,9,11:
            if(dia<1 || dia>30) //30 dias
                    fechaC=false;
                break;
            case 2;
            if(dia<1 || dia>28) //febrero
                    fechaC=false;
                break;
            default:
                break;
        }

    }
    public static void main(String[] args) {
        int dia=0, mes=0, anio=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el día");
        dia=Integer.parseInt(sc.nextLine());
        System.out.println("DIme el mes");
        mes=Integer.parseInt(sc.nextLine());
        System.out.println("Dime el año");
        anio=Integer.parseInt(sc.nextLine());

        if (FechaCorrecta) {
            
        }

    }    
}
