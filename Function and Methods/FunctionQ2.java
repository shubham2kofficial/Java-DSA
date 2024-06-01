
import java.util.*;

public class FunctionQ2 {
    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {

            f = f * i;

        }

        return f;
    }
    public static void main(String[] args) {

         // - Find Factorial

        int n = 5;

        int factorial = factorial(n);

        System.err.println(factorial);
        
    }
    
}
