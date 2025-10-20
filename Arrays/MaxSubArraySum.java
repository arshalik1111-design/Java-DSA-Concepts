/**
 * This class finds the maximum sum of a contiguous subarray using a brute-force approach.
 */
public class MaxSubArraySum {
    /**
     * Calculates and prints all subarrays and finds the maximum subarray sum.
     *
     * @param numbers The input array of integers.
     */
    public static void maxSum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer value.

        // Outer loop to pick the starting element of the subarray.
        for (int start = 0; start < numbers.length; start++) {
            // Middle loop to pick the ending element of the subarray.
            for (int end = start; end < numbers.length; end++) {
                int currentSum = 0; // Sum of the current subarray.
                
                // Inner loop to calculate the sum of the subarray from start to end.
                for (int k = start; k <= end; k++) {
                    currentSum += numbers[k];
                }
                
                // System.out.println("Sum of subarray from index " + start + " to " + end + " is " + currentSum);

                // Update maxSum if the current subarray's sum is greater.
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("\nMaximum Subarray Sum is: " + maxSum);
    }

    /**
     * The main method to test the maxSum functionality.
     */
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSum(numbers);
    }
}
