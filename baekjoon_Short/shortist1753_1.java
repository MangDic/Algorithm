package baekjoon_Short;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class shortist1753_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int V = Integer.parseInt(str[0]);
        int E = Integer.parseInt(str[1]);
        int Start = Integer.parseInt(br.readLine());
        boolean[] visit = new boolean[V+1];
        int[] distance = new int[V+1];
        ArrayList<link>[] matrix = new ArrayList[V+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        for(int i = 0; i <= V; i++) {
            matrix[i] = new ArrayList<link>();
        }
        for(int i = 0; i < E; i++) {
            String[] str1 = br.readLine().split(" ");
            matrix[Integer.parseInt(str1[0])].add(new link(Integer.parseInt(str1[1]), Integer.parseInt(str1[2])));
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(Start);
        distance[Start] = 0;
        while (!pq.isEmpty()) {
            int temp = pq.poll();
            visit[temp] = true;
            for(int i = 0; i < matrix[temp].size(); i++) {
                int de = matrix[temp].get(i).end;
                int dv = matrix[temp].get(i).value;
                if(distance[de] > distance[temp] + dv) {
                    distance[de] = Math.min(distance[de],distance[temp] + dv);
                    pq.add(de);
                }
            }
        }
        for(int i = 1; i <= V; i++) {
            if(visit[i] == true) {
                System.out.println(distance[i]);
            }
            else {
                System.out.println("INF");
            }
        }


    }
}
class link {
    int end;
    int value;
    link(int end, int value) {
        this.end = end;
        this.value = value;
    }
}
