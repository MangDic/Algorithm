package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class pra {
    static int N;
    static int M;
    static int[][] matrix;
    static boolean[][] visit;
    static int[][] temp;
    static List<dot> link;
    static int result = 0;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        link = new ArrayList<dot>();
        matrix = new int[N][M];
        visit = new boolean[N][M];
        temp = new int[N][M];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if(matrix[i][j] == 2) {
                    link.add(new dot(i, j));
                }
            }
        }
        bfs(0, 0);
        System.out.println(result);
    }

    public static void bfs(int x, int wall) {
        if (wall == 3) {
            copy();
            for(dot d : link) {
                chk(d.x, d.y);
            }
            result = Math.max(result, max());
            return;
        }
        else {
            for (int i = x; i < N*M; i++) {
                int nx = i / M;
                int ny = i % M;
                if(matrix[nx][ny] == 0) {
                    matrix[nx][ny] = 1;
                    bfs(nx, wall + 1);
                    matrix[nx][ny] = 0;
                }
            }
        }
    }
    public static void chk(int x, int y) {
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                if(temp[nx][ny] == 0) {
                    temp[nx][ny] = 2;
                    chk(nx, ny);
                }
            }
        }
    }

    public static int max() {
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(temp[i][j] == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void copy() {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                temp[i][j] = matrix[i][j];
            }
        }
    }
}
class dot {
    int x;
    int y;
    dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
