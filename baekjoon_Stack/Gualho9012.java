package baekjoon_Math3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gualho9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str;
        for(int i = 0; i < N; i++) {
            str = br.readLine();
            chk(str);
        }
    }
    public static void chk(String a) {
        int cnt = 0;
        String[] str = a.split("");
        if(a.length()%2 != 0) {
            System.out.println("NO");
        }
        else {
            for (int i = 0; i < str.length; i++) {
                if(cnt < 0) {
                    break;
                }
                if(str[i].equals("(")) {
                    cnt = cnt + 1;
                }
                else {
                    cnt = cnt -1;
                }
            }
            if(cnt == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
