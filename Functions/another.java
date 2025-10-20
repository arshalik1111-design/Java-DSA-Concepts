
import java.util.*;

public class another {

    public static void BirthdayCakeCandles(int arr[]) {
        int largest = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; i < arr.length; j++) {

                if (largest > arr[i]) {
                    largest = arr[i];
                    System.out.println(largest);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[n] + "");
        }

        BirthdayCakeCandles();
        sc.close();
    }

}
