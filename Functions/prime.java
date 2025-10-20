import java.util.*;

public class prime {
    // public static boolean isPrime(int n) {
    // boolean isPrime = true;

    // if (n == 2) {
    // isPrime = true;

    // }
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // isPrime = false;
    // }

    // }
    // return isPrime;
    // }
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void PrimesinRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        PrimesinRange(n);
        sc.close();
    }
}