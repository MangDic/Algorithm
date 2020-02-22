package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SevenPrincess1941 {
    static String[][] peo = new String[5][5];
    static int[][] visit;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int cnt;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++) {
            String str[] = br.readLine().split("");
            for(int j = 0; j < 5; j++) {
                peo[i][j] = str[j];
            }
        }
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                cnt = 0;
                result = 0;
                visit = new int[5][5];
                back(i, j, 1, peo[i][j]);
            }
        }
        System.out.println(result);
    }
    public static void back(int a, int b, int num, String str) {
        visit[a][b] = 1;
        if(num == 7) {
            for (int i = 0; i < 7; i++) {
                if (str.charAt(i) == 'S') {
                    cnt++;
                }
                if (cnt >= 4) {
                    result++;
                    return;
                }
            }
            cnt = 0;
        }
        else {
            int nx;
            int ny;
            for(int i = 0; i < 4; i++) {
                nx = a + dx[i];
                ny = b + dy[i];
                if(nx >= 0 && nx < 5 && ny >= 0 && ny < 5) {
                    if(visit[nx][ny] == 0) {
                        back(nx, ny, num + 1, str + peo[nx][ny]);
                    }
                }
            }
        }
    }
}
