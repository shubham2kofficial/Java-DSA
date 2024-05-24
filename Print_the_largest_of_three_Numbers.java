import java.util.*;

public class Print_the_largest_of_three_Numbers {

    public static void main(String[] args) {
        
        
        // - Print the largest of three Numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number A : ");
        int A = sc.nextInt();
        
        System.out.println("Enter Number B : ");
        int B = sc.nextInt();

        System.out.println("Enter Number C : ");
        int C = sc.nextInt();

        if(( A >= B) && (A >= C)){
            System.out.println("Largest is A");
        }
        else if(B >= C){
            System.out.println("Largrst is B");
        }
        else{
            System.out.println("Largest is C");
        }

    }
    
}
