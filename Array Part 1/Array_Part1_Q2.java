public class Array_Part1_Q2 {

    // - Largest in Array
    public static int getLargest(int numbers[]) {

        int largest = Integer.MIN_VALUE; // - Infinity
        int smallest = Integer.MAX_VALUE; // + Infinity

        for (int i = 0; i < numbers.length; i++) {

            if (largest < numbers[i]) {

                largest = numbers[i];
            }

            if (smallest > numbers[i]) {

                smallest = numbers[i];
            }
        }

        System.out.println("Smallest value is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {

        // - Largest in Array

        int numbers[] = { 2, 4, 6, 8, 22, 10, 12, 14, 16, 18, 20 };

        System.out.println("Largest value is : " + getLargest(numbers));

    }

}
