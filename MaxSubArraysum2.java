import java.util.*; // Importing utility package

public class MaxSubArraysum2 {
    // Function to find the maximum subarray sum using Kadane’s Algorithm
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE; // Stores the maximum sum found so far
        int cs = 0; // Stores the current subarray sum
        int maxElement = Integer.MIN_VALUE; // Stores the maximum element for handling all-negative cases
        
        // Loop through each element in the array
        for (int num : numbers) {
            cs += num; // Add the current element to the current sum
            maxElement = Math.max(maxElement, num); // Track the maximum element
            
            // If current sum becomes negative, reset it to zero (Kadane's key idea)
            if (cs < 0) {
                cs = 0;
            }
            
            // Update the maximum sum found so far
            ms = Math.max(cs, ms);
        }

        // If all elements are negative, return the maximum single element instead of 0
        if (ms == 0) {
            ms = maxElement;
        }

        // Print the maximum subarray sum
        System.out.println("Maximum subarray sum: " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = {2, -3, 4, -1, -2, 1, 5, -3}; // Example input array
        kadanes(numbers); // Call the Kadane’s Algorithm function
    }
}
