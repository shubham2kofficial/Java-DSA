public class Patterns_Part2_Advanced_Q2 {
    
    public static void inverted_And_Rotated_Half_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {

         inverted_And_Rotated_Half_Pyramid(10);

        
        
    }
    
}
