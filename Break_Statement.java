public class Break_Statement {

    public static void main(String[] args) {

        // - Break Statement

        for (int i = 1; i <= 5; i++) {

            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the Loop.");

    }
}
