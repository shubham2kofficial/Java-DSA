public class Print_Nth_Fibonacci_Number {

    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base case: if n is 0 or 1, return n (the first two Fibonacci numbers)
        if (n == 0 || n == 1) {
            return n;
        }

        // Recursive case: calculate the (n-1)th and (n-2)th Fibonacci numbers
        int fnm1 = fibonacci(n - 1); // (n-1)th Fibonacci number
        int fnm2 = fibonacci(n - 2); // (n-2)th Fibonacci number
        
        // The nth Fibonacci number is the sum of the (n-1)th and (n-2)th numbers
        int fibN = fnm1 + fnm2;
        
        return fibN; // Return the calculated nth Fibonacci number
    }

    public static void main(String[] args) {
        int n = 5; // Initialize n to 5
        // Call the fibonacci method and print the result
        System.out.println(fibonacci(n));
    }
}
