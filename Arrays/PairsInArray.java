public class PairsInArray {
    public static void printArrayPairs(int numbers[]) {
        int totalPairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.print("Total pairs are: " + totalPairs);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        System.out.print("Given Array is: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Pairs in the Array: ");
        printArrayPairs(numbers);
    }
}
