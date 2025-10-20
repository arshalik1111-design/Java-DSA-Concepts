/**
 * This class provides a method to print all contiguous subarrays of a given array.
 */
public class SubArrays {

    /**
     * Prints all possible contiguous subarrays of an integer array and counts them.
     *
     * @param numbers The input array of integers.
     */
    public static void printSubArrays(int numbers[]) {

        int totalSubArrays = 0;

        // Outer loop to select the starting point of the subarray.
        for (int i = 0; i < numbers.length; i++) {

            // Middle loop to select the ending point of the subarray.
            for (int j = i; j < numbers.length; j++) {
                System.out.print("[");

                // Inner loop to print the elements of the subarray from start (i) to end (j).
                for (int k = i; k <= j; k++) {

                    System.out.print(numbers[k]);

                    // Add a comma if it's not the last element in the subarray.
                    if (k < j) {
                        System.out.print(",");
                    }
                }
                System.out.print("]");
                System.out.println(); // Move to the next line for the next subarray.
                totalSubArrays++;
            }
            System.out.println(); // Add a blank line after all subarrays starting at index i.
        }
        System.out.println("Total SubArrays are: " + totalSubArrays);
    }

    /**
     * The main method to test the printSubArrays functionality.
     */
    public static void main(String[] args) {

        int numbers[] = { 2, 4, 6, 8, 10 };

        printSubArrays(numbers);
    }
}
