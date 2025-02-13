import java.util.*;

// Program to perform linear search on an array of strings
public class LinearSearchArray {

    // Method to perform linear search
    public static int linearSearch(String menu[], String key) {
        // Loop through the array to find the key
        for (int i = 0; i < menu.length; i++) { // Fixed: Changed `<=` to `<` to avoid ArrayIndexOutOfBoundsException
            if (menu[i].equals(key)) { // Fixed: Use `.equals()` for string comparison instead of `==`
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String args[]) {
        String menu[] = {"dosa", "vada pav", "pav bhaji", "biryani"}; // Array of menu items
        String key = "biryani"; // Key to search for

        // Call the linearSearch method to find the index of the key
        int index = linearSearch(menu, key);

        // Print the result
        if (index == -1) {
            System.out.println("Not available"); // Key not found
        } else {
            System.out.println("Available at index: " + index); // Key found
        }
    }
}