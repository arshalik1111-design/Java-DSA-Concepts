import java.util.*;

public class two_D_Arrays {
    /**
     * Searches for a given key in a 2D integer matrix.
     * @param matrix The 2D array to search within.
     * @param key The integer value to find.
     * @return true if the key is found, false otherwise.
     */
    public static boolean search(int matrix[][], int key) {
        // Iterate through each row
        for (int i = 0; i < matrix.length; i++) {
            // Iterate through each column in the current row
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("Found at cell(" + i + "," + j + ")");
                    return true; // Key found, exit the method
                }
            }
        }
        // If the loops complete, the key was not in the matrix
        System.out.print("Key not Found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = 3, m = 3; // Dimensions of the matrix
        Scanner sc = new Scanner(System.in);

        // Taking input for each element of the matrix
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing the matrix to the console
        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calling the search function to find the key '5'
        search(matrix, 5);
        sc.close(); // Close the scanner to prevent resource leaks
    }
}