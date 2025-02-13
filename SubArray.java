import java.util.*;

// Program to print all possible subarrays of an array
public class SubArray {

    // Method to print all subarrays of the array
    public static void printSubarray(int numbers[]) {
        // Outer loop to pick the starting point of the subarray
        for (int i = 0; i < numbers.length; i++) {
            int start = i; // Starting index of the subarray

            // Middle loop to pick the ending point of the subarray
            for (int j = i; j < numbers.length; j++) {
                int end = j; // Ending index of the subarray

                // Inner loop to print the subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " "); // Print each element of the subarray
                }
                System.out.println(); // Move to the next line after printing a subarray
            }
        }
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10}; // Input array

        // Call the method to print all subarrays
        printSubarray(numbers);
    }
}