
public class DivideAndConquer {

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left Part
        mergeSort(arr, mid + 1, ei); // right Part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // left part iterator
        int j = mid + 1; // right part iterator
        int k = 0;// temp arr iterator
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // for leftover elements of left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for leftover elements of right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    /**
     * Sorts an array using the QuickSort algorithm.
     *
     * @param arr The array to be sorted.
     * @param si The starting index.
     * @param ei The ending index.
     */
    public static void QuickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return; // Base case: if the array has 0 or 1 element, it's already sorted.
        }
        // Partition the array and get the pivot index.
        int pIdx = partition(arr, si, ei);
        // Recursively sort the left part.
        QuickSort(arr, si, pIdx - 1);
        // Recursively sort the right part.
        QuickSort(arr, pIdx + 1, ei);

    }

    /**
     * Partitions the array for the QuickSort algorithm.
     *
     * @param arr The array to be partitioned.
     * @param si The starting index.
     * @param ei The ending index.
     * @return The index of the pivot element.
     */
    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei]; // Choose the last element as the pivot.

        int i = si - 1; // Index of smaller element.

        // Iterate through the array to place elements smaller than pivot to the left.
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j].
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
        i++;
        // Place the pivot element in its correct position.
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;

        return i; // Return the pivot's final index.

    }

    /**
     * Prints the elements of an array.
     *
     * @param arr The array to be printed.
     */
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Main method to test the sorting algorithms.
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8, -5};
        mergeSort(arr, 0, arr.length - 1);
        QuickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
