package baekjoon_BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class WordMath1339 {
        static int[] alphabet = new int[26]; // 알파벳에 해당하는 숫자
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int value = 9;
            int ans = 0;

            for (int i = 0; i < N; i++) {
                char[] array = sc.next().toCharArray();
                int pos = (int) Math.pow(10, array.length - 1);
                for (int j = 0; j < array.length; j++) {
                    alphabet[array[j] - 'A'] += pos;
                    pos /= 10;
                }
            }
            Arrays.sort(alphabet);
            for (int i = alphabet.length - 1; i > -1; i--) {
                if (value == 0) {
                    break;
                }
                ans += alphabet[i] * value--;
            }
            System.out.println(ans);
        }
}
