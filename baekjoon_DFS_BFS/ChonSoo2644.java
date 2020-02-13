package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ChonSoo2644 {
    static boolean[] visit;
    static int[] total;
    static int[][] chon;
    static int x;
    static int y;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        x = Integer.parseInt(str[0]);
        y = Integer.parseInt(str[1]);
        total = new int[n+1];
        int m = Integer.parseInt(br.readLine());
        chon = new int[n+1][2];
        visit = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            String[] str1 = br.readLine().split(" ");
            chon[i][0] = Integer.parseInt(str1[0]);
            chon[i][1] = Integer.parseInt(str1[1]);
        }
        System.out.println(bfs(x,n));

    }

    public static int bfs(int x, int N) {
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(x);

        while (!qu.isEmpty()) {
            int temp = qu.poll();
            visit[temp] = true;
            for (int i = 0; i < N; i++) {
                if(chon[i][0] == temp && !visit[chon[i][1]]) {
                    qu.offer(chon[i][1]);
                    visit[chon[i][1]] = true;
                    total[chon[i][1]] = total[chon[i][0]] + 1;
                }
                else if(chon[i][1] == temp && !visit[chon[i][0]]) {
                    qu.offer(chon[i][0]);
                    visit[chon[i][0]] = true;
                    total[chon[i][0]] = total[chon[i][1]] + 1;
                }
            }
            if(!qu.isEmpty() && qu.peek() == y) {
                return total[y];
            }
        }
        return -1;
    }
}
