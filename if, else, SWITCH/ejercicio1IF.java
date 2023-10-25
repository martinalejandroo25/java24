import java.util.Scanner;
public class ejercicio1IF {
    public static void main(String[] args) {
        String usuario, password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor, ingrese su nombre de usuario ");
        usuario= sc.nextLine();
        System.out.println("Porfavor, ingrese su password ");
        password=sc.nextLine();
        
        
        if (usuario.equals("pepe") && (password.equals("12345678"))){
            System.out.println("Entrada al sistema concedida");
            }
        else if ((usuario != "pepe") || (password != "12345678")){
            System.out.println("Error: contraseña o nombre de usuario inconrrectos");
        }


    }
}