package baekjoon_BackTracking;

import java.util.Scanner;

public class WordMath1339_1 {
    static int[] cheak = new int[26]; // 알파벳에 해당하는 숫자
    static int num = 9;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        long result = 0;
        int[] line = new int[N]; // 각 스트링 char at 시작 부분
        String[] word = new String[N];  // 입력받은 각 스트링
        int[] len = new int[N]; // 각 스트링 길이
        String[] hap = new String[N]; // 변환된 스트링 합
        for(int i = 0; i < N; i++) {
            word[i] = sc.next();
            len[i] = word[i].length();
            hap[i] = "";
            if(len[i] > max) {
                max = len[i];
            }
        }
        while (max > 0) {
            for(int i = 0; i < N; i++) {
                if(len[i] == max) {
                    len[i]--;
                    hap[i] = hap[i] + back(word[i].charAt(line[i]));
                    line[i]++;
                }
            }
            max--;
        }
        for(int i = 0; i < N; i++) {
            System.out.println(hap[i]);
        }
        for(int i = 0; i < N; i++) {
            result = result + Long.parseLong(hap[i]);
        }
        System.out.println(result);
    }
    public static int back(char a) {
        if(cheak[(int)(a) - 65] == 0 && num != 0) { // 알파벳에 숫자를 부여 안 했으면 부여
            cheak[(int) a - 65] = num;
            num--;
        }
        return cheak[(int)(a) - 65];
    }
}
