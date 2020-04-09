package baekjoon_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numCard2_10816_1 {
    static final int Max = 20000001;
    static final int half = 10000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] card = new int[Max];
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            card[half + Integer.parseInt(str[i])] ++ ;
        }
        int M = Integer.parseInt(br.readLine());
        String[] str1 = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            sb.append(card[half + Integer.parseInt(str1[i])] + " ");
        }
        System.out.println(sb);
    }
}
