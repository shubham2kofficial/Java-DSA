import java.util.*;
public class While_loop_Q2 {

    public static void main(String[] args) {
       
        // - Print Number from 1 to N

        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();

        int counter = 1;

        while(counter <= range){
        System.out.print(counter + " ");
        counter ++;
        }
        System.out.println();
    }
    
}
