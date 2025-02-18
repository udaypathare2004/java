public class BubbleSort {
    public static void bubblesort(int arr[]) {
        // Outer loop for passes
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Swap if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printarr(int arr[]) {
        // Print array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2}; // Input array

        // Sorting logic: Repeatedly compares and swaps adjacent elements
        // until the array is sorted in ascending order.
        bubblesort(arr);

        printarr(arr); // Print sorted array
    }
}
