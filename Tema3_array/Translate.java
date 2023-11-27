package Tema3_array;



public class Translate {
    public static String translate(String palabra) {
        String espanol[]= {"Perro", "Agua", "gato", "casa", "hola", "adios", "ella", "el", "solo" };
        String ingles[]={"Dog","Water","cat","house","Hello","goodbye", "she", "he", "alone"};
        
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

