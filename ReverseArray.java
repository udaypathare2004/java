// Program to reverse an array
public class ReverseArray {

    // Method to reverse the elements of an array
    public static void reverseArray(int numbers[]) {
        int first = 0; // Initialize the first index
        int last = numbers.length - 1; // Initialize the last index

        // Swap elements from the start and end of the array until the middle is reached
        while (first < last) {
            // Swap the elements at the first and last indices
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            // Move the first index forward and the last index backward
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10}; // Input array

        // Call the reverseArray method to reverse the array
        reverseArray(numbers);

        // Print the reversed array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Print a new line for better formatting
    }
}