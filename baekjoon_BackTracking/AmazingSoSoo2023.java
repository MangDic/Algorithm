package baekjoon_BackTracking;

import java.util.Scanner;

public class AmazingSoSoo2023 {
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        back(0, "");
    }

    public static void back(int a, String str) {
        if (a == N) {
            System.out.println(str);
        }
        else {
            for (int i = 1; i <= 9; i++) {
                if(!cheak(str + i)) {
                    continue;
                }
                else {
                    back(a + 1, str + i);
                }
            }
        }
    }

    public static boolean cheak(String a) {
        int cnt = 0;
        if (a.equals("") || a.equals("1") || cnt >= 2) {
            return false;
        }
        for (int i = 1; i <= Math.sqrt(Integer.parseInt(a)); i++) {
            if (Integer.parseInt(a) % i == 0) {
                cnt++;
            }
        }
        if (cnt == 1) {
            return true;
        }
        return false;
    }
}
