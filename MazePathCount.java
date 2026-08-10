public class MazePathCount {
    public static void main(String[] args) {
        System.out.println(pathCount(3, 3));
    }

    static int pathCount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = pathCount(r - 1, c);
        int right = pathCount(r, c - 1);

        return left + right;
    }
}
