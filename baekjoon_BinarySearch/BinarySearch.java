package baekjoon_BinarySearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Wifi2110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Key = sc.nextInt();
        int[][] num = new int[N][2];
        for (int i = 0; i < N; i++) {
            num[i][0] = sc.nextInt();
            num[i][1] = i;
        }
        Arrays.sort(num, new Comparator<int[]>() {
            @Override
            public int compare(final int[] o1, final int[] o2) {
                final int n1 = o1[0]; // 뒤에 값 비교하고 싶으면 0 대신 1
                final int n2 = o2[0];
                return Integer.compare(n1, n2);
            }
        });
        int Left = 0;
        int Right = N - 1;
        int Mid;
        while (Left <= Right) {
            Mid = (Left + Right) / 2;
            if (num[Mid][0] == Key) {
                System.out.println((num[Mid][1] + 1) + " 번 째 확인 !");
                break;
            }
            if (num[Mid][0] > Key) {
                Right = Mid - 1;
            } else {
                Left = Mid + 1;
            }
        }
    }
}
