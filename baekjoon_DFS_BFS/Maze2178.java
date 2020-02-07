package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Maze2178 {
    static int N, M;
    static boolean[][] visit;
    static int[][] maze;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1}; // dx[],dy[]로 좌하우상

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        visit = new boolean[N][M];
        maze = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] str1 = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(str1[j]);
            }
        }
        visit[0][0] = true;
        bfs(0, 0);
        System.out.println(maze[N-1][M-1]);
    }
    public static void bfs(int x, int y) {
        Queue<Dot> qu = new LinkedList<Dot>();
        qu.add(new Dot(x, y));
        while (!qu.isEmpty()) {
            Dot d = qu.poll();
            for(int i = 0; i < 4; i++) {
                int nextX = d.x + dx[i];
                int nextY = d.y + dy[i];
                if(nextX < 0 || nextY < 0|| nextX >= N || nextY >=M) {
                    continue;
                }
                if(visit[nextX][nextY] || maze[nextX][nextY] == 0) {
                    continue;
                }
                qu.add(new Dot(nextX,nextY));
                maze[nextX][nextY] = maze[d.x][d.y] + 1;
                visit[nextX][nextY] = true;
            }
        }
    }
}
class Dot {
    int x;
    int y;

    Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
