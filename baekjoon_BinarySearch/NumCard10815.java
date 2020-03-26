package baekjoon_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class NumCard10815 {
    static int[][] check;
    static int M;
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> number = new LinkedList<>();
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            number.offer(Integer.parseInt(str[i]));
        }
        M = Integer.parseInt(br.readLine());
        String[] str1 = br.readLine().split(" ");
        check = new int[M][2];
        result = new int[M];
        for(int i = 0; i < M; i++) {
            check[i][0] = Integer.parseInt(str1[i]);
            check[i][1] = i;
        }
        Arrays.sort(check, new Comparator<int[]>() {
            @Override
            public int compare(final int[] o1, final int[] o2) {
                final int n1 = o1[0];
                final int n2 = o2[0];
                return Integer.compare(n1, n2);
            }
        });

        for(int i = 0; i < N; i++) {
            binary(number.poll());
        }
        Arrays.sort(check, new Comparator<int[]>() {
            @Override
            public int compare(final int[] o1, final int[] o2) {
                final int n1 = o1[1];
                final int n2 = o2[1];
                return Integer.compare(n1, n2);
            }
        });
        for (int i = 0; i < M; i++) {
            if(result[i] == 1) {
                System.out.print("1 ");
            }
            else {
                System.out.print("0 ");
            }
        }
    }
    public static void binary(int a) {
        int Left = 0;
        int Right = M - 1;
        int Mid;
        while (Left <= Right) {
            Mid = (Left + Right) / 2;
            if(check[Mid][0] == a) {
                result[check[Mid][1]] = 1;
                break;
            }
            if(check[Mid][0] > a) {
                Right = Mid - 1;
            }
            else {
                Left = Mid + 1;
            }
        }
    }
}
