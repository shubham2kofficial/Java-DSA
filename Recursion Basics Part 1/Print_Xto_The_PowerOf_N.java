

public class Print_Xto_The_PowerOf_N {
    // Recursive method to calculate x to the power of n
    public static int power(int x, int n){
         // Base case: if n is 0, return 1 (any number to the power of 0 is 1)
        if(n == 0){
            return 1;
        }
        // Recursive case: calculate x to the power of (n-1) and multiply it by x
        // int Xnm1 = power(x, n-1);
        // int Xn = x * Xnm1;
        // return Xn;

        return x * power(x, n-1);
    }
    public static void main(String[] args) {

        System.out.println(power(2, 10));
           
    }
    
}
