class Shortest_Path {
    public static float print_Shortest_Path(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            int distance = path.charAt(i);
            if (distance == 'N') {
                y++;

            } else if (distance == 'S') {
                y--;
            } else if (distance == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("Shortest Path is: " + print_Shortest_Path(str));
    }

}
