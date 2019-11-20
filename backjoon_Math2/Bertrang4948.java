package backjoon_Math2;

import java.util.Scanner;

public class Bertrang4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }
            for(int i = n + 1; i <= 2*n; i++){
                int divide = 2;
                double root = Math.sqrt(i);
                boolean cnt = true;
                if(i == 1) {
                    cnt = false;
                }

                while(divide <= root) {

                    if(i%divide == 0) {
                        cnt = false;
                        break;
                    }
                    divide++;
                }

                if(cnt == true) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
