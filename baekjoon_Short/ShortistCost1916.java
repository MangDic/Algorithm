package baekjoon_Short;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ShortistCost1916 {
    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        ArrayList<link3>[] list = new ArrayList[1001];
        for(int i = 0; i < 1001; i++) {
            list[i] = new ArrayList<link3>();
        }
        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[Integer.parseInt(st.nextToken())].add(new link3(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        String[] str = br.readLine().split(" ");
        int start = Integer.parseInt(str[0]);
        int end = Integer.parseInt(str[1]);
        int[] distance = new int[1001];
        Arrays.fill(distance, INF);
        distance[start] = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(start);
        while (!pq.isEmpty()) {
            int temp = pq.poll();
            for(int i = 0; i < list[temp].size(); i++) {
                int e = list[temp].get(i).e;
                int c = list[temp].get(i).c;
                if(distance[e] > distance[temp] + c) {
                    distance[e] = distance[temp] + c;
                    pq.offer(e);
                }
            }
        }
        System.out.println(distance[end]);
    }
}
class link3 {
    int e;
    int c;
    link3(int e, int c) {
        this.e = e;
        this.c = c;
    }
}
