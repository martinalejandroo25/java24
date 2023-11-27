package EjerciciosRepasoTema2;
public class ejercicio12 {
    public static int generarTirada(int min, int max) throws Exception {
            if (min>max){
                throw new Exception ("El valor mínimo no puede ser mayor al  máximo");
            }
            return (int) ((Math.random()*(max-min+1)+min));
        
        }
    public static void main(String[] args) throws Exception {
        
        int tirada1, tirada2, tirada3;
        int contador=0;
        do {
            tirada1=generarTirada(1, 6);
            tirada2=generarTirada(1, 6);
            tirada3=generarTirada(1,6);
            contador++;
            
        } while (!(tirada1 ==tirada2 && tirada1==tirada3 && tirada2==tirada3)); {
            }   
        System.out.println("tirada:"+ tirada1+", " +tirada2+", "+tirada3);
        System.out.println("intentos: "+contador);
    }
}
