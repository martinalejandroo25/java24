package Tema3_array;

public class arrays1 {
    public static int generarNumero(int min, int max){
        if (min>max){
        }
        return (int) ((Math.random()*(max-min+1)+min));
        
    }
    public static void main(String[] args) {
        int notas[]= new int[10]; //decalra array y di tamaño
        notas[2]=5;
        System.out.print((notas[2])+" ");

        for (int i = 0; i <9; i++) {
        notas[i]=generarNumero(1,10);
    }/*
    for (int i = 0; i <9; i++) {
        System.out.print(notas[i]+" ");
    } */
    System.out.println();
    for (int i = 9; i>=0; i--) {
        System.out.print(notas[i]+" ");
    }



    }
}
