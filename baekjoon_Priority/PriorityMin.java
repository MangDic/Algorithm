package baekjoon_PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class PriorityMin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int temp;
        for (int i = 0; i < N; i++) {
            temp = Integer.parseInt(br.readLine());
            if (temp == 0) {
                if(pq.isEmpty()) {
                    System.out.println("0");
                }
                else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.offer(temp);
            }
        }
    }
}
