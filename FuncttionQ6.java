

public class FuncttionQ6 {

    // - Check if A number is Prime or Not Prime

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

    public static void main(String[] args) {

        
        // - Check if A number is Prime or Not Prime

        System.out.println(isPrime(50));

    }

}
