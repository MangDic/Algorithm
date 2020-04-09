package baekjoon_BinarySearch;

import java.util.*;

public class Knum1300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int Left = 1;
        int Right = k;
        int result = 0;
        while (Left <= Right) {
            int Mid = (Left + Right) / 2;
            int cnt = 0;
            for(int i = 1; i <= N; i++) {
                cnt = cnt + Math.min(Mid / i, N);
            }
            if(cnt < k) {
                Left = Mid + 1;
            }
            else {
                result = Mid;
                Right = Mid - 1;
            }
        }
        System.out.println(result);
    }
}
