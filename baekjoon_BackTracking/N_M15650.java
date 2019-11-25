package baekjoon_BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_M15650 {
    static int M, N;
    static int[] chk;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        M = Integer.parseInt(temp[0]);
        N = Integer.parseInt(temp[1]);
        chk = new int[M + 1];
        sb = new StringBuilder();
        back(1,0, "");
        System.out.println(sb);
    }

    public static void back(int cur, int dist, String str){
        if(dist == N){
            sb.append(str.trim() + "\n");
            return;
        }
        else {
            for(int i = cur; i <= M; i++) { // i = cur로 자기 자신부터 시작
                if(chk[i] == 0) {
                    chk[i] = 1;
                    back(i,dist + 1, str + " " + i);
                    chk[i] = 0;

                }
            }

        }

    }
}
