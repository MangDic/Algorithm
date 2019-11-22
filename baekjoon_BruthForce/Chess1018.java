package baekjoon_BruthForce;

import java.io.*;
import java.util.Scanner;

public class Chess1018 {
    static int n, m;
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 행
        m = sc.nextInt(); // 열
        arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String t = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = t.charAt(j);
                System.out.print(arr[i][j]);
                if(j == m-1){
                    System.out.print("\n");
                }
            }
        }
    }
}
