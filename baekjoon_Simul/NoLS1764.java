package Simul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoLS1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        String[] NoL = new String[N];
        String[] NoS = new String[M];
        int cnt = 0;
        boolean[] cheak = new boolean[N];
        String[] find = new String[N];

        for(int i = 0; i < N; i++) {
            NoL[i] = br.readLine();
        }
        for(int i = 0; i < M; i++) {
            NoS[i] = br.readLine();
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.println(NoL[i] + " " + NoS[j]);
                if(!cheak[i] && NoL[i].equals(NoS[j])) {
                    cheak[i] = true;
                    find[cnt] = NoL[i];
                    cnt = cnt + 1;
                    break;
                }
            }
        }
        System.out.println(cnt);
        for(int i = 0; i < cnt; i++) {
            System.out.println(find[i]);
        }
    }
}
