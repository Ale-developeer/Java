public class fizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            var divisibleBytres = i % 3 == 0;
            var divisibleBycinco = i % 5 == 0;
            if ( divisibleBytres && divisibleBycinco) {
                System.out.println("fizzbuzz ");
            } else if (divisibleBytres) {
                System.out.println("fizz ");
            } else if (divisibleBycinco) {
                System.out.println("buzz ");
            } else {
                System.out.println(i);
            }

        }
    }
}
