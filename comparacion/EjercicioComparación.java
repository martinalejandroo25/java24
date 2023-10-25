public class EjercicioComparación {

    public static void main(String[] args) 
    {
        Double temperatura, humedad;
        temperatura = 20.4;
        humedad = 0.66;
        
                //1.Escribe una condición que diga si la temperatura es mayor que 18
                        System.out.println(temperatura > 18);
                //2.Escribe una condición que diga si la temperatura es menor o igual que 21
                        System.out.println(temperatura <= 21);
                //3.Escribe una condición que diga si la humedad es igual al 66%
                        System.out.println(humedad == 0.66);
                //4.Escribe una condición que diga si la humedad no es igual al 66%
                        System.out.println(humedad != 0.66);
                //5.Escribe una condición que diga si la temperatura está entre 20 y 25 grados
                        System.out.println(temperatura > 20 && temperatura < 25);
                //6.Escribe una condición que diga si la temperatura está entre 20 y 25, y la humedad es mayor del 50%
                        System.out.println(temperatura > 20 && temperatura < 25 && humedad > 0.5);
                //7.Escribe una condición que diga si la temperatura es menor de 30 o la humedad es mayor de 70%
                        System.out.println(temperatura < 30 || humedad > 0.7);
    }


}
