public class Find_Factorial_Of_N {

    // Recursive method to calculate factorial of a number n
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: calculate factorial of (n-1)
        int fnm1 = factorial(n - 1);
        // Multiply the current number n with the factorial of (n-1)
        int fn = n * fnm1;
        // Return the calculated factorial
        return fn;
    }

    public static void main(String[] args) {
        int n = 5; // Initialize n to 5
        // Call the factorial method and print the result
        System.out.println(factorial(n));
    }
}
