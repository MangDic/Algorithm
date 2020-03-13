package baekjoon_BruthForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numbersqare1051 {
    static int N;
    static int M;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        int max;
        int min;
        int chk = 0;
        int flag = 0;
        if(N >= M) {
            max = N;
            min = M;
            map = new int[M][N];
            for(int i = 0; i < N; i++) {
                String[] str1 = br.readLine().split("");
                for (int j = 0; j < M; j++) {
                    map[j][i] = Integer.parseInt(str1[j]);
                }
            }
        }
        else {
            max = M;
            min = N;
            map = new int[N][M];
            for(int i = 0; i < N; i++) {
                String[] str1 = br.readLine().split("");
                for (int j = 0; j < M; j++) {
                    map[i][j] = Integer.parseInt(str1[j]);
                }
            }

        }
        while (flag != 1) {
            for(int i = 0; i < M; i++) {
                if(i > max - min) {
                    min --;
                    break;
                }
                for(int j = 0; j < N; j++) {
                    if(j == max - min) {
                        break;
                    }
                    System.out.println("dx : " + i + " dy : " + j + " min : " + min);
                    if(map[i][j] == map[i][j + min - 1] && map[i][j] == map[i + min - 1][j] && map[i][j] == map[i + min - 1][j + min - 1]) {
                        System.out.println(min*min);
                        flag = 1;
                        break;
                    }
                }
                if(flag == 1) {
                    break;
                }
            }

        }
    }
}
