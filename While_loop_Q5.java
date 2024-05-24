import java.util.*;

public class While_loop_Q5 {

    public static void main(String[] args) {

        // - Reverse the Given Number

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int Reverse = 0;

        while (n > 0) {
            int lastdigit = n % 10;

            Reverse = (Reverse * 10) + lastdigit;

            n /= 10;
        }

        System.out.println(Reverse);

    }

}
