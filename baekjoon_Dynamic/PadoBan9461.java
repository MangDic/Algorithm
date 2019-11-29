package baekjoon_Dynamic;

import java.util.Scanner;

public class PadoBan9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long b[] = new long[T];
        for (int j = 0; j < T; j++) {
            int N = sc.nextInt();
            long a[] = new long[N + 4];
            a[0] = 1; a[1] = 1; a[2] = 1; a[3] = 2; a[4] = 2;
            for (int i = 5; i < N; i++) {
                a[i] = a[i - 1] + a[i - 5];
            }
            b[j] = a[N-1];
        }
        for(int j = 0; j < T; j++) {
            System.out.println(b[j]);
        }
    }
}
