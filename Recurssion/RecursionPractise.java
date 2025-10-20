public class RecursionPractise {

    public static void printDec(int n) {

        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        System.out.println(n + " ");
        printDec(n - 1);

    }

    public static void printInc(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);

        System.out.println(n + " ");

    }

    public static int Factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * Factorial(n - 1);
    }

    public static int Sum(int n) {
        if (n == 1) {
            return n;
        }
        return n + Sum(n - 1);
    }

    public static int Fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int f1 = Fib(n - 1);
        int f2 = Fib(n - 2);
        return f1 + f2;
    }

    public static boolean SortedArray(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return SortedArray(arr, i + 1);
    }

    public static int FirstOccurance(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return FirstOccurance(arr, i + 1, key);
    }

    public static int LastOccurance(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return -1;
        }

        int isFound = LastOccurance(arr, i + 1, key);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;

    }

    public static int PowerX(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * PowerX(x, n - 1);
    }

    public static int OptimizedPowerX(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = OptimizedPowerX(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;

        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        // printDec(10);
        // printInc(10);
        // System.out.println(Factorial(5));
        // System.out.println(Sum(5));
        // System.out.println(Fib(5));
        // int arr[] = { 1, 2, 3, 4, 5 };
        // System.out.println(SortedArray(arr, 0));
        // int arr[] = { 8, 6, 5, 4, 7, 4, 9, 6, 5, 3 };
        // System.out.println(FirstOccurance(arr, 0, 5));
        // int arr[] = { 8, 6, 5, 4, 7, 4, 9, 6, 5, 3 };
        // System.out.println(LastOccurance(arr, 0, 5));

        // System.out.println(PowerX(2, 5));
        System.out.println(OptimizedPowerX(2, 5));
    }
}
