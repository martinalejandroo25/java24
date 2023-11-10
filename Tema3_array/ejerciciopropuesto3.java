package Tema3_array;

public class ejerciciopropuesto3 {
    
    
    public static void main(String[] args) {
        /*Lanzamos 5 dados de póker (*, J, Q,K, negro, rojo)Genera tiradas y detecta si ha salido póker(4 iguales) */
        int dados[]=new int[5];
        for (int i = 0; i < dados.length; i++) {
            int resultado= (int)(Math.random()*6)+1;
            switch (resultado) {
                case 1:
                    dados[i]="*";
                    break;
                case 2:
                    dados[i]="J";
                    break;
                case 3:
                    dados[i]="Q";
                    break;
                    case 4:
                    dados[i]="K";
                    break;
                    case 5:
                    dados[i]="negro";
                    break;
                    case 6:
                    dados[i]="rojo";
                    break;

            }
            
        }
        
    }
    public static boolean verificar(int dados){
       int contador[]=new int[6];
       for (String resultado : dados) {
        
       }
        switch () {
            case value:
                
                break;
        
            default:
                break;
        }
    }
}
