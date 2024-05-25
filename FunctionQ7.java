public class FunctionQ7 {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
    
        for (int i = 2; i <= (n - 1); i++) {
            if (n % i == 0) {
                return false;
            }
        }
    
        return true;
    }
    // - Primes in Range

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // - Primes in Range
        primesInRange(50);

        primesInRange(100);
    }

}
