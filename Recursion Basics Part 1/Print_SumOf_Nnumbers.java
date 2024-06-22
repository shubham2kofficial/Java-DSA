public class Print_SumOf_Nnumbers {

    // Recursive method to calculate the sum of first n natural numbers
    public static int printSum(int n) {
        // Base case: if n is 1, the sum of the first 1 number is 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: calculate the sum of the first (n-1) numbers
        int nm1 = printSum(n - 1);
        // Add the current number n to the sum of the first (n-1) numbers
        int sum = n + nm1;
        return sum;
    }

    public static void main(String[] args) {
        int n = 5; // Initialize n to 5
        // Call the printSum method and print the result
        System.out.println(printSum(n));
    }
}
