package PracticaDeClase2324;
import java.util.Scanner;
public class ejerciciohumirus {
   public static int generarTirada(int min, int max) throws Exception {
    if (min>max){
        throw new Exception ("El valor mínimo no puede ser mayor al  máximo");
    }
    return (int) ((Math.random()*(max-min+1)+min));
    
   }
   public static void main(String[] args) {
    try {
        int tiradaJ1=0, tiradaJ1_2=0, tiradaJ1_3=0, tiradaJ1_4=0, tiradaJ1_5=0; 
        int tiradaJ2=0, tiradaJ2_2=0, tiradaJ2_3=0, tiradaJ2_4=0, tiradaJ2_5=0;
    int totalJ1=0, totalJ2=0;
    int Empate=0;
    int turnos;
    Scanner sc= new Scanner(System.in);
    System.out.println("turnos a jugar:");
    turnos= Integer.parseInt(sc.nextLine());

    for (int i = 1; i <=turnos; i++) {
        System.out.println("Turno "+ i +"---------------------------");
        tiradaJ1= generarTirada(1,6);
        tiradaJ1_2=generarTirada(1,6);
        tiradaJ1_3=generarTirada(1,6);
        tiradaJ1_4=generarTirada(1, 6);
        tiradaJ1_5=generarTirada(1, 6);
        tiradaJ2= generarTirada(1,6);
        tiradaJ2_2=generarTirada(1,6);
        tiradaJ2_3=generarTirada(1,6);
        tiradaJ2_4=generarTirada(1, 6);
        tiradaJ2_5=generarTirada(1, 6);
        System.out.println("Jugador1: "+tiradaJ1+", "+tiradaJ1_2+", "+tiradaJ1_3+", "+tiradaJ1_4+", "+tiradaJ1_5+" Jugador2: "+tiradaJ2+", "+tiradaJ2_2+", "+tiradaJ2_3+", "+tiradaJ2_4+", "+tiradaJ2_5);
    
        System.out.println("Tirada Jugador2 -> " + tiradaJ2 + ", " + tiradaJ2_2 + ", " + tiradaJ2_3 + ", " + tiradaJ2_4);

        if(tiradaJ1 == tiradaJ2 || tiradaJ1 == tiradaJ2_2 || tiradaJ1 == tiradaJ2_3 || tiradaJ1 == tiradaJ2_4) {
            totalJ2++;
        } else {
            totalJ1++;
        }
    }
    System.out.println("Jugador 1 lleva "+ totalJ1);
    System.out.println("Jugador 2 lleva "+ totalJ2);
    System.out.println();
    
    System.out.println("Total de jugador 1 "+totalJ1);
    System.out.println("Total de jugador 2 "+totalJ2);

    } catch (Exception e) {
        System.out.println("Error en el número de tiradas, por favor, escriba un número válido");
    }
    
    }}