public class Sorting_Algorithems_A2 {

    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    // Main method to test the selection sort
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 7, 1, 9, 8, 10};

        System.out.println("Original array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);

       
    }
}
