public class Patterns_Part2_Advanced_Q4 {

    public static void floyds_Triangle_Pattern(int n) {
        int counter = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        floyds_Triangle_Pattern(10);

    }

}
