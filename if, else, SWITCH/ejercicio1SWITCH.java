import java.util.Scanner;
public class ejercicio1SWITCH 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nivel de 1 al 5");
        int nivel= sc.nextInt();

        switch (nivel)
        {
            case 1:
            System.out.println("Eres un iniciado");
            break;
            case 2:
                System.out.println("Ja, amateur");
            break;
            case 3:
                System.out.println("Eres un profesional");
            break;
            case 4:
                System.out.println("Tenemos aqui todo un experto jejee");
            break;
            case 5: 
            
                System.out.println("WAOOOOOO, eso si que es ser todo un dios papi");
            break;
            default:    
        }       System.out.println("nah, eso es imposble, prueba de nuevo anda ;)");
    }
}
