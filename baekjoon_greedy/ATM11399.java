package baekjoon_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ATM11399_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        String[] str = br.readLine().split(" ");
        int hap = 0;
        for(int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(num);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                hap = hap + num[j];
            }
        }
        System.out.println(hap);
    }
}
