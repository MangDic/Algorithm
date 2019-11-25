package baekjoon_BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_M15651 {
    static int N, M;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        M = Integer.parseInt(temp[0]);
        N = Integer.parseInt(temp[1]);
        sb = new StringBuilder();
        back(0, "");
        System.out.println(sb);
    }

    public static void back(int a, String str) {
        if (a == N) {
            System.out.println(str);
        } else {
            for (int i = 1; i <= M; i++) {
                back(a + 1, str + i + " ");
            }
        }
    }
}
