package PracticaDeClase2324;
import java.util.Scanner;
public class opcion1 {
    public static int sumadigitos (int num) {
        int suma=0;
        while(num > 0) {

        suma += num % 10;

        num = num / 10;
    }
    return suma;
}
public static boolean esPrimo(int numero){
    int contador = 2;
    boolean primo=true;
    while ((primo) && (contador!=numero)){
      if (numero % contador == 0)
        primo = false;
      contador++;
    }
    return primo;
  }
  public static double circunferencia (int num) {
    double resultado=2*Math.PI*num;
  
  return resultado;
}
public static void main(String[] args) {
   int eleccion=0;
try {
    Scanner sc= new Scanner(System.in);
    int num;
    int resultado;
    System.out.println("Opciones a elegir:");
    System.out.println("1.Muestra la suma de cada uno de los digitos de un número");
    System.out.println();
    System.out.println("2.Dado un numero, ¿es primo o no lo es?");
    System.out.println();
    System.out.println("3.La logitud de una circunferencia dado el Radio");
    System.out.println();
    System.out.println("4.Fin del programa");
    eleccion=Integer.parseInt(sc.nextLine());
    switch (eleccion) {
        case 1:
            System.out.println("Ingrese el numero a sumar :)");
            num= Integer.parseInt(sc.nextLine());
            resultado=sumadigitos(num);
            System.out.println("La suma es de "+resultado);
            break;
        case 2:
            System.out.println("Ingrese el numero a preguntar :)");
            boolean resultado1;
            num= Integer.parseInt(sc.nextLine());
            resultado1=esPrimo(num);
            System.out.println("¿Es primo? parece que: "+resultado1);
        case 3:
            System.out.println("Dime un radio y te doy la longitud :)");
            double resultado2;
            num= Integer.parseInt(sc.nextLine());
            resultado2=circunferencia(num);
            System.out.println("La longitud de tu circunferencia es "+resultado2);

        case 4:
        System.out.println("Gracias por visitar mi Práctica de clase ;))");
            break;
        default:
        System.out.println("Hey, las opciones son 1, 2, 3 o 4, intentalo de nuevo ;)");
    }
   } catch (NumberFormatException e) {
    System.out.println("Te estoy pidiendo un 'número', zopenco :( "+e.getMessage());
   
}
} 
}

