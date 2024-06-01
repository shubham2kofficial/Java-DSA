import java.util.*;

public class Ternary_Operator {

    public static void main(String[] args) {

         int number = 5;

        String type = ((number % 2 == 0))? "Even" : "Odd";
        
        System.out.println(type);

        // - Check if a Student will Pass or Fail

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter yor msrks :");
        int marks = sc.nextInt();
        
         String status = ((marks >= 33))? "Pass" : "Fail";

         System.out.println(status);
        
    }
    
}
