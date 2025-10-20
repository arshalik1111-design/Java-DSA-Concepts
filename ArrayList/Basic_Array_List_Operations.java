
import java.util.*;

public class Basic_Array_List_Operations {

    // Demonstrates basic ArrayList operations.
    public static void BasicOperations() {
        ArrayList<Integer> list = new ArrayList<>();
        // Add elements to the list.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1, 9); // Insert 9 at index 1.

        System.out.println("List after additions: " + list);

        // Print the size of the list and its elements.
        System.out.println("Size of the list: " + list.size());
        System.out.print("Elements of the list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Get the element at a specific index.
        int element = list.get(2);
        System.out.println("Element at index 2: " + element);

        // Remove an element from a specific index.
        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);

        // Set the value at a specific index.
        list.set(1, 10);
        System.out.println("List after setting index 1 to 10: " + list);

        // Check if the list contains certain elements.
        System.out.println("List contains 10: " + list.contains(10));
        System.out.println("List contains 13: " + list.contains(13));
    }

    // Prints the given list in reverse order.
    public static void ReverseList(ArrayList<Integer> list) {
        System.out.print("Reversed list: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // Finds and prints the maximum element in the list.
    public static void MaximumNum(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max Element: " + max);
    }

    // Swaps elements at the given indices in the list.
    public static void Swap(ArrayList<Integer> list, int idx1, int idx2) {
        System.out.println("Original list for swap: " + list);
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println("List after swapping elements at " + idx1 + " and " + idx2 + ": " + list);
    }

    // Demonstrates a 2D ArrayList (an ArrayList of ArrayLists).
    public static void twoDArrayList() {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // Populate the inner lists.
        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        // Add the inner lists to the main list.
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println("2D ArrayList: " + mainList);

        // Print each sub-list on a new line.
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Demonstrate basic operations
        System.out.println("--- Basic Operations ---");
        BasicOperations();
        System.out.println();

        // Demonstrate reversing a list
        System.out.println("--- Reverse List ---");
        ArrayList<Integer> listToReverse = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ReverseList(listToReverse);
        System.out.println();

        // Demonstrate finding the maximum number
        System.out.println("--- Maximum Number ---");
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(2, 5, 9, 3, 6));
        MaximumNum(numList);
        System.out.println();

        // Demonstrate swapping elements
        System.out.println("--- Swap Elements ---");
        ArrayList<Integer> swapList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Swap(swapList, 1, 3);
        System.out.println();

        // Demonstrate 2D ArrayList
        System.out.println("--- 2D ArrayList ---");
        twoDArrayList();
    }
}
