package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Link11724 {
    static int N;
    static int M;
    static boolean[] visit;
    static int[][] link;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        visit = new boolean[N];
        link = new int[N][N];
        int cnt = 0;
        for(int i = 0; i < M; i++) {
            String[] str1 = br.readLine().split(" ");
            link[Integer.parseInt(str1[0]) -1][Integer.parseInt(str1[1]) -1] = 1;
            link[Integer.parseInt(str1[1]) -1][Integer.parseInt(str1[0]) -1] = 1;
        }
        for(int i = 0; i < N; i++) {
            if(!visit[i]) {
                bfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void bfs(int a) {
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(a);
        visit[a] = true;
        while (!qu.isEmpty()) {
            int temp = qu.poll();
            for(int i = 0; i < N; i++) {
                if(!visit[i] && link[temp][i] == 1) {
                    visit[i] = true;
                    qu.offer(i);
                }
            }
        }
    }
}
