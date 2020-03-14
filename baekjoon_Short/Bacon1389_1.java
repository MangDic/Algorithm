package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bacon1389_1 {
    static int[][] matrix;
    static int N;
    static final int INF = 100000000;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        matrix = new int[N + 1][N + 1];
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                matrix[i][j] = (i == j)? 0 : INF;
            }
        }
        for (int i = 1; i <= M; i++) {
            String[] str1 = br.readLine().split(" ");
            matrix[Integer.parseInt(str1[0])][Integer.parseInt(str1[1])] = 1;
            matrix[Integer.parseInt(str1[1])][Integer.parseInt(str1[0])] = 1;
        }
        floyd();
        chk();
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void floyd() {
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                for(int k = 1; k <= N; k++) {
                    matrix[j][k] = Math.min(matrix[j][k], matrix[j][i] + matrix[i][k]);
                }
            }
        }
    }
    public static void chk() {
        int index = 0;
        for(int i = 1; i <= N; i++) {
            int hap = 0;
            for(int j = 1; j <= N; j++) {
                hap += matrix[i][j];
            }
            if(min > hap) {
                min = hap;
                index = i;
            }
        }
        System.out.println(index);
    }
}