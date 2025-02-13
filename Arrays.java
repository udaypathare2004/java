// Linear Search implementation in Java
public class Arrays {

  // Method to perform linear search on an array
  public static int linearSearch(int numbers[], int key) {
      // Loop through the array to find the key
      for (int i = 0; i < numbers.length; i++) {
          if (numbers[i] == key) { // Check if the current element matches the key
              return i; // Return the index if the key is found
          }
      }
      return -1; // Return -1 if the key is not found in the array
  }

  public static void main(String[] args) {
      int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16}; // Input array
      int key = 10; // Key to search for

      // Call the linearSearch method to find the index of the key
      int index = linearSearch(numbers, key);

      // Print the result
      if (index != -1) {
          System.out.println("Key is at index: " + index); // Key found
      } else {
          System.out.println("Key not found in the array."); // Key not found
      }
  }
}