public class Array_Is_SortedOrNot {

    // Recursive method to check if the array is sorted
    public static boolean isSorted(int arr[], int i) {
        // Base case: if we've reached the last element, the array is sorted
        if (i == arr.length - 1) {
            return true;
        }

        // If the current element is greater than the next one, the array is not sorted
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Recursively check the rest of the array
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; // Initialize the array
        // Call the isSorted method and print the result
        System.out.println(isSorted(arr, 0)); // Output should be true as the array is sorted
    }
}
