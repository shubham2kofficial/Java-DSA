import java.util.*;

public class Question1 {

    public static void main(String[] args) {

        
          /* -> Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers. */
          
         

        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter your Number : ");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.println("Do you want to Continue press 1 or Not continue press 0 ");

            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of Even Numbers :" + evenSum);
        System.out.println("Sum of Odd Numbers :" + oddSum);

    }

}
