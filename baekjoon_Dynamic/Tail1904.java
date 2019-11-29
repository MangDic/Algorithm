package baekjoon_Dynamic;

import java.util.Scanner;

public class Tail1904 {
    static int a[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        a = new int[N + 1];
        a[0] = 1; a[1] = 2;
        for(int i = 2; i < N; i++) {
            a[i] = a[i - 1] + a[i - 2];
            a[i]%=15746;
        }
        System.out.println(a[N-1]);
    }

}
