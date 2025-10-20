public class patterns {
    public static void Inverted_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }

    }

    public static void Inverted_Half_Pyramid_WithNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {

                System.out.print(j + "");
            }
            System.out.println();

        }

    }

    public static void numbers_Rect(int totrows, int totcol) {
        int counter = 1;
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totcol; j++) {
                if (i == 1 || i == totrows || j == 1 || j == totcol) {
                    System.out.print(counter + " ");
                    counter++;
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numbers_Rect(3, 3);

    }
}
