import java.util.*;

public class bitodeci {
    public static void bintodeci(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int dec = 0;
        while (binNum > 0) {
            int lastdig = binNum % 10;
            dec = dec + (lastdig * ((int) Math.pow(2, pow)));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("Decimal of " + myNum + " is " + dec);

    }

    public static void decitobi(int n) {
        int myNum = n;
        int binary = 0;
        int pow = 0;
        // binary = binary + (rem * 10^pow)
        while (n > 0) {
            int rem = n % 2;

            binary = binary + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary of " + myNum + " is " + binary);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter DEcimal Number: ");
        int n = sc.nextInt();
        decitobi(n);

        sc.close();

    }

}
