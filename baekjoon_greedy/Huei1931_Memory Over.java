package baekjoon_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Huei1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] time = new String[N];
        String temp1;
        String temp2;
        String tempTime;
        String[] str;
        int cnt = 0;
        int max = 0;
        for(int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            temp1 = str[0];
            temp2 = str[1];
            if(Integer.parseInt(temp1) < 10) {
                temp1 = 0 + temp1;
            }
            if(Integer.parseInt(temp2) < 10) {
                temp2 = 0 + temp2;
            }
            time[i] = temp1 + temp2;
        }
        Arrays.sort(time);
        for(int i = 0; i < N; i++) {
            tempTime = time[i];
            for(int j = i+1; j < N; j++) {
                if(Integer.parseInt(time[j].substring(0,2)) >= Integer.parseInt(tempTime.substring(2,4))) {
                    cnt = cnt + 1;
                    tempTime = time[j];
                }
            }
            if(cnt > max) {
                max = cnt;
            }
            cnt = 0;
        }
        System.out.println(max + 1);
    }
}
