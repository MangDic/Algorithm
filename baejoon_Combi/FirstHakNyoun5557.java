package baejoon_Combi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstHakNyoun5557 {
    static String[] oper = {"+","-"};
    static int[] num;
    static int N;
    static long cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        num = new int[N];
        for(int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        back(0, num[0], "" + num[0]);
        System.out.println(cnt);
    }
    public static void back(int a, int hap, String str) {
        if(hap > 20 || hap < 0) {
            return;
        }
        if(a == N - 2) {
           if(hap == num[N-1]) {
               System.out.println(str);
               cnt++;
               return;
           }
        }
        else {
            for(int i = 0; i < 2; i++) {
                if(oper[i] == "+") {
                    back(a + 1, hap + num[a + 1], str + " " + oper[i] + " " + num[a+1]);
                }
                else {
                    back(a + 1, hap - num[a + 1], str + " " + oper[i] + " " + num[a+1]);
                }
            }
        }
    }
}
