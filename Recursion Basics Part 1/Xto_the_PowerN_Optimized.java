public class Xto_the_PowerN_Optimized {

    // Recursive method to calculate x to the power of n in an optimized manner
    public static int optimizedPower(int x, int n) {
        // Base case: if n is 0, return 1 (any number to the power of 0 is 1)
        if (n == 0) {
            return 1;
        }

        // Recursive case: calculate half power
        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSquared = halfPower * halfPower;

        // If n is odd, multiply by x to account for the extra factor
        if (n % 2 != 0) {
            halfPowerSquared = x * halfPowerSquared;
        }

        return halfPowerSquared;
    }

    public static void main(String[] args) {
        int x = 2; // Base
        int n = 5; // Exponent

        // Print the result of 2 raised to the power of 5
        System.out.println(optimizedPower(x, n)); // Output should be 32
    }
}
