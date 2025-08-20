import java.util.*;

public class Shortest_Path {
    public static float isShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            // North
            if (dir == 'N') {
                y++;
                // South
            } else if (dir == 'S') {
                y--;
                // West
            } else if (dir == 'W') {
                x--;
                // East
            } else {
                x++;
            }

        }
        int Xqrt = x * x; 
        int Yqrt = y * y;
        return (float) Math.sqrt(Xqrt + Yqrt);

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(isShortestPath(str));

    }

}
