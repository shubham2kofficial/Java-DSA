public class Arrays_Part2_Q1 {

    // -> Max SubArray Sum - 1 (Brute Force)

    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {

                    currSum += numbers[k];
                }
                System.out.println("curr subArray Sum : " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }

        }
        System.out.println("Max SubArraySum : " + maxSum);
    }

    public static void main(String[] args) {

          // -> Max SubArray Sum - 1 (Brute Force)

        int numbers[] = {2, 4, 6, 8, 10};

        maxSubarraySum(numbers);

    }

}
