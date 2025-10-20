// public class EvenOrOdd {

//     public static void Even_Or_Odd(int n) {
//         int bitMask = 1;

//         if ((n & bitMask) == 0) {
//             System.out.println("Even number");

//         } else {
//             System.out.println("Odd Number");
//         }
//     }

//     public static void main(String[] args) {
//         Even_Or_Odd(3);
//         Even_Or_Odd(11);
//         Even_Or_Odd(6);
//         Even_Or_Odd(128);
//     }
// }

public class EvenOrOdd {

    // public static void EvenOrOdd(int n) {
    // int bitmask = 1;
    // if ((n & bitmask) == 1) {
    // System.out.println("Odd");
    // } else {
    // System.out.println("Even");

    // }

    // }

    public static int get_i_bit(int n, int i) {

        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int set_i_bit(int n, int i) {

        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clear_i_bit(int n, int i) {

        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int update_i_bit(int n, int i, int newBit) {

        if (newBit == 0) {
            return clear_i_bit(n, i);
        } else {
            return set_i_bit(n, i);
        }
    }

    public static void main(String[] args) {
        // EvenOrOdd(73);
        // System.out.println("" + get_i_bit(10, 3));
        // System.out.println("" + set_i_bit(5, 1));
        System.out.println("" + clear_i_bit(15, 1));
    }
}