package Simul;

import java.util.Scanner;

public class restaurant2786 {
    static boolean[] visit;
    static int N;
    static int[][] price;
    static int cnt = 0;
    static int result = 10000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        price = new int[N][2];
        for (int i = 0; i < N; i++) {
            price[i][0] = sc.nextInt();
            price[i][1] = sc.nextInt();
        }
        while (cnt < N) {
            for(int i = 0; i < N; i++) {
                visit = new boolean[N];
                visit[i] = true;
                back(0, price[i][0]);
            }
            System.out.println(result);
            result = 10000000;
            cnt++;
        }
    }
    public static void back(int dist, int str) {
        if(result < str) {
            return;
        }
        if(dist == cnt) {
            result = Math.min(result, str);
        }
        for(int i = 0; i < N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                back(dist + 1, str + price[i][1]);
                visit[i] = false;
            }
        }
    }
}
