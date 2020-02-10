package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lotto6603 {
    static StringBuilder sb;
    static int[] T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int temp = 1;
        while (true) {
            String[] str = br.readLine().split(" ");
            temp = Integer.parseInt(str[0]);
            sb = new StringBuilder();
            T = new int[str.length];
            if(temp == 0){
                break;
            }
            for(int i = 0; i < str.length; i++) {
                T[i] = Integer.parseInt(str[i]);
            }
            bfs(0,1, "");
            System.out.println(sb);
        }
    }
    public static void bfs(int dist, int cur, String str) {
        boolean visit[] = new boolean[50];
        if(dist == 6) {
          sb.append(str.trim() + "\n");
          return;
        }
        else {
            for (int i = cur; i <= T[0]; i++) {
                if (!visit[T[i]]) {
                    visit[T[i]] = true;
                    bfs(dist + 1, i + 1, str + " " + T[i]);
                    visit[T[i]] = false;
                }
            }
        }
    }
}
