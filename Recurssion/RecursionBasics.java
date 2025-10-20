public class RecursionBasics {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);

    }

    public static void printInc(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");

    }

    public static int factorial(int n) {
        if (n == 0) {

            return 1;
        }
        int fact = factorial(n - 1);

        int fn = n * factorial(n - 1);
        return fn;

    }

    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = Sum(n - 1);
        int SumOfN = n + fnm1;

        return SumOfN;

    }

    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = Fibonacci(n - 1);
        int fnm2 = Fibonacci(n - 2);
        return fnm1 + fnm2;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {

            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;

        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccurance(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOccurance(arr, i + 1, key);

    }

    public static int lastOccurance(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, i + 1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;

    }

    public static int xPowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * xPowerN(x, n - 1);
    }

    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {

        // printDec(10);
        // printInc(10);
        // System.out.println(factorial(5));
        // System.out.println(Sum(5));
        // System.out.println(Fibonacci(5));
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurance(arr, 0, 5));
        // int arr[] = { 8, 6, 4, 5, 2, 7, 9, 4, 5, 6, 3, 1 };
        // System.out.println(lastOccurance(arr, 0, 5));
        System.out.println(xPowerN(2, 10));
        // System.out.println(optimizedPower(2, 10));
    }
}
