package baekjoon_Short;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exercise1956 {
    public static final int INF = 4000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int V = Integer.parseInt(str[0]);
        int E = Integer.parseInt(str[1]);
        int result = INF;
        int[][] map = new int[V + 1][V + 1];
        for(int i = 0; i <= V; i++)
            Arrays.fill(map[i], INF);

        for (int i = 1; i <= E; i++) {
            String[] str1 = br.readLine().split(" ");
            map[Integer.parseInt(str1[0])][Integer.parseInt(str1[1])] = Integer.parseInt(str1[2]);
        }
        for (int k = 1; k <= V; k++) {
            for (int i = 1; i <= V; i++) {
                for (int j = 1; j <= V; j++) {
                    if (map[i][j] > map[i][k] + map[k][j]) {
                        map[i][j] = map[i][k] + map[k][j];
                    }
                }
            }
        }
        for(int i = 1; i <= V; i++) {
            result = Math.min(result, map[i][i]);
        }
        if(result == INF) {
            System.out.println("-1");
        }
        else {
            System.out.println(result);
        }
    }
}
