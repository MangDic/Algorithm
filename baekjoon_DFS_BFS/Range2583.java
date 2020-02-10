package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Range2583 {
    static int M;
    static int N;
    static int K;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int count = 0;
    static int[][] monoon;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        M = Integer.parseInt(str[0]);
        N = Integer.parseInt(str[1]);
        K = Integer.parseInt(str[2]);
        int total = 0;
        monoon = new int[M][N];
        int cnt = 0;
        while (cnt < K) {
            String[] str1 = br.readLine().split(" ");
            for (int i = Integer.parseInt(str1[0]); i < Integer.parseInt(str1[2]); i++) {
                for (int j = Integer.parseInt(str1[1]); j < Integer.parseInt(str1[3]); j++) {
                    monoon[j][i] = 1;
                }
            }
            cnt++;
        }
        cnt = 0;
        PriorityQueue<Integer> max = new PriorityQueue<>();
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(monoon[i][j] == 0) {
                    count = 0;
                    total++;
                    dfs(i,j);
                    max.add(count);
                }
            }
        }
        System.out.println(total);
        while (!max.isEmpty()) {
            System.out.print(max.poll() + " ");
        }
    }
    static void dfs(int x, int y) {
        monoon[x][y] = 1;
        count ++;
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(0 <= nx && 0 <= ny && nx < M && ny < N) {
                if(monoon[nx][ny] == 0) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
