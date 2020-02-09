package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DanJi2667 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int N;
    static int[][] apart;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        apart = new int[N][N];
        int danji = 0; // 총 단지수 카운팅
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // 단지마다 집의 수 카운팅 저장
        for(int i = 0; i < N; i++) {
            String[] str = br.readLine().split("");
            for(int j = 0; j < N; j++) {
                apart[i][j] = Integer.parseInt(str[j]);
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(apart[i][j] == 1) {
                    bfs(i,j);
                    pq.add(cnt);
                    cnt = 0;
                    danji ++;
                }
            }
        }
        System.out.println(danji);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
    public static void bfs(int x, int y){
        cnt++;
        apart[x][y] = 0; // 부울린 대신 1을 0으로
        int nextX;
        int nextY;
        for(int i = 0; i < 4; i++) {
            nextX = x + dx[i];
            nextY = y + dy[i];
            if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < N) {
                if (apart[nextX][nextY] == 1) {
                    bfs(nextX,nextY);
                }
            }
        }
    }
}
