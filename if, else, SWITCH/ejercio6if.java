import java.util.Scanner;
public class ejercio6if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nivel de 1 al 5");
        int nivel= sc.nextInt();

        if (nivel == 1)
            System.out.println("Eres un iniciado");
        else if (nivel == 2)
            System.out.println("Ja, amateur");
        else if (nivel == 3)
            System.out.println("Eres un profesional");
        else if (nivel == 4)
            System.out.println("Tenemos aqui todo un experto jejee");
        else if (nivel == 5)
            System.out.println("WAOOOOOO, eso si que es ser todo un dios papi");
        else {
            System.out.println("nah, eso es imposble, prueba de nuevo anda ;)");
            }
}
}

