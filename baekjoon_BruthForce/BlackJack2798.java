package baekjoon_BruthForce;

import java.io.*;
import java.util.Scanner;

public class BlackJack2798 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int cnt = 0;
        int[] a = new int[N];
        int max = 0;

        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        for(int j = 0; j <= N-1 ; j++){
            for(int k = j + 1; k <= N-1; k++){
                for(int l = k + 1; l <= N-1; l++) {
                    int b = (a[j] + a[k] + a[l]);
                    if (M >= b && max < b) {
                        max = b;
                    }
                }
                cnt = cnt + 1;
            }
        }
        System.out.println(max);

    }
}
