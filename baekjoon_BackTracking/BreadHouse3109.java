package baekjoon_BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreadHouse3109 {
    static int R, C;
    static int[][] map;
    static int[] dx = {-1, 1, 0};
    static int[] dy = {1, 1, 1};
    static int cnt = 0;
    static int plag;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        R = Integer.parseInt(str[0]);
        C = Integer.parseInt(str[1]);
        map = new int[R][C];
        for (int i = 0; i < R; i++) {
            String[] str1 = br.readLine().split("");
            for (int j = 0; j < C; j++) {
                if (str1[j].equals(".")) map[i][j] = 0;
                else map[i][j] = 1;
            }
        }
        for (int i = 0; i < R; i++) {
            plag = 0;
            back(i, 0);
        }
        System.out.println(cnt);
    }

    public static void back(int a, int b) {
        map[a][b] = 1;
        int nx;
        int ny;
        if (b == C - 1 && plag == 0) {
            cnt++;
            plag = 1;
            return;
        }
        for (int i = 0; i < 3; i++) {
            nx = a + dx[i];
            ny = b + dy[i];
            if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                if (map[nx][ny] == 0) {
                    if (plag == 0) {
                        back(nx, ny);
                    }
                }
                else return;
            }
        }
    }
}
