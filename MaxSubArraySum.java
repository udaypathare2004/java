// Program to find the maximum sum of all possible subarrays in an array
import java.util.*; // Importing the utility package

public class MaxSubArraySum {

    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0; // Variable to store the sum of the current subarray
        int maxSum = Integer.MIN_VALUE; // Variable to store the maximum sum found (initialized to the smallest possible integer value)

        // Outer loop to pick the starting point of the subarray
        for (int i = 0; i < numbers.length; i++) {
            int start = i; // Starting index of the subarray

            // Middle loop to pick the ending point of the subarray
            for (int j = i; j < numbers.length; j++) {
                int end = j; // Ending index of the subarray
                currSum = 0; // Reset currSum for the new subarray

                // Inner loop to calculate the sum of the current subarray
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k]; // Add the current element to currSum
                }

                System.out.println(currSum); // Print the sum of the current subarray

                // Update maxSum if the current subarray sum is greater
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        // Print the maximum sum of all subarrays
        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10}; // Input array
        maxSubarraySum(numbers); // Call the method to find the maximum subarray sum
    }
}