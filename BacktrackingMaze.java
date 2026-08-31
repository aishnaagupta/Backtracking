public class BacktrackingMaze {
    public static void main(String[] args) {
        boolean[][] board= {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        path("", board, 0, 0);
    }

    static void path(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        //I am considering this block in my path
        maze[r][c]= false;

        if(r < maze.length-1){
            path(p+'D', maze, r+1, c);
        }
        if(c < maze[0].length-1){
            path(p+'R', maze, r, c+1);
        }
        if(r>0){
            path(p+'U', maze, r-1, c);
        }
        if(c>0){
            path(p+'L', maze, r, c-1);
        }

        //this line is where the function will be over
        //so before the function gets removed, also remove all the changes that were made by that function

        maze[r][c]=true;
    }
}
