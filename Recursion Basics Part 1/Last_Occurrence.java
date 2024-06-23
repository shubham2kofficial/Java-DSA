public class Last_Occurrence {

    // Recursive method to find the last occurrence of a key in the array
    public static int lastOccurrence(int arr[], int key, int i) {
        // Base case: if we've checked all elements, return -1 (key not found)
        if (i == arr.length) {
            return -1;
        }

        // Recursively find the last occurrence in the rest of the array
        int isFound = lastOccurrence(arr, key, i + 1);

        // If the key is found in the rest of the array, return its index
        if (isFound != -1) {
            return isFound;
        }

        // If the current element is the key, return the current index
        if (arr[i] == key) {
            return i;
        }

        // If the key is not found in the rest of the array or the current element, return -1
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 5, 5, 5 }; // Initialize the array
        // Call the lastOccurrence method and print the result
        System.out.println(lastOccurrence(arr, 5, 0)); 
        // Output should be 4 as the last 5 is at index 4
    }
}
