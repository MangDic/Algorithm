package baekjoon_BackTracking;

import java.util.Scanner;

public class GoodNumber2661 {
    static int N;
    static boolean ch = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        back("");

    }
    public static void back(String b) {
        if(ch) {
            return;
        }
        if(b.length() == N) {
            System.out.println(b);
            ch = true;
            return;
        }
        for(int i = 1; i <= 3; i++) {
            if(cheak(b+i)) {
                back(b+i);
            }
        }

    }
    public static boolean cheak(String str) {
        int len = str.length();
        for(int i = 1; i <= len / 2; i++) {
            String h = str.substring(str.length()-i -i, str.length() - i);
            String t = str.substring(str.length() - i, str.length());

            if(h.equals(t)) {
                return false;
            }
        }

        return true;

    }
}
