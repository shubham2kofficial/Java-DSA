import java.util.*;

public class Do_While_loopQ1 {

    public static void main(String[] args) {

        // - question - Display all numbers enterd by User except multiple of 10

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter Your Number :");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);
        } while (true);
    }

}
