package baekjoon_Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RGB1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N][3];
        for(int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            dp[i][0] = Integer.parseInt(str[0]); // 빨강 가격
            dp[i][1] = Integer.parseInt(str[1]); // 초록 가격
            dp[i][2] = Integer.parseInt(str[2]); // 파랑 가격
        }
        for(int i = 1; i < N; i++) {
            dp[i][0] += Math.min(dp[i-1][1], dp[i-1][2]); // 현재 빨강일 경우
            dp[i][1] += Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] += Math.min(dp[i-1][0], dp[i-1][1]);
        }
        System.out.println(Math.min((dp[N-1][0]), Math.min(dp[N-1][1], dp[N-1][2])));

    }
}
