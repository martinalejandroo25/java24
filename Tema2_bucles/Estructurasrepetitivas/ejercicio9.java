import java.util.Scanner;
public class ejercicio9
{
    /*Realizar un ejemplo de menú, donde podemos escoger las distintas opciones (Opción A,
Opción B, Salir) hasta que seleccionamos la opción de “Salir”. */
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion=0;
            while(opcion != 4) {
                System.out.println("Selecciona opción");
                System.out.println("1.add");
                System.out.println("2.delete");
                System.out.println("3.Borrar todo");
                System.out.println("4.Salir");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Usuario añadido");
                        break;
                    case 2:
                            System.out.println("Usuario eliminado");
                            break;
                    case 3:
                            System.out.println("todos los datos han sido eliminados");
                            break;
                    case 4:
                            System.out.println("sesión cerrada");
                            break;
                    default:
                            System.out.println("opción no válida");
                            break;
                }
            }
        }
        
    }
}