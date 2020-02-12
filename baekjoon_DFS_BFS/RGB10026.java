package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RGB10026 {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visit;
    static int N;
    static String[][] color;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        color = new String[N][N];
        int cnt1 = 0;
        int cnt2 = 0;
        visit = new boolean[N][N];
        for(int i = 0; i < N; i++) {
            String[] str = br.readLine().split("");
            for(int j = 0; j < N; j++) {
                color[i][j] = str[j];
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visit[i][j]) {
                    cnt1 ++;
                    jungsang(i, j, color[i][j]);
                }
            }
        }
        visit = new boolean[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visit[i][j]) {
                    cnt2 ++;
                    Bjungsang(i, j, color[i][j]);
                }
            }
        }
        System.out.print(cnt1 + " " + cnt2);
    }

    public static void jungsang(int a, int b, String c) {
        visit[a][b] = true;
        String temp = c;
        for(int i = 0; i < 4; i++) {
            int nx = a + dx[i];
            int ny = b + dy[i];
            if(nx >= 0 && nx < N && ny >= 0 && ny < N && color[nx][ny].equals(temp)) {
                if(!visit[nx][ny]) {
                    jungsang(nx, ny, temp);
                }
            }
        }
    }

    public static void Bjungsang(int a, int b, String c) {
        visit[a][b] = true;
        String temp = c;
        for(int i = 0; i < 4; i++) {
            int nx = a + dx[i];
            int ny = b + dy[i];
            if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if(!visit[nx][ny]) {
                    if (temp.equals("R") || temp.equals("G")) {
                        if (color[nx][ny].equals("R") || color[nx][ny].equals("G")) {
                            Bjungsang(nx, ny, temp);
                        }
                    } else {
                        if (temp.equals(color[nx][ny])) {
                            Bjungsang(nx, ny, temp);
                        }
                    }
                }
            }
        }
    }
}
