package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RainSafe2468 {
    static int N;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visit = new boolean[N][N];
        map = new int[N][N];
        int maxH = 0;
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] > maxH) {
                    maxH = map[i][j];
                }
            }
        }
        int cnt = 0;
        int max = 0;
        for(int k = 1; k <= maxH; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visit[i][j] && map[i][j] >= k) {
                        bfs(k, i, j);
                        cnt++;
                    }
                }
            }
            max = Math.max(max, cnt);
            cnt = 0;
            visit = new boolean[N][N];
        }
        /*for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(visit[i][j]) {
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }*/
        System.out.println(max);
    }
    public static void bfs(int high, int x, int y) {
        visit[x][y] = true;
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if(!visit[nx][ny] && map[nx][ny] >= high) {
                    bfs(high, nx, ny);
                }
            }
        }
    }
}
