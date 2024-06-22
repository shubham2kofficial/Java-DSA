public class First_Occurrence {

    // Recursive method to find the first occurrence of a key in the array
    public static int firstOccurrence(int arr[], int key, int i) {
        // Base case: if we have checked all elements, return -1 (key not found)
        if (i == arr.length) {
            return -1;
        }

        // If the current element is the key, return the current index
        if (arr[i] == key) {
            return i;
        }

        // Recursively check the next element in the array
        return firstOccurrence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 7, 8, 10, 11}; // Initialize the array
        
        
        // Call the firstOccurrence method and print the result
       System.out.println(firstOccurrence(arr, 11, 0)); 
       // Output should be 10 as 11 is at index 10
    }
}
