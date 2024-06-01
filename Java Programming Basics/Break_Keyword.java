import java.util.*;

public class Break_Keyword {
    public static void main(String[] args) {

        // - Question Break keyword

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter Your No. :");
            int n = sc.nextInt();
            System.out.println(n);

            if (n % 10 == 0) {
                break;
            }
        } while (true);
    }

}
