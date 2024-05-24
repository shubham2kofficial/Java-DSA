import java.util.*;

public class Check_Prime {

    public static void main(String[] args) {

        // - Question - Check if a Number is Prime or Not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n == 2) {
            System.out.println(n + " is Prime Number");
        } else {

            for (int i = 2; i <= (n - 1); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println(n + " is Prime Number");
            } else {
                System.out.println(n + " is not Prime Number");
            }

        }
    }

}
