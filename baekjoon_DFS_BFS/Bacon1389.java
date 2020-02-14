package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bacon1389 {
    static int N,M;
    static int dp[][];
    static int[][] map;
    static Queue<Integer> q = new LinkedList<>();
    static int minCnt = Integer.MAX_VALUE;
    static int min;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        dp = new int[N+1][N+1];
        map = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            Arrays.fill(dp[i], -1);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = map[b][a] = 1;
        }

        for (int i = N; i >= 1; i--) {
            solve(i);
        }
        System.out.println(min);
    }

    static void solve(int start) {
        dp[start][start] = 0;
        q.add(start);

        while(!q.isEmpty()) {
            int cur = q.poll();

            for (int i = 1; i <= N; i++) {

                if(map[cur][i] == 0 || dp[start][i] != -1) continue;

                dp[start][i] = dp[start][cur] +1;
                q.add(i);
            }
        }
        int sum = 0;
        for (int i = 1; i <= N; i++)
            sum += dp[start][i];

        if(minCnt >= sum ) {
            minCnt = sum;
            min = start;
        }
    }
}
