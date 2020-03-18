package baekjoon_Short;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ployd_11404 {
    public static final int INF = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] map = new int[n+1][n+1];
        for(int i = 1; i <= n; i++)
            Arrays.fill(map[i], INF);
        for(int i = 1; i <= m; i++) {
            String[] str = br.readLine().split(" ");
            if(map[Integer.parseInt(str[0])][Integer.parseInt(str[1])] == INF) {
                map[Integer.parseInt(str[0])][Integer.parseInt(str[1])] = Integer.parseInt(str[2]);
            }
            else {
                if(map[Integer.parseInt(str[0])][Integer.parseInt(str[1])] > Integer.parseInt(str[2])) {
                    map[Integer.parseInt(str[0])][Integer.parseInt(str[1])] = Integer.parseInt(str[2]);
                }
            }
        }
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (map[i][j] > map[i][k] + map[k][j]) {
                        map[i][j] = map[i][k] + map[k][j];
                    }
                }
            }
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(map[i][j] == INF || i == j) {
                    System.out.print("0" + " ");
                }
                else {
                    System.out.print(map[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
