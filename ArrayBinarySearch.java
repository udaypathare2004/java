public class ArrayBinarySearch {
  // Method to perform binary search on a sorted array
  public static int binarySearch(int numbers[], int key) {
      int start = 0, end = numbers.length - 1; // Initialize start and end pointers

      while (start <= end) { // Continue searching while the search space is valid
          int mid = (start + end) / 2; // Calculate the middle index

          // Check if the middle element is the key
          if (numbers[mid] == key) { // Key found
              return mid;
          } else if (numbers[mid] < key) { // If key is greater, search the right half
              start = mid + 1;
          } else { // If key is smaller, search the left half
              end = mid - 1;
          }
      }
      return -1; // Key not found
  }

  public static void main(String[] args) {
      int numbers[] = {2, 4, 6, 8, 10}; // Sorted array
      System.out.println(binarySearch(numbers, 6)); // Search for key 6 and print the result
  }
}