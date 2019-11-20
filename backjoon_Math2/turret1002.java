package backjoon_Math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class turret1002 {
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            // st = new StringTokenizer(br.readLine());
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            double r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            double r2 = sc.nextInt();
            double chk = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));

            if(x1 == x2 && y1 == y2){
                if(r1 == r2) {
                    System.out.println("-1");
                }
                else{
                    System.out.println("0");
                }

            }
            else {
                if (chk == r1 + r2) {
                    System.out.println("1");
                }
                if (chk < r1 + r2) {
                    System.out.println("2");
                }
                else {
                    System.out.println("0");
                }
            }

        }
    }
}
