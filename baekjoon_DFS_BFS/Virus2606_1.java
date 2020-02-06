package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Virus2606_1 {
    static int n;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        int[][] com = new int[n+1][2];
        for(int i = 1; i <=p; i++) {
            String[] str = br.readLine().split(" ");
            com[i][0] = Integer.parseInt(str[0]);
            com[i][1] = Integer.parseInt(str[1]);
        }
        cheak(1, com);

    }
    public static void cheak(int root, int[][] a) {
        boolean[] visit = new boolean[n+1];
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(root);
        visit[1] = true;
        while (!qu.isEmpty()) {
            int temp = qu.poll();
            for(int i = 1; i <= n; i++) {
                // System.out.println("temp : " + temp + " 앞 : " + a[i][0] + " 뒤 : " + a[i][1] + " visit : "+visit[i]);
                if(a[i][0] == temp && !visit[i]) {
                    visit[i] = true;
                    qu.offer(a[i][1]);
                    cnt ++;
                    // System.out.println("!! " + a[i][1] + " visit : "+ visit[i]);
                }
            }
        }
        System.out.println(cnt);
    }
}
