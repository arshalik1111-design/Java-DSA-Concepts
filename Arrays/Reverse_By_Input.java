
import java.util.Scanner;

class Reverse_By_Input {
    public static void Reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Reverse(numbers);
        System.out.print("Reversed array is=> ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        sc.close();
    }
}
