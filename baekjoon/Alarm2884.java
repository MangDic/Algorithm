package baekjoon;

import java.util.Scanner;

public class Alarm2884 {
    public static void main(String[] args) {
        int H, M;
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        M = sc.nextInt();
        if(H==0 && M<45) {
            int Con = (24 * 60 + M) - 45;
            int a = Con / 60;
            int b = (Con - a * 60);
            System.out.print(a + " " + b);
        }

        else {
            int Con = (H * 60 + M) - 45;
            int a = Con / 60;
            int b = (Con - a * 60);
            System.out.print(a + " " + b);
        }

    }
}
