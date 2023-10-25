public class Factorial {
    public static void main(String[] args) {
        int num=7;
        double factorial=1;

        for(int i =1; i<=num; i++) {
            factorial=factorial*i;
        }

        System.out.println(factorial);
    }
}
