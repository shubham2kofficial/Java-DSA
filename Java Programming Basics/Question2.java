import java.util.*;

public class Question2 {

    public static void main(String[] args) {
         
  // Question 3 : Write a program to find the factorial of any number entered by the user.
         
          

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact *= i;
        }

        System.out.println("Factorial of given Numbers is : " + fact);

    }

}
