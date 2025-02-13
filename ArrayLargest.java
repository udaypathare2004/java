import java.util.*;

public class ArrayLargest {

    // Method to find the largest and smallest numbers in an array
    public static int getLargest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // Initialize smallest with the maximum possible integer value
        int largest = Integer.MIN_VALUE;  // Initialize largest with the minimum possible integer value

        // Loop through the array to find the largest and smallest numbers
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (largest < numbers[i]) { // Check if the current element is greater than the current largest
                largest = numbers[i];  // Update largest
            }
            if (smallest > numbers[i]) { // Check if the current element is smaller than the current smallest
                smallest = numbers[i];   // Update smallest
            }
        }

        // Print the smallest number found
        System.out.println("Smallest is: " + smallest);

        // Return the largest number found
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 7, 9, 10}; // Input array
        // Call the method to find the largest number and print it
        System.out.println("Largest number is: " + getLargest(numbers));
    }
}