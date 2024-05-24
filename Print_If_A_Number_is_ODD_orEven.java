import java.util.*;

public class Print_If_A_Number_is_ODD_orEven {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any Number :");
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println(a + " is EVEN Number.");
        }
        else{ 
            System.out.println(a + " is ODD Number.");
        }

    }
    
}
