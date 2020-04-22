package baekjoon_Short;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SpecialShort1504_1 {
    static final int INF = Integer.MAX_VALUE;
    static ArrayList<link5>[] list;
    static int N;
    static int[] distance;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        list = new ArrayList[801];
        distance = new int[801];
        clear();
        for(int i = 0; i < 801; i++) {
            list[i] = new ArrayList<link5>();
        }
        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list[s].add(new link5(e, c));
            list[e].add(new link5(s, c));
        }
        String[] str1 = br.readLine().split(" ");
        int start = Integer.parseInt(str1[0]);
        int end = Integer.parseInt(str1[1]);

        int flag = 0;

        distance[1] = 0;
        int temp1 = 0;
        int temp2 = 0;
        find(1);
        if(distance[start] == INF) {
            flag = 1;
        }
        temp1 += distance[start];
        temp2 += distance[end];

        clear();
        distance[start] = 0;
        find(start);
        if(distance[end] == INF) {
            flag = 1;
        }
        temp1 += distance[end];
        temp2 += distance[end];
        temp2 += distance[N];

        clear();
        distance[end] = 0;
        find(end);
        if(distance[N] == INF) {
            flag = 1;
        }
        temp1 += distance[N];

        if(flag == 0) {
            System.out.println(Math.min(temp1, temp2));
        }
        else {
            System.out.println(-1);
        }

    }
    public static void find(int a) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(a);
        while (!pq.isEmpty()) {
            int temp = pq.poll();
            for(int i = 0; i < list[temp].size(); i++) {
                int e = list[temp].get(i).e;
                int c = list[temp].get(i).c;
                if(distance[e] > distance[temp] + c) {
                    distance[e] = distance[temp] + c;
                    pq.add(e);
                }
            }
        }
    }
    public static void clear() {
        Arrays.fill(distance, INF);
    }
}
class link5 {
    int e;
    int c;
    link5(int e, int c) {
        this.e = e;
        this.c = c;
    }
}

