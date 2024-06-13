import java.util.*;

public class CheckIf_oddOrEven {

    public static void oddOrEven(int n) {
        int bitmask = 1;

        if ((n & bitmask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("odd Nuber");
        }
    }0
    

   public static void main(String[] args) {

        oddOrEven(5);
        oddOrEven(10);
        oddOrEven(15);

        

    }

}
