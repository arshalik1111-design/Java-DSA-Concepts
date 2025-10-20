// import java.util.*;

/**
 * A class containing various utility methods for operating on integer arrays.
 * Note: Naming this class 'Arrays' can cause a name conflict with the standard 'java.util.Arrays' utility class.
 * It's generally better to choose a more specific name.
 */
public class Arrays {

    /**
     * Performs a linear search to find the index of a key in an array.
     * @param numbers The array to search through.
     * @param key The value to search for.
     * @return The index of the key if found; otherwise, -1.
     */
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i; // Key found, return its index.
            }
        }
        return -1; // Key not found in the array.
    }

    /**
     * Finds the largest element in an integer array.
     * @param numbers The array to search through.
     * @return The largest integer in the array.
     */
    public static int largest(int numbers[]) {
        // Initialize largest with the smallest possible integer value.
        int largest = Integer.MIN_VALUE; 
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i]; // Update largest if a bigger number is found.
            }
        }
        return largest;
    }

    /**
     * Finds the smallest element in an integer array.
     * @param numbers The array to search through.
     * @return The smallest integer in the array.
     */
    public static int smallest(int numbers[]) {
        // Initialize smallest with the largest possible integer value.
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i]; // Update smallest if a smaller number is found.
            }
        }
        return smallest;
    }

    /**
     * Performs a binary search on a sorted array to find the index of a key.
     * @param numbers The sorted array to search through.
     * @param key The value to search for.
     * @return The index of the key if found; otherwise, -1.
     */
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            // Calculate mid to avoid potential overflow for large start/end values.
            int mid = start + (end - start) / 2; 

            // Case 1: Key is found at mid.
            if (numbers[mid] == key) {
                return mid;
            }

            // Case 2: Key might be in the right half.
            if (numbers[mid] < key) {
                start = mid + 1;
            } 
            // Case 3: Key might be in the left half.
            else {
                end = mid - 1;
            }
        }
        return -1; // Key not found in the array.
    }

    /**
     * The main method to test the array utility functions.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // The array must be sorted for binary search to work correctly.
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 4;

        // Perform binary search and print the result.
        int index = binarySearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found.");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}

