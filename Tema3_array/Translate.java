package Tema3_array;

import java.util.Arrays;

public class Translate {
    public static String translate(String palabra) {
        String trad= "";
        String espanol[]= {"Perro", "Agua", "Animal", "casa", "hola"
        };
        String ingles[]={"Dog","Water","Animal","house","Hello"};

        int posicion = -1;
        for (int i = 0; i < espanol.length; i++) {
            if(espanol[i]== palabra) {
                posicion = i;
                break;
            }
        }
        
        if (posicion == -1) {
            return "not found";
        } else {
            return ingles[posicion];
        }
        
    }
    public static void main(String[] args) {
       System.out.println();
    }
}
