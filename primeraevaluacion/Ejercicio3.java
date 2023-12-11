package java24.primeraevaluacion;
import java.util.Scanner;


public class Ejercicio3 {
    /*Vamos a implementar funciones para usar Morse. En primer lugar, te pongo la 
    equivalencia de las letras a caracteres Morse. 

    Tienes que implementar una función convertirAMorse que reciba como 
    parámetro una cadena de texto en español y devolver un String con la 
    misma cadena, pero traducida a Morse. Los espacios entre palabras ponlos 
    con el carácter “#”.  Cada letra Morse la separaremos por un espacio. 
    Pruébala. Ej: “hola mundo”  “.... --- .-.. .-#-- ..- -. -.. ---“ 


    Ahora vas a realizar una función que haga lo contrario convertirDeMorse 
    que reciba una cadena con un texto en Morse, las palabras separadas por el 
    carácter “#” y debes pintar el texto original en español. Además, para leer 
    bien cada letra Morse, irá separada por un espacio. 

    Recuerda que puedes usar indexOf pasándole un segundo parámetro que te 
    diga a partir de donde buscar. Intenta hacer el ejercicio al principio solo con 
    una palabra, y cuando lo tengas prueba a hacerlo con más de una palabra.

    Pista: para la equivalencia construye dos arrays de Strings, uno con las letras 
    y otro con las traducciones a Morse. Al estar en la misma posición, tienes la 
    traducción. Como un diccionario. */
    
    //busca los carácteres que conforman el String
    public static int busqueda(char caracter, char arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (caracter == arr[i]) {
                return i;
            }
        }return -1; //si no está en el array el carácter
    }
    public static String traductor(String palabra, char[] abecedario, String[] morse) {
        StringBuffer traducido = new StringBuffer();
        for (int i = 0; i < palabra.length(); i++) {
            char car = palabra.charAt(i);
            if (Character.isLetter(car)) {
                int ind = busqueda(car, abecedario);
                
                if (ind != -1 && ind < morse.length) { //si no está en en el diccionario, añade un espacio
                    traducido.append(morse[ind]).append(" "); 
                }else{
                    traducido.append(" ");
                }
            }
        } return traducido.toString();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Diccionario abecedario y su significado en morse
        char abecedario[]= {'a', 'b', 'c','d','e','f','g','h','i', 'j','k', 'l', 'm', 'n', 'o','p','q','r','s','t','u','v','w','x','y','z'};
        String morse[]= {".-","-...","-.-.","-..", ".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---", ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        System.out.println("ingresa cadena a traducir");

        String cadena = sc.nextLine();
        String cadenaminus = cadena.toLowerCase(); //pasar a minusculas para que no haya error de lectura 
        
        String traducido = traductor(cadenaminus, abecedario, morse);        //llama a la funcion para traducir
        System.out.println("a Morse es :"+traducido);    
        sc.close();

            
        }
        
    }

