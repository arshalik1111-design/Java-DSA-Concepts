import java.util.*;

/**
 * This class contains functionality to reverse an array.
 * The commented-out code is a valid implementation for reversing an array.
 */
class Solution { // Note: For many platforms, this class should be named 'Main'
    /**
     * Reverses the given array in-place.
     *
     * @param numbers The array to be reversed.
     */
    public static void Reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        
        // Swap elements from the start and end of the array until the pointers meet.
        while (first < last) {
            // Swap numbers[first] and numbers[last]
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            // Move the pointers towards the center.
            first++;
            last--;
        }
    }

    /**
     * The main method to read an array from the user, reverse it, and print the result.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Call the method to reverse the array.
        Reverse(numbers);

        System.out.println("Reversed array:");
        // Print the reversed array elements.
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Add a newline for clean output.

        sc.close();
    }
}