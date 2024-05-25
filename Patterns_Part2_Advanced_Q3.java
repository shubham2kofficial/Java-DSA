public class Patterns_Part2_Advanced_Q3 {

    public static void inverted_Half_Pyramid_withNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        inverted_Half_Pyramid_withNumbers(10);
    }

}
