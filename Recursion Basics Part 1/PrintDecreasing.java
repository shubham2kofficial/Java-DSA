public class PrintDecreasing {

    // Method to print numbers in decreasing order starting from n
    public static void printDec(int n) {
        // Base case: if n is 1, print n and return to stop further recursion
        if (n == 1) {
            System.out.println(n); // Print the last number 1 and move to a new line
            return; // End the recursion
        }
        // Print the current value of n followed by a space
        System.out.print(n + " ");
        // Recursive call: call printDec with n-1 to print the next number
        printDec(n - 1);
    }

    public static void main(String[] args) {
        int n = 10; // Initialize n to 10
        printDec(n); // Start the recursion to print numbers from 10 to 1
    }
}
