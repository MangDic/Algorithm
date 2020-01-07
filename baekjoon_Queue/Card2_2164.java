package baekjoon_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card2_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp;
        Queue<Integer> qu = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            qu.offer(i);
        }
        while (qu.size() != 1) {
            qu.poll();
            temp = qu.poll();
            qu.offer(temp);
        }
        System.out.println(qu.poll());
    }
}
