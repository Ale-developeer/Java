public class Fibonacci{
    public static void main(String[] args) {
        int n0=0;
        int n1=1;
        int fib=0;
        while (fib <= 50){
            System.out.println(n0);
            fib = n0 + n1;
            n0 = n1;
            n1 = fib;

        }
    }
}
