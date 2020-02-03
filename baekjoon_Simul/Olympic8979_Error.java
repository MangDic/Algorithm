package Simul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Olympic8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int[] na = new int[N];
        int[] rank = new int[N];
        int[][] score = new int[N][4];
        for(int i = 0; i < N; i++) {
            rank[i] = 1;
        }
        for(int i = 0; i < N; i++) {
            String[] str1 = br.readLine().split(" ");
            na[i] = Integer.parseInt(str1[0]); // 국가
            score[i][1] = Integer.parseInt(str1[1]); // 금메달
            score[i][2] = Integer.parseInt(str1[2]); // 은메달
            score[i][3] = Integer.parseInt(str1[3]); // 동메달
        }
        for(int i=0; i<na.length; i++){
            rank[i] = 1;
            for (int j = 0; j < na.length; j++) {
                if(score[i][1]<score[j][1]){ // 금메달이 많으면 ++
                    rank[i]++;
                }
                else if(score[i][1] == score[j][1]) {
                    if(score[i][2] < score[j][2]) { // 금메달이 같고 은메달이 많으면 ++
                        rank[i]++;
                    }
                    else if(score[i][2] == score[j][2]) {
                        if(score[i][3]<score[j][3]) { // 금메달, 은메달이 같고 동메달이 많으면 ++
                            rank[i]++;
                        }
                    }
                }
            }
        }
        System.out.println(rank[M-1]);
        for(int i = 0; i < N; i++) {
            System.out.println("국가 : " + na[i] + " 점수 : " + score[i][1] + " " + score[i][2] + " " + score[i][3] + " " + " 순위 : " + rank[i]);
        }
    }
}
