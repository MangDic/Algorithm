package baejoon_Combi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SanCheack5573 {
    static int[][] map;
    static double N;
    static int H;
    static int W;
    static int nx;
    static int ny;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        H = Integer.parseInt(str[0]);
        W = Integer.parseInt(str[1]);
        N = Double.parseDouble(str[2]);
        map = new int[H + 1][W + 1];
        for(int i = 1; i <= H; i++) {
            String[] str1 = br.readLine().split(" ");
            for(int j = 1; j <= W; j++) {
                map[i][j] = Integer.parseInt(str1[j-1]);
            }
        }
        for(int i = 0; i < N; i++) {
            back(1, 1);
            if (i == N - 1) {
                System.out.println(nx + " " + ny);
            }
        }
    }
    public static void back(int x, int y) {
        if(x == H + 1 || y == W + 1) {
            return;
        }
        if(map[x][y] == 1) {
            nx = x;
            ny = y + 1;
            map[x][y] = 0;
        }
        else {
            ny = y;
            nx = x + 1;
            map[x][y] = 1;
        }
        back(nx, ny);
    }
}
