package Excepciones;

public class ejemploexcepcion {
    public static void main(String[] args) {
        int numero=38;
        try {
            numero=numero/0;
        } catch (Exception e) {
            System.out.println("no es posible la division" + e.getMessage());
        }
        
        System.out.println("El programa continua");
    }
}
