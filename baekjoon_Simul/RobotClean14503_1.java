package Simul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RobotClean14503_1 {
    // 방향에 대한 왼쪽
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    // 방향에 대한 후진
    static int[] bx = {1, 0, -1, 0};
    static int[] by = {0, -1, 0, 1};
    static int[][] matrix;
    // 청소 카운트
    static int cnt = 0;
    // 회전 카운트 4 면 후진
    static int turn = 0;
    static int N;
    static int M;
    static int flag = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        String[] str1 = br.readLine().split(" ");
        int x = Integer.parseInt(str1[0]);
        int y = Integer.parseInt(str1[1]);
        // 진행 방향 : d
        int d = Integer.parseInt(str1[2]);
        matrix = new int[N][M];
        for(int i = 0; i < N; i++) {
            String[] map = br.readLine().split(" ");
            for(int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(map[j]);
            }
        }
        clean(x, y, d);
    }
    public static void clean(int x, int y, int d) {
        if(matrix[x][y] == 0) {
            matrix[x][y] = 1;
            cnt++;
        }
        // 진행방향 왼쪽 좌표
        int nx = x + dx[d];
        int ny = y + dy[d];
        if(turn == 4) {
            // 회전 카운트 4면 후진
            int backX = x + bx[d];
            int backY = y + by[d];
            if(backX >= 0 && backX < N && backY >=0 && backY < M) {
                turn = 0;
                clean(backX, backY, d);
            }
            else {
                // 후진할 수 없으면 카운트 프린트 후 종료
                System.out.println(cnt);
                flag = 1;
            }
        }
        if(nx >= 0 && nx < N && ny >= 0 && ny < M) {
            if(matrix[nx][ny] == 0) {
                // 왼쪽 좌표 값이 0이면 회전 시키고 호출
                if(d == 0) {
                    d = 3;
                }
                else {
                    d = d - 1;
                }
                turn = 0;
                clean(nx, ny, d);
            }
            else {
                if (flag == 1) {
                    return;
                } else {
                    if (d == 0) {
                        d = 3;
                    } else {
                        d = d - 1;
                    }
                    turn += 1;
                    if (flag == 1) {
                        return;
                    }
                    clean(x, y, d);
                }
            }
        }
        else {
            if (flag == 1) {
                return;
            } else {
                if (d == 0) {
                    d = 3;
                } else {
                    d = d - 1;
                }
                turn += 1;
                clean(x, y, d);
            }
        }
    }
}
