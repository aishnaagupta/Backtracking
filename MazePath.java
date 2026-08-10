import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        // path("", 3, 3);
        System.out.println(path2("", 3, 3));
    }

    static void path(String s, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.print(s + " ");
            return;
        }

        if (r > 1) {
            path(s + 'D', r - 1, c);
        }
        if (c > 1) {
            path(s + 'R', r, c - 1);
        }
    }

    static ArrayList<String> path2(String s, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(path2(s + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(path2(s + 'R', r, c - 1));
        }
        return list;
    }
}
