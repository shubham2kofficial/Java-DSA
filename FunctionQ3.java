public class FunctionQ3 {
    
    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {

            f = f * i;

        }

        return f;
    }
    
    public static int binomialCoefficient(int n, int r) {

        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n - r);

        int binoCoeffi = n_fact / (r_fact * nmr_fact);

        return binoCoeffi;
    }
    public static void main(String[] args) {

        // - Binomial Coefficient

        System.out.println(binomialCoefficient(5, 2));

        
    }
    
}
