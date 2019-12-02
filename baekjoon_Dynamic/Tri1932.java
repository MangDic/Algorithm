package baekjoon_Dynamic;

import java.util.Scanner;

public class Tri1932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] num = new int[N][N];
        long[][] hap = new long[N][N];
        long max = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j <= i; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        hap[0][0] = num[0][0];
        hap[1][0] = num[0][0] + num[1][0];
        hap[1][1] = num[0][0] + num[1][1];
        for(int i = 2; i < N; i++){
            for(int j = 0; j <= i; j++) {
                if(j == 0) {
                    hap[i][j] = hap[i-1][j] + num[i][j];
                }
                else if(j == N-1) {
                    hap[i][j] = hap[i-1][j-1] + num[i][j];
                }
                else {
                    if (hap[i-1][j-1] > hap[i-1][j])
                        hap[i][j] = hap[i-1][j-1] + num[i][j];
                    else
                        hap[i][j] = hap[i-1][j] + num[i][j];
                }
            }
        }
        for(int i = 0; i < N; i++){
            if(max < hap[N-1][i]) {
                max = hap[N-1][i];
            }
        }
        System.out.println(max);


    }
}
