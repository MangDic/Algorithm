package Simul;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HideSearch13549 {
    static int M;
    static int N;
    static int result = Integer.MAX_VALUE;
    static boolean[] visit = new boolean[1000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        find(N);
        System.out.println(result);

    }
    public static void find(int x) {
        Queue<time> qu = new LinkedList<>();
        qu.add(new time(x, 0));
        while (!qu.isEmpty()) {
            time temp = qu.poll();
            int n = temp.n;
            int t = temp.t;
            //System.out.println("n : " + n + " t : " + t);
            if(n == M) {
                result = Math.min(result, t);
                break;
            }
            if(visit[n]) {
                continue;
            }
            visit[n] = true;
            if(2*n < 100001) {
                if(!visit[2*n]) qu.add(new time(2 * n, t));
            }
            if(n-1 >= 0) {
                if(!visit[n-1]) qu.add(new time(n - 1, t + 1));
            }
            if(n+1 < 100001) {
                if(!visit[n+1]) qu.add(new time(n + 1, t + 1));
            }
        }

    }
}
class time {
    int n;
    int t;
    time(int n, int t) {
        this.n = n;
        this.t = t;
    }
}
