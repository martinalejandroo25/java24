public class ejercicio6variante2 {
    public static void main(String[] args) {
        int num=100;
        int suma=0;
        try {
            for (int i = 1; i< num; i+=2) {
                System.out.println(i);
                suma+=i;
            }
            System.out.println();
            System.out.println("La suma de todos los numeros da "+suma);  
        } catch (NumberFormatException e) {
                System.out.println("Ingresa solo números, por favor. "+ e.getMessage());
            }
    }
}