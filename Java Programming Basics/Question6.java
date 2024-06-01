import java.util.*;
public class Question6 {
    public static void main(String[] args) {
           
        
        // Write a program to print the multiplication table of a number N, entered by the user.
        
                 

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your Number :");
         int n = sc.nextInt();
         int multiple;

         for(int i=1; i<=10; i++){

             multiple = n*i;

            System.out.println(n + "x" + i + "=" + multiple);
         }
         System.out.println();

    }
    
}
