

public class pdfrepaso2 {
    public static void main(String[] args) {
        int num[]=new int[100];
        int pares[]=new int[50];
        int impares[]=new int[50];
        int contador=0;
        int contador2=0;
        for (int i = 0; i < num.length; i++) {
            num[i]=i+1;
            if (num[i]%2 == 0) {
                pares[contador]= num[i];
                contador++;
                System.out.println(num[i]+" Es par");
            }
            if (num[i]%2!=0) {
                impares[contador2]=num[i];
                contador2++;
                System.out.println(num[i]+" Es impar");
            }
        }
        for (int i = 0; i < pares.length; i++) {
            if (num[i]%2 == 0) {
                contador++;
                System.out.println(num[i]+ " Es par");
            }
        }
        for (int i = 0; i < impares.length; i++) {
            if (num[i]%2 != 0) {
                System.out.println(num[i]+" Es impar");
            }
        }

    }
}
