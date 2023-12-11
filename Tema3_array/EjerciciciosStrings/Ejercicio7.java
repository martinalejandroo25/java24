package EjerciciciosStrings;

public class Ejercicio7 {
    /*Cuenta las vocales del texto “Me gusta programar en Java los sábados por la mañana” */
    public static void main(String[] args) {
        String cadena = "Me gusta programar en Java los sábados por la mañana";
        int conta=0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'|| cadena.charAt(i) == 'u'||cadena.charAt(i) == 'á') {
                conta++;
            }
        }
        System.out.println("En la frase hay un total de "+conta+" vocales");
    }
}
