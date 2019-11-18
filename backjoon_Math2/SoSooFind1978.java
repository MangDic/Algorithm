package backjoon_Math2;

import java.util.Scanner;

public class SoSooFind1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int n = 0;

        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            for(int j = 1; j <= x; j++){
                if(x%j == 0) {
                    n = n + 1;
                }
            }
            if(n==2) {
                cnt = cnt + 1;
            }
            n = 0;
        }
        System.out.println(cnt);
    }
}
