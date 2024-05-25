public class FunctionQ4 {
    
     // - Function Overloading using Parameters

    // Func to calculate Sum of 2 nums
    public static int sum(int a, int b) {
        return a + b;
    }

    // Func to calculate Sum of 3 nums

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

          // - Function Overloading

        int sum = sum(5, 5);
        int sum2 = sum(5, 5, 5);

        System.out.println(sum);
        System.out.println(sum2);

        
    }
    
}
