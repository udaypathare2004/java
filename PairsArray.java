// Program to print all possible pairs in an array
public class PairsArray {

  // Method to print all pairs of elements in the array
  public static void pairsOfArray(int numbers[]) {
      // Outer loop to pick the first element of the pair
      for (int i = 0; i < numbers.length; i++) {
          int curr = numbers[i]; // Current element as the first element of the pair

          // Inner loop to pick the second element of the pair
          for (int j = i + 1; j < numbers.length; j++) {
              // Print the pair (current element, next element)
              System.out.print("(" + curr + ", " + numbers[j] + ") ");
          }
          System.out.println(); // Move to the next line after printing all pairs for the current element
      }
  }

  public static void main(String args[]) {
      int numbers[] = {2, 3, 4, 5, 6, 7, 8}; // Input array

      // Call the method to print all pairs
      pairsOfArray(numbers);
  }
}