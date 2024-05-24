public class While_loop_Q4 {

    public static void main(String[] args) {

        // - print Reverse of a Number

        int n = 123456789;

        while (n > 0) {
            int lastdigit = n % 10;

            System.out.print(lastdigit);

            n /= 10;

        }
        System.out.println();
    }

}
