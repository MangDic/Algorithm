package backjoon_Math2;

import java.util.Scanner;

public class GoldBah9020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            boolean cnt = true;

            for (int j = n / 2; j >= 1; j--) {
                int a = n - j;
                int d = 2;

                if (cheak(a) && cheak(j)) {
                    System.out.println(j + " " + a);
                    break;
                }
            }
        }

    }

        public static boolean cheak(int a) {
            int x = a;
            int d = 2;
            boolean chk = true;
            while (d <= a/2) {
                if (a % d == 0) {
                    return false;
                }
                d++;
            }
            return true;
        }

    }
