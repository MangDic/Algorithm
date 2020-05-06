package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeBridge2146 {
    static int[][] map;
    static boolean[][] visit;
    static boolean[][] visit1;
    static int N;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int city = 0;
    static int cnt = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visit[i][j] && map[i][j] == 1) {
                    city ++;
                    bfs(i, j);
                }
            }
        }
        visit = new boolean[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visit[i][j] && map[i][j] != 0) {
                    visit1 = new boolean[N][N];
                    chk(i, j, map[i][j], 0);
                }
            }
        }
        System.out.println(cnt);
    }
    public static void bfs(int x, int y) {
        visit[x][y] = true;
        map[x][y] = city;
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if(!visit[nx][ny] && map[nx][ny] == 1) {
                    bfs(nx, ny);
                }
            }
        }
    }
    public static void chk(int x, int y, int start, int temp) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if(cnt < temp) {
                    return;
                }
                if (map[nx][ny] != 0 && map[nx][ny] != start) {
                    cnt = Math.min(cnt, temp);
                    return;
                }
                if (!visit1[nx][ny]) {
                    if (map[nx][ny] != start) {
                        visit1[nx][ny] = true;
                        chk(nx, ny, start, temp + 1);
                        visit1[nx][ny] = false;
                    }
                }
            }
        }
    }
}
