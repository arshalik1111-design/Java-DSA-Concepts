public class Butterfly {
    public static void Butterfly_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // stars - i
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                // spaces - i
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                // stars - i
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                // stars - i
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                // spaces - i
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                // stars - i
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Butterfly_Pattern(4);
    }
}
