public class Spiral_Matrix {
    /**
     * Prints the elements of a 2D matrix in a spiral order.
     * 
     * @param matrix The 2D integer array to be printed.
     */
    public static void Spiral_matrix(int matrix[][]) {
        // Initialize boundary pointers for the spiral traversal
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        // Continue looping as long as there is a valid row and column to traverse
        while (startrow <= endrow && startcol <= endcol) {
            // Print the top row (from left to right)
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }

            // Print the right column (from top to bottom)
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }

            // Print the bottom row (from right to left)
            // Check to avoid re-printing the top row in case of a single-row matrix inside
            // the spiral
            if (startrow < endrow) {
                for (int j = endcol - 1; j >= startcol; j--) {
                    System.out.print(matrix[endrow][j] + " ");
                }
            }

            // Print the left column (from bottom to top)
            // Check to avoid re-printing the right column in case of a single-column matrix
            // inside the spiral
            if (startcol < endcol) {
                for (int i = endrow - 1; i > startrow; i--) {
                    System.out.print(matrix[i][startcol] + " ");
                }
            }

            // Move the boundaries inward for the next spiral layer
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }

        System.out.println(); // Print a newline after the spiral is complete
    }

    public static void main(String[] args) {
        // Define a sample 4x4 matrix
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // Call the method to print the matrix in spiral order
        Spiral_matrix(matrix);
    }

}
