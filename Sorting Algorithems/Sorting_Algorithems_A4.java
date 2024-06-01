import java.util.Arrays;
import java.util.Collections;

public class Sorting_Algorithems_A4 {

    // public static void printArray(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }

    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Integer arr[] = {10, 3, 2, 4, 6, 5, 8, 7, 9, 1};

        //Arrays.sort(arr);
        
       // Arrays.sort(arr, 0, 5);

    //    Arrays.sort(arr, Collections.reverseOrder());

       Arrays.sort(arr, 0, 5, Collections.reverseOrder());
        
        printArray(arr);

        

        
    }
    
}
