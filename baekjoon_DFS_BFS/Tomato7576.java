package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Tomato7576 {

    private static int M;
    private static int N;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {1, -1, 0, 0};
    private static int[][] map;
    private static int day = 0;
    private static Queue<Dot> tomato = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        M = Integer.parseInt(str[0]);
        N = Integer.parseInt(str[1]);
        map = new int[N][M];
        for(int i = 0; i < N; i++) {
            String[] str1 = br.readLine().split(" ");
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(str1[j]);
                if (map[i][j] == 1) {
                    tomato.add(new Dot(i, j));
                }
            }
        }

        while (!tomato.isEmpty()) {
            cycle(tomato.size());
            day ++;
        }
        if(checkEmpty()) {
            System.out.println(day - 1);
        }
        else {
            System.out.println("-1");
        }
    }

    public static void cycle(int a) {
        for(int i = 0; i < a; i++) {
            Dot temp = tomato.poll();
            check(temp.x, temp.y);
        }
    }

    public static void check(int x, int y) {
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= N || ny < 0 || ny >= M)
            {
                continue;
            }
            if(map[nx][ny] == -1) {
                continue;
            }
            if (map[nx][ny] == 0) {
                tomato.add(new Dot(nx, ny));
                map[nx][ny] = 1;
            }
        }
    }

    public static boolean checkEmpty() {
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < M; j ++) {
                if(map[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}

class Dot {
    int x;
    int y;
    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
