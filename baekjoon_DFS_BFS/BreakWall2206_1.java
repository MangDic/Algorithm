package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BreakWall2206 {
    static int N;
    static int M;
    static int[][] matrix;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] root;
    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        matrix = new int[N][M];
        root = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] str1 = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(str1[j]);
                root[i][j] = Integer.MAX_VALUE;
            }
        }
        bfs(0, 0);
        if(result == Integer.MAX_VALUE) {
            System.out.println("-1");
        }
        else {
            System.out.println(result);
        }
    }
    public static void bfs(int a, int b) {
        Queue<Dot5> qu = new LinkedList<>();
        qu. offer(new Dot5(a, b, 0, 1));
        root[a][b] = 0;
        while (!qu.isEmpty()) {
            Dot5 d = qu.poll();
            if(d.x == N-1 && d.y == M-1) {
                result = d.dis;
                break;
            }
            for (int i = 0; i < 4; i++) {
                int nx = d.x + dx[i];
                int ny = d.y + dy[i];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                if(root[nx][ny] <= d.cnt) continue;

                if (matrix[nx][ny] == 0) { // 벽이 아닐때 !
                    root[nx][ny] = d.cnt;
                    qu.add(new Dot5(nx, ny, d.cnt, d.dis + 1));
                }
                else {  // 벽일때!
                    if (d.cnt == 0) {
                        root[nx][ny] = d.cnt+1;
                        qu.add(new Dot5(nx, ny, d.cnt + 1, d.dis + 1));
                    }
                }
            }
        }
    }
}
class Dot5 {
    int x;
    int y;
    int cnt; // 벽 카운트
    int dis; // 거리
    Dot5 (int x, int y, int cnt, int dis) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
        this.dis = dis;
    }
}