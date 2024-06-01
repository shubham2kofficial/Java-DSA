public class Array_Part1_Q5 {

    // - Pairs in Array

    public static void pairsInArray(int numbers[]) {

        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        // - Pairs in Array

        int numbers[] = { 2, 4, 6, 8, 9, 10 };

        pairsInArray(numbers);
    }

}
