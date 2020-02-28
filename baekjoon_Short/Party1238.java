package baekjoon_Short;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Party1238 {
    public static final int INF = 101000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int T = Integer.parseInt(str[2]);
        int[][] time = new int[N + 1][N + 1];
        for(int i = 1; i <= N; i++) {
            Arrays.fill(time[i], INF);
        }
        for(int i = 1; i <= M; i++) {
            String[] str1 = br.readLine().split(" ");
            time[Integer.parseInt(str1[0])][Integer.parseInt(str1[1])] = Integer.parseInt(str1[2]);
        }
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                if(i == j)
                    time[i][j] = 0;
            }
        }

        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (time[i][j] > time[i][k] + time[k][j]) {
                        time[i][j] = time[i][k] + time[k][j];
                    }
                }
            }
        }
        int max = 0;
        for(int i = 1; i <= N; i++) {
            max = Math.max(max, time[i][T] + time[T][i]);
        }
        System.out.println(max);
    }
}
