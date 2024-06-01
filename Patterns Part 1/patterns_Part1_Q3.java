public class patterns_Part1_Q3 {

    public static void main(String[] args) {

        // - Print Half Pyramid Pattern

        int n = 5;
       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
