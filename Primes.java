public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) System.out.print(i+ " ");
        }
    }

    public static boolean isPrime(int n) {
        boolean a = true;
        for (int i = 2; i < (n - 1); i++) {
            if ((n % i) == 0) {
                a = false;
            }
        }
        return a;
    }

}