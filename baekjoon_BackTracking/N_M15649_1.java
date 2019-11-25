package baekjoon_BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_M15649_1 {
    static int N, M;
    static int[] used;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        N = Integer.parseInt(temp[0]);
        M = Integer.parseInt(temp[1]);
        used = new int[N + 1]; // 중복을 제거하기 위한 체크
        sb = new StringBuilder();
        chk(0, "");
        System.out.println(sb);
    }

    static void chk(int dist, String str) {
        if(dist == M) {
            sb.append(str.trim() + "\n");
            return;
        }
        else {
            for (int i = 1; i <= N; i++){
                if(used[i] == 0) {
                    used[i] = 1;
                    chk(dist + 1, str +" " + i);
                    used[i] = 0;
                }
            }
        }

    }
}
