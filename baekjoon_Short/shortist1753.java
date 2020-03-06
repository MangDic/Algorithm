package baekjoon_Short;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class shortist1753 {
    public static final int INF = 987654321;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int V = Integer.parseInt(str[0]);
        int E = Integer.parseInt(str[1]);
        int S = Integer.parseInt(br.readLine());
        int[][] map = new int[V+1][V+1];
        for (int i = 0; i < V; i++) {
            Arrays.fill(map[i], INF);
        }
        for(int i = 1; i <= E; i++) {
            String[] str1 = br.readLine().split(" ");
            map[Integer.parseInt(str1[0])][Integer.parseInt(str1[1])] = Integer.parseInt(str1[2]);
        }

        for(int i = 1; i <= V; i++) {
            for(int j = 1; j <= V; j++) {
                for (int k = 1; k <= V; k++) {
                    if(map[j][k] > map[j][i] + map[i][k]) {
                        map[j][k] = map[j][i] + map[i][k];
                    }
                }
            }
        }
        for(int i = 1; i <= V; i++) {
            if(i == S) {
                System.out.println("0");
            }
            else if (map[S][i] == INF) {
                System.out.println("INF");
            }
            else {
                System.out.println(map[S][i]);
            }
        }
    }
}
