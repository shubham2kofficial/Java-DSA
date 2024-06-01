public class patterns_Part1_Q1 {

    public static void main(String[] args) {

        // - Intro to Nested Loops (Star Pattern)
        
        int n = 5;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

}
