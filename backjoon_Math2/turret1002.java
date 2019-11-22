package backjoon_Math2;

import java.util.Scanner;

public class turret1002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            double r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            double r2 = sc.nextInt();
            double chk = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

            if (x1 == x2 && y1 == y2) {
                if (r1 == r2) {
                    System.out.println("-1");
                } else {
                    System.out.println("0");
                }
            } else {
                if (chk == r1 + r2) {
                    System.out.println("1");
                }
                else if (chk < r1 + r2) {

                    if(chk == Math.abs(r1-r2)) {
                        System.out.println("1");
                    }
                    else if(chk < Math.abs(r1-r2)) {
                        System.out.println("0");
                    }
                    else
                        System.out.println("2");
                } else {
                    System.out.println("0");
                }
            }
        }
    }
}