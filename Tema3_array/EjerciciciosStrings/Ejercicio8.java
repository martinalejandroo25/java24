package EjerciciciosStrings;

public class Ejercicio8 {
    /*Divide la cadena “http://www.iesjaroso.es/noticias” en “http”, “www.iesjaroso.es”, “noticias”. */
    public static void main(String[] args) {
        StringBuffer cadena = new StringBuffer("http://www.iesjaroso.es/noticias");

        cadena.replace(cadena.indexOf(":"), cadena.indexOf(":")+1," ");

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '/') {
                cadena.deleteCharAt(i);
                cadena.insert(i, " ");
            }    
            
        }
        System.out.println(cadena);
    }
}
