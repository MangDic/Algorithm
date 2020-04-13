package Simul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Wedding5567 {
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        visit = new boolean[N + 1];
        int M = sc.nextInt();
        int cnt = 0;
        int[][] link = new int[N+1][N+1];
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            link[a][b] = 1;
            link[b][a] = 1;
        }
        for(int i = 2; i <= N; i++) {
            if(link[1][i] == 1) {
                link[1][i] = 0;
                link[i][1] = 0;
                if(!visit[i]) {
                    visit[i] = true;
                    cnt++;
                }
                for(int j = 2; j <= N; j++) {
                    if(link[i][j] == 1) {
                        link[i][j] = 0;
                        link[j][i] = 0;
                        if(!visit[j]) {
                            visit[j] = true;
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);

    }
}
