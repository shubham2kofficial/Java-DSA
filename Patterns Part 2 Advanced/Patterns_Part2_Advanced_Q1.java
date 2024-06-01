public class Patterns_Part2_Advanced_Q1 {

    public static void hollow_Rectangle(int totRow, int totCol) {

        for (int i = 1; i <= totRow; i++) {
            for (int j = 1; j <= totCol; j++) {
                if (i == 1 || i == totRow || j == 1 || j == totCol) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        hollow_Rectangle(4, 5);

    }

}
