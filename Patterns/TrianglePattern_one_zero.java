public class TrianglePattern_one_zero {
    public static void Pattern_one_zero(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                }
                if ((i + j) % 2 != 0) {
                    System.out.print("0");

                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Pattern_one_zero(5);
    }
}
