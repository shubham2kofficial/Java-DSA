import java.util.*;
public class While_loop_Q3 {

    public static void main(String[] args) {

        // - Print Sum of First N Natural Numbers

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while(i <= n){
        sum += i;
        i++;
        }
        System.out.println("Sum of First N Natural Numbers is : " + sum);

        
        
    }
    
}
