package Simul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Order1722 {
    static int N;
    static StringBuilder sb;
    static int cnt = 0;
    static int[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        visit = new int[N+1];
        sb = new StringBuilder();

        if(Integer.parseInt(str[0]) == 2) {
            for(int i = 2; i <= N; i++) {
                str[1] = str[1] + " " + str[i];
            }
            num(0,"", str[1]);
        }
        else {
            order(0,"",Integer.parseInt(str[1]));
        }
    }

    public static void num(int a, String str, String cheak) {
        if(a == N) {
            if(cheak.equals(str.trim())) {
                System.out.println((cnt + 1));
                return;
            }
            else {
                cnt = cnt + 1;
            }
        }
        else {
            for (int i = 1; i <= N; i++) {
                if(visit[i] == 0) {
                    visit[i] = 1;
                    num(a + 1, str + " " + i, cheak);
                    visit[i] = 0;
                }
            }
        }
    }

    public static void order(int a, String str, int b) {
        if(a == N) {
            if(cnt == b) {
                cnt = -20;
                System.out.println(str.trim());
                return;
            }
            else {
                cnt++;
            }
        }
        else {
            for (int i = 1; i <= N; i++) {
                if(visit[i] == 0) {
                    visit[i] = 1;
                    order(a + 1, str + " " + i, b);
                    visit[i] = 0;
                }
            }
        }
    }
}
