public class Array_Part1_Q6 {

    // - Print Subarrays

    public static void printSubarrays(int numbers[]) {

        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }

        }
        System.out.println("Total Number of Subarray is :" + ts);
    }

    public static void main(String[] args) {

        // - Print Subarrays
       
        
        int numbers[] = { 2, 4, 6, 8, 9, 10 };

        printSubarrays(numbers);

    }

}
