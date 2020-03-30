package baekjoon_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class numCard2_10816 {
    static int[][] num;
    static int M;
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> qu = new LinkedList<>();
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            qu.offer(Integer.parseInt(str[i]));
        }
        M = Integer.parseInt(br.readLine());
        num = new int[M][2];
        result = new int[M];
        String[] str1 = br.readLine().split(" ");
        for(int i = 0; i < M; i++) {
            num[i][0] = Integer.parseInt(str1[i]);
            num[i][1] = i;
        }
        Arrays.sort(num, new Comparator<int[]>() {
            @Override
            public int compare(final int[] o1, final int[] o2) {
                final int n1 = o1[0];
                final int n2 = o2[0];
                return Integer.compare(n1, n2);
            }
        });
        for(int i = 0; i < N; i++) {
            binary(qu.poll());
        }
        for(int i = 0; i < M; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static void binary(int a) {
        int Left = 0;
        int Right = M - 1;
        int Mid;
        while (Left <= Right) {
            Mid = (Left + Right) / 2;
            if(a == num[Mid][0]) {
                result[num[Mid][1]] ++;
                break;
            }
            if(a < num[Mid][0]) {
                Right = Mid - 1;
            }
            else {
                Left = Mid + 1;
            }
        }

    }
}
