package Tema3_array.EjerciciosArraysMatricespdf;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9_incompleto {
    /*Realizar un programa que lea los tiempos en los que de 10 corredores han acabado una carrera. ---
    El programa debe determinar qué corredores tienen el primer, segundo y último puesto, ---
    así como cuál es el tiempo medio en que se ha corrido la carrera. 
    Pista: ordénalo antes. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String corredor[]={"primero", "segundo", "tercer", "cuarto", "quinto","sexto", "septimo", "octavo", "noveno", "decimo"};
        int tiempo[] = new int[10];
        
        for (int i = 0; i < tiempo.length; i++) {
            System.out.println("Dime el tiempo del "+corredor[i]+" corredor");
            tiempo[i] = Integer.parseInt(sc.nextLine());        
        }
        Arrays.sort(tiempo);

        System.out.println(Arrays.toString(args));
        int puesto1 = tiempo[0];
        int puesto2 = tiempo[1];
        int puestoUlt = tiempo[tiempo.length - 1];

            //calcular media
        int sumaTiempos = 0;
        for (int t : tiempo) {
            sumaTiempos += t;
        }
        double tiempoMedio = (double) sumaTiempos / tiempo.length;

        tiempoMedio = Math.round(tiempoMedio * 100.0) / 100.0;
        

        System.out.println("El primer puesto es para el "+corredor[Arrays.asList(tiempo).indexOf(puesto1)]);
        System.out.println("El segundo puesto es para el "+corredor[Arrays.asList(tiempo).indexOf(puesto2)]);
        System.out.println("El Último puesto es para el "+corredor[Arrays.asList(tiempo).indexOf(puestoUlt)]);
        System.out.println("Tiempo medio de la carrera: "+tiempoMedio);

        sc.close();
        }
        
}
