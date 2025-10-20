/**
 * This class provides an implementation of the Binary Search algorithm.
 */
public class BinarySearch {
    /**
     * Performs a binary search on a sorted array to find the index of a given key.
     *
     * @param numbers The sorted array to be searched.
     * @param key The value to search for.
     * @return The index of the key if found; otherwise, -1.
     */
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        // Loop until the start pointer crosses the end pointer.
        while (start <= end) {
            // Calculate the middle index to avoid potential integer overflow.
            int mid = start + ((end - start) / 2);

            // Check if the key is present at mid.
            if (numbers[mid] == key) {
                return mid; // Key found, return its index.
            } 
            // If the key is greater, ignore the left half.
            else if (numbers[mid] < key) {
                start = mid + 1;
            } 
            // If the key is smaller, ignore the right half.
            else {
                end = mid - 1;
            }
        }
        // Key was not found in the array.
        return -1;
    }

    /**
     * The main method to test the binarySearch functionality.
     */
    public static void main(String[] args) {
        // A sorted array for demonstration.
        int numbers[] = { 1, 2, 3, 4, 5 };
        int key = 7; // The key to search for.

        // Call the binary search method.
        int index = binarySearch(numbers, key);

        // Print the result.
        System.out.println(index == -1 ? "NOT FOUND!" : "The Key is at index:" + index);
    }
}