package backjoon_Math2;

import java.util.Scanner;

public class SoSooHapMin2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int cnt = 0;
        int hap = 0;
        int min = 0;

        for(int i = N; i <= M; i++) {
            for(int j = 1; j <= i; j++) {
                if(i%j == 0){
                    cnt = cnt + 1;
                }
            }
            if(min == 0 && cnt == 2){
                min = i;
            }
            if(cnt == 2){
                hap = hap + i;
            }
            cnt = 0;
        }

        if(hap == 0) {
            System.out.println("-1");
        }
        else {
            System.out.println(hap);
            System.out.println(min);
        }

    }
}
