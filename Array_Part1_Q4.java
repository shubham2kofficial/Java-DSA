public class Array_Part1_Q4 {

    // - Reverse an array

    public static void ReverseArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            // swap

            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {

        //- Reverse an array

        int numbers[] = { 2, 4, 6, 8, 9, 10, 12, 14, 16, 18, 20 };

        ReverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

       

    }
}
