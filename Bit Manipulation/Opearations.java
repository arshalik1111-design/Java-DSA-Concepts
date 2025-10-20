public class Opearations {

    public static void Even_Or_Odd(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println("Even number");

        } else {
            System.out.println("Odd Number");
        }
    }

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

        // if (newBit == 0) {
        // return clear_i_bit(n, i);
        // } else {
        // return set_i_bit(n, i);
        // }
        // OR (Another approach)
        n = clear_i_bit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;

    }

    public static int clearLast_i_bit(int n, int i) {
        int bitMask = ((-1) << i);
        return n & bitMask;
    }

    public static int clearRangeInBits(int n, int i, int j) {

        int a = ((-1) << j + 1);
        int b = (1 << i) - 1;

        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        // Even_Or_Odd(3);
        // Even_Or_Odd(74);

        // System.out.println(get_i_bit(10, 2));
        // System.out.println(set_i_bit(10, 2));
        // System.out.println(clear_i_bit(10, 1));
        // System.out.println(update_i_bit(10, 1, 0));

        // System.out.println(clearLast_i_bit(15, 2));
        System.out.println(clearRangeInBits(10, 2, 4));

    }
}
