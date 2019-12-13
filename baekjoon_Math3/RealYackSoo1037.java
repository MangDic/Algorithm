package baekjoon_Math3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RealYackSoo1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] M = new int[N];
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            M[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(M);
        System.out.println(M[0]*M[N-1]);
    }
}