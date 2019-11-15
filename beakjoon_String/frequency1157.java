package beakjoon_String;

import java.util.Scanner;

public class frequency1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] chr = N.toCharArray();
        int[] cnt = new int[26];        // String -> Char
        int max = 0;
        int max_stt = 0;
        int max_cnt = 0;

        for(int j = 0; j < 26; j++){
            cnt[j] = 0;
        } // 10 ~ 35
        for(int i = 0; i < N.length(); i++) {
            int x = Character.getNumericValue(chr[i]);
            cnt[x-10] = cnt[x-10] + 1;
        }
        for(int i = 0; i < 26; i++){
            if(cnt[i] > max) {
                max = cnt[i];
                max_stt = i + 65;
                max_cnt = 0;
            }
            else if(cnt[i] == max){
                max_cnt = max_cnt +1;
            }
        }

        if(max_cnt == 0){
            System.out.print((char)max_stt);
        }
        else{
            System.out.print("?");
        }
    }
}
