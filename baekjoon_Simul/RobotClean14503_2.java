package Simul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RobotClean14503_2 {
    static int[][] matrix;
    static boolean[][] visit;
    static int N;
    static int M;
    static int cnt = 0;
    static int Tcnt = 0;
    static int flag = 0;
    // 방향에 대한 왼쪽
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    // 방향에 대한 후진
    static int[] bx = {1, 0, -1, 0};
    static int[] by = {0, -1, 0, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        matrix = new int[N][M];
        visit = new boolean[N][M];

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        clean(x, y, d);
    }

    public static void clean(int x, int y, int d) {
        int nx = x + dx[d];
        int ny = y + dy[d];
        if(flag == 1) {
            return;
        }
        if(!visit[x][y]) {
            cnt ++;
            visit[x][y] = true;
        }
        if(Tcnt == 4) {
            nx = x + bx[d];
            ny = y + by[d];
            if(chk(nx, ny)) {
                if(matrix[nx][ny] == 1) {
                    System.out.println(cnt);
                    flag = 1;
                    return;
                }
                x = nx;
                y = ny;
                Tcnt = 0;
                clean(x, y, d);
            }
        }

        if (chk(nx, ny)) {
            if (!visit[nx][ny] && matrix[nx][ny] == 0) {
                x = nx;
                y = ny;
                Tcnt = 0;
            }
            else {
                Tcnt ++;
            }
        }

        if (d == 0) {
            d = 3;
        } else {
            d = d - 1;
        }
        clean(x, y, d);
    }

    public static boolean chk(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < M) {
            return true;
        }
        else {
            return false;
        }
    }
}
