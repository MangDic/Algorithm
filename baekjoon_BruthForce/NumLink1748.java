package baekjoon_BruthForce;

import java.util.Scanner;

public class NumLink1748 {
    static long result = 0;
    static long b = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        for (int i = 1; i < num.length(); i++) {
            chk(i);
            b = b * 10;
        }
        result = result + num.length()*(Long.parseLong(num) - b/10 + 1);
        System.out.println(result);


    }
    public static void chk(int a) {
        result = result + a*(b - b/10);
    }
}
