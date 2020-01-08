package baekjoon_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Yosefus11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int a[] = new int[K];
        Queue<Integer> qu = new LinkedList<>();
        Queue<Integer> order = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            qu.offer(i);
        }
        while (qu.size() != 0) {
                for (int i = 1; i < K; i++) {
                    a[i] = qu.poll();
                    qu.offer(a[i]);

                }
                order.offer(qu.poll());
        }
        System.out.print("<");
        for(int i = 0; i < N; i++) {
            if(i != N-1) {
                System.out.print(order.poll() + ", ");
            }
            else {
                System.out.print(order.poll());
            }

        }
        System.out.print(">");
    }
}
